from django.db import models
import bcrypt
import re
# Create your models here.
class UserManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['first_name']) < 2:
            errors["first_name"] = "First name must be at least 2 characters."
        if not postData['first_name'].isalpha():
            errors["first_name"] = "First name must contain letters only."

        if len(postData['last_name']) < 2:
            errors["last_name"] = "Last name must be at least 2 characters."
        if not postData['last_name'].isalpha():
            errors["last_name"] = "Last name must contain letters only."

        EMAIL_REGEX = re.compile(r'^[\w\.-]+@[\w\.-]+\.\w+$')
        if not postData['email'].strip():
            errors["email"] = "Email is required."
        if not EMAIL_REGEX.match(postData['email']):
            errors["email"] = "Invalid email address."

        if len(postData['password']) < 8:
            errors["password"] = "Password must be at least 8 characters."
        if postData['password'] != postData['confirm_password']:
            errors["confirm_password"] = "Password and confirmation do not match."
        return errors
    

class User(models.Model):
    name=models.TextField(max_length=255)
    email=models.EmailField()
    password=models.TextField(max_length=255)
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
    objects = UserManager()

    def create_user(post):
        password = post['password']
        pw_hash = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
        name = post['first_name'] + post['last_name']
        new_user= User.objects.create(name = name , email = post['email'], password=pw_hash)
        return new_user.id
    
    def get_user(id):
        return User.objects.get(id=id)
    
    def check_loged_user(request,email,password):
        login={
            'user':False,
            'password':False
        }
        users = User.objects.filter(email=email)
        if users:
            login['user']=True
            user = users[0]
            if bcrypt.checkpw(password.encode(), user.password.encode()):
                request.session['user_id'] = user.id
                request.session['name'] = user.name
                login['password']=True
        return login
