package com.driver;

public class Account {
	private String accountName;
    public int balance = 1000;

    public Account(String name) {
        this.accountName = name;
    }

    public void sendMoney(Account receiver, int amount) {
        this.balance-=amount;
        receiver.receiveMoney(amount);
    	// your code goes here
    }

    public void receiveMoney(int amount) {
        synchronized (this) {
            this.balance+=amount;
        	// your code goes here
        }
    }
}
