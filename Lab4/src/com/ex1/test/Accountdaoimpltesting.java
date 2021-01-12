package com.ex1.test;

import com.ex1.daoimpl.Accountdaoimpl;
import com.ex1.domain.Account;
import com.ex1.domain.Person;

public class Accountdaoimpltesting {

	public static void main(String[] args)
	{
		/** if we check use it*/
		Account acc=new Account();
		Person person=new Person();
		
		Accountdaoimpl acc2=new Accountdaoimpl();
		acc.setAccNum(56);
		acc.setBalance(500);
		person.setName("Sara");
		person.setAge(16);
		 System.out.println("Holder Name: "+person.getName()); 
		  System.out.println("Age "+person.getAge());
		  System.out.println(person.getName()+" account number is "+acc.getAccNum());
		  System.out.println("Your available Amount "+acc.getBalance()); 
		
	}

}
