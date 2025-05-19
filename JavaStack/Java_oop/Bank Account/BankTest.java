public class BankTest {
    
    public static void main(String[] args) {
    // Create 3 bank accounts
        BankAccount account1 = new BankAccount(10000, 15000);
        BankAccount account2 = new BankAccount(20000, 25000);
        BankAccount account3 = new BankAccount(30000, 35000);
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit(5000, "checkingBalance");
        account1.deposit(5000, "savingsBalance");
        
        
        account2.deposit(1000, "checkingBalance");
        account2.deposit(1000, "savingsBalance");

        
        account3.deposit(15000, "checkingBalance");
        account3.deposit(15000, "savingsBalance");
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.withdraw(5000, "checkingBalance");
        account1.withdraw(5000, "savingsBalance");

        account2.withdraw(1000, "checkingBalance");
        account2.withdraw(1000, "savingsBalance");

        account3.withdraw(15000, "checkingBalance");
        account3.withdraw(15000, "savingsBalance");

        System.out.println("The total amount for the account: $"+account1.getBalance());
        System.out.println("The total amount for the account: $"+account2.getBalance());
        System.out.println("The total amount for the account: $"+account3.getBalance());



        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getAccounts() +"\n"+BankAccount.getTotalMoney());
    }
}
