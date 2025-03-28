import random
def randInt(min=0   , max= 100  ):
    if(min>max):
        return ("min cannot be grater than max")
    if(max<0):
        return ("max shouldnt be negative")
 
    num = random.random()*(max-min)+min
    return num.__round__()
print(randInt())             # should print a random integer between 0 to 100
print(randInt(max=50))         # should print a random integer between 0 to 50
print(randInt(min=50))         # should print a random integer between 50 to 100
print(randInt(min=50, max=500))    # should print a random integer between 50 and 500