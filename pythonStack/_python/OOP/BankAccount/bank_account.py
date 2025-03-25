class BankAccount:
    def __init__(self, balance=0,int_rate=1):
        self.balance=balance
        self.int_rate=int_rate/100

    def deposit(self,amount):
        self.balance+=amount
        return self
    
    def withdrawal(self,amount):
        if(self.balance-amount<0):
            self.balance-=5
            print("Insufficient funds: Charging a $5 fee")
            return
        else:
            self.balance-=amount
        return self

    def display_account_info(self):
        print(f"balance:{self.balance}")
        return self
    def yield_interest(self):
        if(self.balance>0):
            self.balance=self.balance + self.balance * self.int_rate
        return self
first_acount=BankAccount(1000,20)
second_acount=BankAccount(10000,15)
first_acount.deposit(500).deposit(500).deposit(500).withdrawal(500).yield_interest().display_account_info()
second_acount.deposit(500).deposit(500).withdrawal(250).withdrawal(250).withdrawal(250).withdrawal(250).yield_interest().display_account_info()
