package com.tnsif.interfaces;

public class Account {
	
	private int accNo;
	private String name;
	private double bal;
	
	private Bank bank;          // reference variable of bank to interlink them

	
	// constructor -> right click -> source -> generate constructor using fields -> generate
	public Account(int accNo, String name, double bal, Bank bank) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
		this.bank = bank;
	}

	
	// getter & setter -> right click -> source -> generate getter & setters -> select all -> generate
	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}


	public Bank getBank() {
		return bank;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}


	// to string method -> right click -> source -> generate to string() -> generate
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", bal=" + bal + ", bank=" + bank + "]";
	}
	
	
	
	
	
}
