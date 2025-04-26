from django.db import models

# Create your models here.
class Book(models.Model):
    title = models.CharField(max_length=255)
    description=models.TextField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)

    def create_book(book_to_create):
        Book.objects.create(title=book_to_create['title'],description=book_to_create['description'])
    
    def get_book(bookid):
        return Book.objects.get(id=bookid)
    
    def get_books(authorid):
        my_author=Author.objects.get(id=authorid)
        return my_author.books.all()

class Author(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    notes=models.TextField()
    books=models.ManyToManyField(Book,related_name="authors")
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)

    def create_author(author_to_create):
        Author.objects.create(first_name=author_to_create['first_name'],last_name =author_to_create['last_name'],notes=author_to_create['notes'])

    def get_author(authorid):
        return Author.objects.get(id=authorid)
    
    def make_connection(bookid,authorid):
        my_book=Book.objects.get(id=bookid)
        my_author=Author.objects.get(id=authorid)
        my_author.books.add(my_book)

    def get_authors(bookid):
        my_book=Book.objects.get(id=bookid)
        return my_book.authors.all()