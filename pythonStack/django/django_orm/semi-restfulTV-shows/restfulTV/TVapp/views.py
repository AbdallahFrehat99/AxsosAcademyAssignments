from django.shortcuts import render,redirect
from . import models
from django.contrib import messages
from .models import Show
# Create your views here.
def index(request):
        context={
              'shows':models.Show.show_all()
        }
        return render(request,"read_all.html",context)




##################################################################
def add_show_template(request):
        return render(request,'create.html')


def add_show(request):
        if request.method == 'POST':
            errors = models.Show.objects.basic_validator(request.POST)
            if len(errors) > 0:
                  for key, value in errors.items():
                        messages.error(request, value)
                  return redirect('/shows/new')
            else:
                  id=models.Show.create_show(request.POST)
                  return redirect(f'/shows/{id}')
        else:
            return render(request,'create.html')

##################################################################

def show_details(request,id):
      context={
            'show':models.Show.get_show(id)
      }

      return render(request,'read_one.html',context)



def edit(request,id):
      context={
            'show':models.Show.get_show(id)
      }        
      return render(request,'update.html',context)




def update(request,id):
      if request.method == 'POST':
            errors = models.Show.objects.basic_validator(request.POST)
            if len(errors) > 0:
                  for key, value in errors.items():
                        messages.error(request, value)
                  return redirect(f'/shows/{id}/edit')
            else:
                  models.Show.update_show(request.POST,id)
                  return redirect('/')



def delete(request,id):
      models.Show.delete_show(request.POST,id)
      return redirect('/')
