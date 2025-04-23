from django.db import models

# Create your models here.
class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        # add keys and values to errors dictionary for each invalid field
        if len(postData['title']) < 3:
            errors["title"] = "title should be at least 2 characters"
        if len(postData['network']) < 3:
            errors["network"] = "network should be at least 3 characters"
        if len(postData['description']) < 10:
            errors["description"] = "description should be at least 10 characters"

        return errors



class Show(models.Model):
    title=models.CharField(max_length=255)
    network=models.CharField(max_length=255)
    release_date=models.DateField()
    description=models.TextField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
    objects= ShowManager() 
    
    def show_all():
        return Show.objects.all()
    

    def create_show(show):
        new_show=Show.objects.create(title=show['title'],network=show['network'],release_date=show['release_date'],description=show['description'])
        return new_show.id
    
    def get_show(id):
        return Show.objects.get(id=id)
    
    def update_show(new_info,id):
        show = Show.objects.get(id=id)
        show.title=new_info['title']
        show.network=new_info['network']
        show.release_date=new_info['release_date']
        show.description=new_info['description']
        show.save()
    def delete_show(info,id):
        deleted_show=Show.objects.get(id=id)
        deleted_show.delete()
        
