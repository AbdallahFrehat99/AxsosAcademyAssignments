def basic():
    for i in range(151):
        print(i)
# basic()
def multiples_of_five():
    for i in range(5,1001,5):
        print(i)
# multiples_of_five()
def counting_dojo():
    for i in range(1,101):
        if(i%10 == 0 ):
            print("Coding Dojo")
        elif (i%5 == 0 ):
            print("Coding")
        else:
            print(i)
# counting_dojo()
def whoa():
    sum=0
    for i in range(500001):
        if(i%2 ==1):
            sum+=i
    print(sum)
# whoa()
def countdown_by_four():
    for i in range (2018,0,-4):
        print(i)
# countdown_by_four()
def flexible_counter():
    lowNum=2
    highNum=9
    mult=3
    for i in range(lowNum,highNum+1):
        if(i%mult ==0 ):
            print(i)
flexible_counter()