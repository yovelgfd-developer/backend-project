package bank;
import java.util.Scanner;
public class Bankingmanagementsystem {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		BankManageMent Bank=new BankManageMent();
				
				int choice;
				
				do{
					System.out.println("=====================");
					System.out.println("Welcome to our bank ");
					System.out.println("=====================");
					System.out.println("1.create new Account ");
					System.out.println("2.View Account Details ");
					System.out.println("3.Deposite Money");
					System.out.println("4.Withdraw Money");
					System.out.println("5.Check Balance ");
					System.out.println("6.Transfer Money");
					System.out.println("7.Transaction");
					System.out.println("8.Display All Accounts");
					System.out.println("9.exit");
					System.out.println("======================");
					System.out.println("Enter your Choise ");
					choice =sc.nextInt();
					switch (choice) {
					case 1:
						Bank.addaccount();
						break;
					case 2:
						Bank.accountdetails();
						break;
					case 3:
						Bank.depositemoney();
						break;
					case 4:
						Bank.withdrawmoney();
						break;
					case 5:
						Bank.Checkbalance();
						break;
					case 6:
						Bank.Transaction();
						break;
					case 7:
						Bank.transactionhistory();
						break;
					case 8:
						Bank.displayallaccounts();
						break;
					case 9:
						System.out.println("Thank you for using our bank !");
						break;
					default:
						break;
					}
				}
				while(choice !=9);
					

				
				
			}
		

	}


