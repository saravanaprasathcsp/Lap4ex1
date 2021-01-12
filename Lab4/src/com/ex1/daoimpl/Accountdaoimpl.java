package com.ex1.daoimpl;

import com.ex1.domain.Account;

public class Accountdaoimpl implements Accountdao{
	
	Account account=new Account();
@Override
public void deposit(double amount)
{
       account.setBalance(amount);
}
@Override
public void withdraw(double amount)
{
	
	
}
@Override
public double getBalance()
{
	return getBalance();
}

}
