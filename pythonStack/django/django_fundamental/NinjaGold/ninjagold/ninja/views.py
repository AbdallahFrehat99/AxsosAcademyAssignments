from django.shortcuts import render,redirect
import random
from django.http import HttpResponse
from datetime import datetime
def index(request):
    if 'gold' not in request.session and 'activities' not in request.session:
        request.session['gold']=0
        request.session['activities']=[]
        request.session['red']='red'
        request.session['green']='green'
    return render(request,'index.html')
def earngold(request):
    now = datetime.now()
    timestamp = now.strftime("(%B %d, %Y %#I:%M %p)")
    if request.method=='POST' and request.POST['place'] == 'quest':
        formPlace=request.POST['place']
        gold_earned=random.randint(-50,50)
        if gold_earned >= 0:
            message=f"you entered a {formPlace} and earned {gold_earned} gold.{timestamp}"
        else:
            message=f"you entered a {formPlace} and lost {gold_earned} gold.{timestamp}"

    elif request.method=='POST':
        formPlace=request.POST['place']
        gold_earned=random.randint(10,20)
        message=f"you entered a {formPlace} and earned {gold_earned} gold.{timestamp}"

    request.session['gold'] +=gold_earned
    request.session['activities'].insert(0,message)
        
    return redirect('/')
def destroy(request):
    del request.session['gold']
    del request.session['activities']
    return redirect('/')