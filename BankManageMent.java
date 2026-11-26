package bank;
import java.util.ArrayList;

import java.util.Scanner;

public class BankManageMent {
Scanner sc=new Scanner(System.in);
ArrayList<Bankaccount>accounts = new ArrayList<>();

 Bankoperations operations = new Bankoperations();

public void addaccount() {
	Bankaccount account=new Bankaccount(0, null, 0, null, 0);
	account.createaccount();
	accounts.add(account);
	System.out.println("Account added successfully");
}

public Bankaccount searchaccount() {
	System.out.println("Enter Account Number");
	long acno=sc.nextInt();
	for (Bankaccount account : accounts) {
		if (acno ==account.getacnumber() ) {
			return account;
		}
		else {
			System.out.println("Account not found !");
		}
	}
	return null;
	
}

public void accountdetails() {
	
	System.out.println("Enter account number");
	long acno=sc.nextLong();
	for (Bankaccount bankaccount : accounts) {
		if (bankaccount.getacnumber()==acno) {
			
			bankaccount.displayaccountdetails();
			return;
			
		}
		else {
		System.out.println("Account not found!");
		}
	}

	
}

public void depositemoney() {
	Bankaccount account = searchaccount();
	if (account != null) {
		System.out.println("Enter the ammount ");
		Double ammount=sc.nextDouble();
		operations.deposite(account,ammount);
	}
	else {
		System.out.println("Account not Found !");
	}
	
}

public void withdrawmoney() {
	Bankaccount account=searchaccount();
	if(account!=null) {
		System.out.println("Enter the Ammount ");
		double wammount=sc.nextDouble();
		operations.withdraw(account, wammount);
	}
}

public void Checkbalance() {
	Bankaccount account=searchaccount();
	if (account!=null) {
		operations.checkbalance(account);
		
	}else {
		System.out.println("Account not found !");
	}
	
}



public void Transaction() {
	System.out.println("Enter sender account details ");
	Bankaccount sender =searchaccount();
	if (sender==null) {
		return;
	} 
	System.out.println("Enter reciever account details");
		Bankaccount receiver = searchaccount();
		if (receiver==null) {
			return;
		}
		if (sender.getacnumber()==receiver.getacnumber()) {
			System.out.println("Cannot transfer money to same account ! ");
			return;
		}
		System.out.println("Enter ammount :");
		double ammount=sc.nextDouble();
		operations.transferMoney(sender, receiver, ammount);	
		
}

public void transactionhistory() {
	Bankaccount account=searchaccount();
	if (account!=null) {
		account.displayTransactionHistory();
	}
	
}

public void displayallaccounts() {
	if (accounts.isEmpty()) {
		System.out.println("account not found");
		return;
	}
	else {
		 for (Bankaccount bankaccount : accounts) {
			bankaccount.displayaccountdetails();
		}
	}
}











}
