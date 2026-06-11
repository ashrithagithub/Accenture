package com.tnsif.NonAccessModifiers.Abstract;

/*  Q: Create an abstract class named Wallet.

1) It should have an abstract method: void authorizeTransaction().

2) It should have a final variable: final String CURRENCY = "USD";

3) Create a child class named CryptoWallet that extends Wallet.

4) Implement the authorizeTransaction() method to print "Transaction approved via Private Key!"     */

abstract class Wallet
{	
	abstract void authorizeTransaction();
	final String CURRENCY = "USD";
}

class CryptoWallet extends Wallet
{
	void authorizeTransaction() 
	{
		System.out.println("Transaction approved via Private Key!");
	}
}

public class abstract_example {

	public static void main(String[] args) {
		
		CryptoWallet cw = new CryptoWallet();
		cw.authorizeTransaction();

	}

}
