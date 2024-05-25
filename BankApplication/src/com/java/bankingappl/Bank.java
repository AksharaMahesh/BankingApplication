package com.java.bankingappl;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccNumber() == accNumber) {
                accounts.remove(acc);
                System.out.println("Account removed successfully");
                return;
            }
        }
        System.out.println("Account not found");
    }

    public Account findAccount(int accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account acc : accounts) {
            System.out.println(acc.getAccountInfo());
        }
    }
}
