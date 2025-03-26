class MathDojo:
    def __init__(self):
        self.result=0
    def add(self,num,*nums):
        for i in range(len(nums)):
            self.result += nums[i]
        self.result+=num
        return self
    def sub(self,num,*nums):
        self.result -= num + sum(nums)
        return self    

md = MathDojo()
y = md.add(10).sub(1, 2, 3).add(4, 5).result
print(y)
