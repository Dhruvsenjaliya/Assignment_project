package Module_6_Core_Java;

import java.util.Scanner;

//Custom Exception Class
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(int deficit) {
     super("Sorry, insufficient balance. You need more " + deficit + " Rs to perform this transaction.");
 }
}

public class BankAccount {
	private static final int ACCOUNT_BALANCE = 2000;

    // Method to perform withdrawal
    public static void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > ACCOUNT_BALANCE) {
            int deficit = amount - ACCOUNT_BALANCE;
            throw new InsufficientBalanceException(deficit);
        } else {
            int remainingBalance = ACCOUNT_BALANCE - amount;
            System.out.println("Transaction successful. Remaining balance: " + remainingBalance + " Rs.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display account balance
        System.out.println("Account balance: 2000 Rs");

        // Ask for withdrawal amount
        System.out.print("Enter withdraw amount: ");
        try {
            int amount = scanner.nextInt();
            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
    }
}
