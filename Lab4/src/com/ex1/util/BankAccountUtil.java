package com.ex1.util;

public class BankAccountUtil {

	public static void main(String[] args) {
		public void  getStart()
		{
			Scanner sc=new Scanner(System.in);
			
	  Account acc1=new Account();
	  Person person=new Person();
	  person.setName("Smith");
	  person.setAge(15);
	  acc1.setAccNum(123456);
	  //System.out.println("Smith Enter deposit Balance");
	  acc1.setBalance(2000);
	  
	  Account acc2=new Account();
	  Person person2=new Person();
	  AccountDAOIMPL acc3=new AccountDAOIMPL();
	  person2.setName("kathy");
	  person2.setAge(13);
	  acc2.setAccNum(153456);
	  //System.out.println("Kathy Enter deposit Balance");
	  acc2.setBalance(3000);
	  
	  System.out.println("---Before Process---"); 
	  System.out.println("Holder Name: "+person.getName()); 
	  System.out.println("Age "+person.getAge());
	  System.out.println(person.getName()+" account number is "+acc1.getAccNum());
	  System.out.println("Your available Amount "+acc1.getBalance()); 
	  
	  System.out.println("Holder Name: "+person2.getName()); 
	  System.out.println("Age "+person2.getAge());
	  System.out.println(person2.getName()+"account number is "+acc2.getAccNum());
	  System.out.println("Your available Amount "+acc2.getBalance()); 
	 System.out.println();
	  
	  System.out.println("Smith Enter Deposit Amount:");
	  acc1.deposit(sc.nextDouble());
	//  System.out.println("Smith Enter withdraw Amount:");
	//  acc1.withdraw(sc.nextDouble());
	 
	  
	//  System.out.println("Kathy Enter Deposit Amount:");
	//  acc2.deposit(sc.nextDouble());
	  System.out.println("Kathy Enter withdraw Amount:");
	  acc2.withdraw(sc.nextDouble());
	  
	  System.out.println("---After Process---"); 
	  System.out.println("Holder Name: "+person.getName()); 
	  System.out.println("Age "+person.getAge());
	  System.out.println(person.getName()+" account number is "+acc1.getAccNum());
	  System.out.println("Total Balance after deposit: "+acc1.getBalance()); 
	  
	  System.out.println("Holder Name: "+person2.getName()); 
	  System.out.println("Age "+person2.getAge());
	  System.out.println(person2.getName()+" account number is "+acc2.getAccNum());
	  System.out.println("Remaining Balance after withdrawn "+acc2.getBalance()); 

	}

}
