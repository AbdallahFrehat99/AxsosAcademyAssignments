from django.urls import path
from . import views
urlpatterns = [    
    path('', views.index),  # Root path
    path('earngold',views.earngold),
    path('destroy',views.destroy)
    ]