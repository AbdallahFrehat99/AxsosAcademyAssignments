def biggie_size(arr):
    for i in range(len(arr)):
        if(arr[i]>0):
            arr[i]="big"
    return arr
# print(biggie_size([-1,-1,-2,4,4,5,6,6]))
def count_positive(arr):
    count=0
    for i in range(len(arr)):
        if(arr[i]>0):
            count+=1
    arr[len(arr)-1]=count
    return arr
# print(count_positive([1,6,2,3,-1,-1,-1,-1,-1]))
def sum_total(arr):
    sum=0
    for i in range(len(arr)):
        sum+=arr[i]
    return sum
# print(sum_total([1,2,3,4,-3]))
def average(arr):
    sum=0
    for i in range(len(arr)):
        sum+=arr[i]
    return sum/len(arr)
# print(average([1,2,3,4]))
def length(arr):
    return len(arr)
# print(length([1,2,3,4]))
def minimum(arr):
    if(len(arr)==0):
        return False
    min=arr[0]
    for i in range(len(arr)):
        if(arr[i]<min):
            min = arr[i]
    return min
# print(minimum([37,2,3,5]))
def maximum(arr):
    if(len(arr)==0):
        return False
    max=arr[0]
    for i in range(len(arr)):
        if(arr[i]>max):
            max = arr[i]
    return max
# print(maximum([37,2,3,55]))
def ultimate_analysis(arr):
    everything={'sumTotal': sum_total(arr), 'average': average(arr), 'minimum': minimum(arr), 'maximum': maximum(arr), 'length': length(arr)}
    return everything
# print(ultimate_analysis([37,2,1,-9]))
def revers_list(arr):
    for i in range (int(len(arr)/2)):
        arr[i],arr[len(arr)-i-1]=arr[len(arr)-i-1],arr[i]
    return arr
# print(revers_list([1,2,3,4,5]))
