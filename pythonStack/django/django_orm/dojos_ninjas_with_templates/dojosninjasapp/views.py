from django.shortcuts import render, redirect
from django.http import HttpResponse
from . import models

def index(request):
    context={
        "dojos":models.Dojo.objects.all()
    }
    return render(request,"index.html",context)

def add_dojo(request):
    models.create_dojo(request.POST)
    return redirect('/')

def add_ninja(request):
    models.create_ninja(request.POST)
    return redirect('/')