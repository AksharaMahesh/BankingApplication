package com.java.bankingappl;

public class CurrentAccount extends Account {
	
    private double overdraftLimit;

    public CurrentAccount(int accNumber, String accHolder, double balance, double overdraftLimit) {
        super(accNumber, accHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean checkOverdraft(double amount) {
        if (getBalance() - amount < -overdraftLimit) {
            System.out.println("Transaction cannot be completed. Overdraft limit exceeded.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getAccountInfo() {
        return "Current Account Number: " + getAccNumber() + ", Holder: " + getAccHolder() + ", Balance: " + getBalance();
    }
}
