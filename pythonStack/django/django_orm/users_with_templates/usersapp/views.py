from django.shortcuts import render,redirect
from . import models
def index(request):
    context={
        "users":models.User.objects.all()
    }    
    return render(request,"index.html",context)

def add_user(request):
    models.create_user(request.POST)
    return redirect('/')