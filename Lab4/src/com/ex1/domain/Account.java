package com.ex1.domain;

public class Account {private long accNum;
private double balance;
private Person accHolder;

public Person getAccHolder() {
	return accHolder;
}
public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance1) {
	this.balance =balance+ balance1;
}

public void deposit(double amount)
{
	balance=balance+amount;
}

public void withdraw(double amount)
{
	if(balance>(amount+500))
	{
	  balance=balance-amount;
	}
//	else
//	{
//	
//		System.out.println("Sorry! Insufficient Balance");
//	}

}

}

