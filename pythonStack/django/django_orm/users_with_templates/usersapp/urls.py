from django.urls import path
from . import views
urlpatterns = [    
    path('', views.index ),  # Root path
    path('adduser',views.add_user)
    ]
