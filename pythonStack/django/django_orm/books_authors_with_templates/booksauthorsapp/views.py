from django.shortcuts import render, redirect
from . import models
def index(request):    
    context={
        'books':models.Book.objects.all()
    }
    return render(request,'book.html',context)

def add_book(request):
    models.Book.create_book(request.POST)
    return redirect('/')

def author(request):
    context={
        'authors':models.Author.objects.all()
    }
    return render(request,'author.html',context)

def add_author(request):
    models.Author.create_author(request.POST)
    return redirect('/author')
