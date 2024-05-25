package com.java.bankingappl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add an account");
            System.out.println("2. Remove an account");
            System.out.println("3. Deposit to an account");
            System.out.println("4. Withdraw from an account");
            System.out.println("5. Display all accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter account holder name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter account type (Savings/Current): ");
                    String accType = scanner.next();
                    if (accType.equalsIgnoreCase("Savings")) {
                        System.out.print("Enter interest rate: ");
                        double interestRate = scanner.nextDouble();
                        bank.addAccount(new SavingsAccount(accNumber, accHolder, balance, interestRate));
                    } else if (accType.equalsIgnoreCase("Current")) {
                        System.out.print("Enter overdraft limit: ");
                        double overdraftLimit = scanner.nextDouble();
                        bank.addAccount(new CurrentAccount(accNumber, accHolder, balance, overdraftLimit));
                    } else {
                        System.out.println("Invalid account type. Account not added.");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number to remove: ");
                    int accNumToRemove = scanner.nextInt();
                    bank.removeAccount(accNumToRemove);
                    break;
                case 3:
                    System.out.print("Enter account number to deposit to: ");
                    int accNumToDeposit = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.findAccount(accNumToDeposit).deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter account number to withdraw from: ");
                    int accNumToWithdraw = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.findAccount(accNumToWithdraw).withdraw(withdrawAmount);
                    break;
                case 5:
                    System.out.println("All Accounts:");
                    bank.displayAllAccounts();
                    break;
                case 6:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
