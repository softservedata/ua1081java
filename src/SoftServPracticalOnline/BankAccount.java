package SoftServPracticalOnline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) ;
        balance += depositAmount;
        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0) {
            if (balance >= withdrawAmount) {
                balance -= withdrawAmount;
                System.out.println("Withdrawn: " + withdrawAmount);
                System.out.println("Balance: " + balance);
            } else  {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount should be greater than zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("2600245632", 1256);
        double initialBalance = account.getBalance();
        System.out.println("Initial balance " + initialBalance);
        account.setAccountNumber("2600245632");
        account.setBalance(1256);

        String enter = "Do you want to amount your account or withdraw? (Enter: Amount or Withdraw)";
        System.out.println(enter);

        try {
            String input1 = "Amount";
            input1.toLowerCase();
            scanner.next(input1);
            System.out.println("Deposite amounte: ");
            account.deposit(scanner.nextDouble());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        try {
            scanner.next("Withdraw");
            System.out.println("Withdrawal amount: ");
            account.withdraw(scanner.nextDouble());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }


//        String withdraw = scanner.next("Withdraw");
//        System.out.println("Withdrawal amount: ");
//        account.withdraw(scanner.nextDouble());
//        System.out.println("Do you want to amount your account or withdraw? (Enter: Amount or Withdraw)");

//        BankAccount account = new BankAccount("ACC12345", 1000.0);
//
//        account.deposit(500.0);
//        System.out.println("Current Balance: " + account.getBalance());
//
//        account.withDraw(120.0);
//        System.out.println("Current Balance: " + account.getBalance());

    }
}
