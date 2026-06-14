package com.tnsif.interfaces;

public class BankImple implements Bank{
	
	// deposit and withdrawl must be implemented(used) as we are implementing the Bank interface

	@Override
	public void deposit(Account account, double amount) 
	{
		if(amount > DEPOSIT_LIMIT) 
		{
			System.out.println("Deposite is not possible for this account");
		}
		else {
			account.setBal(amount + account.getBal());
			System.out.println("Deposited the amount to the account, now the balance is: "+ account.getBal());
		}
		
		
	}

	@Override
	public void withdrawl(Account account, double amount) {
		if((account.getBal()-amount) > MIN_BAL)
		{
			account.setBal(account.getBal()-amount);
			System.out.println("The transaction is successfully completed " +account.getBal());
		}
		else {
			System.out.println("The transaction is Failed!");
		}
	
		
	}

		
}
	


