from django.urls import path
from . import views
urlpatterns = [
        path('', views.index ),  # Root path
        path('shows',views.index),
        path('shows/new',views.add_show_template),
        path('shows/create',views.add_show),
        path('shows/<int:id>',views.show_details),
        path('shows/<int:id>/edit',views.edit),
        path('shows/<int:id>/update',views.update),
        path('shows/<int:id>/destroy',views.delete)

]