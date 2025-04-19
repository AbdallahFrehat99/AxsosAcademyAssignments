from django.db import models

class Dojo(models.Model):
    name = models.CharField(max_length=255)
    city = models.CharField(max_length=255)
    state = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


class Ninja(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    dojo_id = models.ForeignKey(Dojo, related_name="ninjas", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

def create_dojo(added_dojo):
    Dojo.objects.create(name=added_dojo['name'], city=added_dojo['city'], state=added_dojo['state'])


def create_ninja(added_ninja):
    this_dojo=Dojo.objects.get(id = added_ninja['dojo'])
    Ninja.objects.create(first_name=added_ninja['first_name'], last_name=added_ninja['last_name'], dojo_id=this_dojo)