from django.urls import path
from . import views
urlpatterns = [    
    path('', views.index),  # Root path
    path('register',views.register),
    path('success',views.welcome),
    path('login',views.login),
    path('logout',views.logout)
]