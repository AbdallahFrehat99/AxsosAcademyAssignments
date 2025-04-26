from django.shortcuts import render, redirect
from . import models
from django.contrib import messages
import bcrypt

# Create your views here.
def index(request):    
    return render(request,"login_and_registration.html")


def register(request):
    if request.method == 'POST':
        errors = models.User.objects.basic_validator(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return render(request,"login_and_registration.html")
        else:
            user_id=models.User.create_user(request.POST)

            id=models.User.get_user(user_id)
            request.session['name'] = id.name
            return redirect('/success')
    else:
        return render(request,"login_and_registration.html")

def welcome(request):
    if request.session['name']:
        context={
            'loged_in_user':request.session['name']
        }
        return render(request,'welcome.html',context)
    else:
        return redirect('/')
    
def login(request):
    if request.method == 'POST':
        email = request.POST['email']
        password = request.POST['password']
        loged_in_user=models.User.check_loged_user(request,email,password)
        if loged_in_user['user']:
            if loged_in_user['password']:
                return redirect('/success')
            else:
                messages.error(request, "Incorrect password.")
        else:
            messages.error(request, "Email not registered.")   
        return redirect('/')
    else:
        return redirect('/')


def logout(request):
    del request.session['name']
    return redirect('/')
