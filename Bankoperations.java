package bank;
import java.util.Scanner;
public class Bankoperations {
	
	Scanner sc=new Scanner(System.in);
	
	public void deposite(Bankaccount account,double amount) {
		if (amount>0) {
			double newbalance=account.getbalance()+amount;
			
			account.setBalance(newbalance);
			System.out.println("Money deposited successfully!");
			System.out.println("current balance:"+account.getbalance());
		}
		else {
			System.out.println("invalid ammount !!");
		}
	}
	
	
	
		
		public void withdraw(Bankaccount account,double ammount) {
			
			if (ammount<=0) {
				System.out.println("Invalid withdrawal ammount!");
				
			}
				else if (ammount>account.getbalance()) {
					
					System.out.println("Insufficient balance ");
			}
				else {
					double newbalance=account.getbalance()-ammount;
					account.setBalance(newbalance);
					System.out.println("Withdrawal success !");
					System.out.println("Remaining balance :"+account.getbalance());
				}
			
		}
		
		public void checkbalance(Bankaccount account) {
			System.out.println("Account number:  "+account.getacnumber());
			System.out.println("current balance :"+account.getbalance());
		}
		
		
		
		
		
		public void transferMoney(Bankaccount sender, Bankaccount receiver, double amount) {

		    if (amount <= 0) {

		        System.out.println("Invalid Transfer Amount!");

		    } else if (amount > sender.getbalance()) {

		        System.out.println("Insufficient Balance!");
 
		    } else {
 
		        sender.setBalance(sender.getbalance() - amount);

		        receiver.setBalance(receiver.getbalance() + amount);

		        System.out.println("Money Transferred Successfully!");
		        System.out.println("Sender Balance: " + sender.getbalance());
		        System.out.println("Receiver Balance: " + receiver.getbalance());
		    }

		
		}
	}



