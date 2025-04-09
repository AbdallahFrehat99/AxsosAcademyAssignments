from django.urls import path
from . import views

urlpatterns=[
    path('', views.index),
    path('destroy',views.destroy),
    path('reset',views.reset),
    path('addtwo',views.add_two),
    path('addbyuser',views.add_by_user)
]