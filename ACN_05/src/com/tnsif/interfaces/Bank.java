package com.tnsif.interfaces;

public interface Bank {
	
	int MIN_BAL = 1000;
	int DEPOSIT_LIMIT = 25000;
	
	// account: is for details
	//amount: for deposit or withdrawl
	void deposit(Account account, double amount);    // by default public & abstract
	void withdrawl(Account account, double amount);
	

}
