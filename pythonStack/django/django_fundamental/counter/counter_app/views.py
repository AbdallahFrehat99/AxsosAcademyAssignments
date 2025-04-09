from django.shortcuts import render,redirect

# Create your views here.
def index(request):
    if 'count' not in request.session and "visited" not in request.session :
        request.session['count']=0
        request.session['visited']=0
    else:
        
        request.session['count']+=1
        request.session['visited']+=1

    context={
        'count':request.session['count'],
        'visited':request.session['visited']
    }

    return render(request,'index.html',context)
def destroy(request):
    request.session.clear()
    return redirect('/')

def reset(request):
    request.session.clear()
    return redirect('/')

def add_two(request):
    request.session['count']+=1
    return redirect('/')

def add_by_user(request):
        
        request.session['count']+=int(request.POST['enterd_value'])-1
        return redirect('/')
