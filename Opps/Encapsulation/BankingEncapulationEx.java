package Encapsulation;

class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    // public BankAccount(){}
    public BankAccount(int accountNumber, String accountHolderName, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    // getter method

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    // setter method

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

public class BankingEncapulationEx {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456, "Vaibhav", 2000);
        int accountNumber = account1.getAccountNumber();
        String accountHolderName = account1.getAccountHolderName();
        double accountBalance = account1.getAccountBalance();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);

        // Update account balance
        System.out.println("-----------------------------------------");
        account1.setAccountBalance(1600);
        accountBalance = account1.getAccountBalance();
        System.out.println("New Account Balance:" + accountBalance);

    }
}
