from django.urls import path
from . import views
urlpatterns = [
        path('', views.index ),
        path('add_book',views.add_book),
        path('author',views.author),
        path('add_author',views.add_author),
        path('books/<int:bookid>',views.book_details),
        path('authors/<int:authorid>',views.author_details),
        path('connect_with_author/<int:authorid>',views.connect_with_author),
        path('books/connect_with_book/<int:bookid>',views.connect_with_book)
]



