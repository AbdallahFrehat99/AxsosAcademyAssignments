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

def book_details(request,bookid):
    context={
        'books':models.Book.get_book(bookid),
        'authors':models.Author.objects.all(),#exclude
        'connections':models.Author.get_authors(bookid)
    }
    return render(request,'book_details.html',context)

def author_details(request,authorid):
    context={
        'author':models.Author.get_author(authorid),
        'books':models.Book.objects.all(),#exclude
        'connections':models.Book.get_books(authorid)
    }
    return render(request,'author_details.html',context)

def connect_with_author(request,authorid):
    models.Author.make_connection(request.POST['bookid'],authorid)
    return redirect('/author')

def connect_with_book(request,bookid):
    models.Author.make_connection(bookid,request.POST['authorid'])
    return redirect('/')
    