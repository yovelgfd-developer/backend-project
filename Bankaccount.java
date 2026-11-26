package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bankaccount {
	Scanner sc=new Scanner(System.in);
				
		private long acnumber;
		private String name;
		private long phone;
		private String actype;
		private double balance;

		
	public  Bankaccount(long acnumber,String name,long phone,String actype,double balance ) {
		
		this.acnumber=acnumber;
		this.name=name;
		this.phone=phone;
		this.actype=actype;
		this.balance=balance;
		
		
	}
	
	public void createaccount () {
		System.out.println("Enter Account number ");
		acnumber=sc.nextLong();
		System.out.println("Enter Customer Name ");
		name=sc.next();
		System.out.println("Enter Phone Number");
		phone=sc.nextLong();
		System.out.println("Enter account type");
		actype=sc.next();
		System.out.println("Enter initial Balance ");
		balance=sc.nextDouble();
	}
	
	public long getacnumber() {
		return acnumber;
	}
	public String getname() {
		return name;
	}
	public long getphone() {
		return phone;
	}
	public String getactype() {
		return actype;
	}
	public double getbalance() {
		return balance;
	}
	
	
	public void setname(String name) {
		this.name=name;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayaccountdetails() {
		System.out.println("========================");
		System.out.println("ACCOUNT DETAILS ");
		System.out.println("========================");
		System.out.println("Account number :"+acnumber);
		System.out.println("Costomer name  :"+name);
		System.out.println("Costomer phone :"+phone);
		System.out.println("Account type   :"+actype);
		System.out.println("Account balance:"+balance);
		System.out.println("--------------------------");
	}
	
	public void displayTransactionHistory() {
     ArrayList<Transaction> transactions=new ArrayList<>();
	    if (transactions.isEmpty()) {
	        System.out.println("No transaction history available.");
	        return;
	    }

	    System.out.println("\n====== TRANSACTION HISTORY ======");

	    for (Transaction t : transactions) {
	        t.displayTransaction();
	        System.out.println("------------------------------");
	    }
	}
}










