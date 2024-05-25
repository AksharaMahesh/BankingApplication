package com.java.bankingappl;

public class SavingsAccount  extends Account{


private double interestRate;

public SavingsAccount(int accNumber, String accHolder, double balance, double interestRate) {
    super(accNumber, accHolder, balance);
    this.interestRate = interestRate;
}

public double calculateInterest() {
    return getBalance() * (interestRate / 100);
}

@Override
public String getAccountInfo() {
    return "Savings Account Number: " + getAccNumber() + ", Holder: " + getAccHolder() + ", Balance: " + getBalance();
}
}
