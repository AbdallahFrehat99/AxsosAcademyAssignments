from django.db import models

# Create your models here.
class User(models.Model):
    name=models.CharField(max_length=255)
    email=models.CharField(max_length=255)
    age=models.IntegerField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)


def create_user(added_user):
    full_name=added_user['first_name'] + added_user['last_name']
    User.objects.create(name=full_name, email=added_user['email'], age=added_user['age'])