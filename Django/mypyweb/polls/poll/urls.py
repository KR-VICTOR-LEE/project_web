from django.urls import path
from poll import views

urlpatterns = [
    path("", views.index),
    path("test/", views.test),
]