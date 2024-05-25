package com.java.bankingappl;

public class Account {
	 private int accNumber;
	    private String accHolder;
	    private double balance;

	    public Account(int accNumber, String accHolder, double balance) {
	        this.accNumber = accNumber;
	        this.accHolder = accHolder;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountInfo() {
	        return "Account Number: " + accNumber + ", Holder: " + accHolder + ", Balance: " + balance;
	    }

		public int getAccNumber() {
			return accNumber;
		}

		public void setAccNumber(int accNumber) {
			this.accNumber = accNumber;
		}

		public String getAccHolder() {
			return accHolder;
		}

		public void setAccHolder(String accHolder) {
			this.accHolder = accHolder;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

}
