public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
        totalMoney += checkingBalance + savingsBalance;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public void deposit(double amount, String accountType) {
        if (accountType == "checkingBalance") {
            checkingBalance += amount;
        } else if (accountType == "savingsBalance") {
            savingsBalance += amount;
        } else {
            System.out.println("Invalid account type");
        }
        totalMoney += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType == "checkingBalance") {
            if(checkingBalance>amount){
                checkingBalance -= amount;
            }else{
                System.out.println("Insufficient funds");
            }
            
        } else if (accountType == "savingsBalance") {
            if(savingsBalance>amount){
                savingsBalance -= amount;
            }else{
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Invalid account type");
        }
        totalMoney -= amount;
    }

    public double getBalance(){
        return checkingBalance+ savingsBalance;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    // account
    // withdraw
    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}