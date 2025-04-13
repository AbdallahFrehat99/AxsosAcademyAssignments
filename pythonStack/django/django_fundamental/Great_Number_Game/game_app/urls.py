from django.urls import path
from . import views
urlpatterns = [    
    path('', views.index),  # Root path
    path('guess',views.guess),
    path('delete',views.delete),
    path('again',views.again)
    ]