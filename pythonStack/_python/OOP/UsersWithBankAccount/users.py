from bank_account import BankAccount
class User:
    def __init__(self,name,balance,int_rate):
        self.name=name
        self.account=BankAccount(balance,int_rate)

    def display_account_info(self):
        print(f"name: {self.name}balance:{self.account.balance}")
        return self
    
abd =User("abdallah",1000,1)
print(abd.account.int_rate)

