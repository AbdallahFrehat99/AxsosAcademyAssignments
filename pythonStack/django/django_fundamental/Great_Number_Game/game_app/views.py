from django.shortcuts import render,redirect
from django.http import HttpResponse
import random
def index(request):    
    if 'randN' not in request.session:
        request.session['randN']=random.randint(1, 100)
    if 'res' not in request.session:
        request.session['res']=''

    return render(request,'index.html')

def guess(request):
    if request.POST['entered-num']:
        number=request.POST['entered-num']
        if int(number) >request.session['randN']:
            request.session['res']='high'
            return redirect('/')
        elif int(number) <request.session['randN']:
            request.session['res']='low'
            return redirect('/')
        elif int(number) == request.session['randN']: 
            request.session['res']='correct'
            return redirect('/')
    else:
        return redirect('/')

def delete(request):
    request.session.clear()
    return redirect('/')
def again(request):
    del request.session['randN']
    del request.session['res']
    return redirect('/')