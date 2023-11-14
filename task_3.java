package codsoft3;
import java.util.Scanner;

	class BankAccount {
	    private double balance;

	    public BankAccount(double balance) 
	    {
	        this.balance = balance;
	    }

	    public void deposit(double amount) 
	    {
	        if (amount > 0)
	        {
	            balance += amount;
	            System.out.println("Deposited " + amount + ". New balance: " + balance);
	        } 
	        else 
	        {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) 
	    {
	        if (amount > 0 && balance >= amount) 
	        {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + ". Remaining balance: " + balance);
	        }
	        else
	        {
	            System.out.println("Invalid amount or insufficient funds for withdrawal.");
	        }
	    }

	    public double getBalance() 
	    {
	        return balance;
	    }
	}

	public class task_3
	{
	    public static void main(String[] args) 
	    {
	        BankAccount userAcc = new BankAccount(500);
	        Scanner sc = new Scanner(System.in);

	        int choice;
	        double amount;

	        do 
	        {
	        	System.out.println("-------------------");
	            System.out.println("ATM Menu:");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the amount to withdraw: ");
	                    amount = sc.nextDouble();
	                    userAcc.withdraw(amount);
	                    break;
	                case 2:
	                    System.out.print("Enter the amount to deposit: ");
	                    amount = sc.nextDouble();
	                    userAcc.deposit(amount);
	                    break;
	                case 3:
	                    System.out.println("Your current balance is: " + userAcc.getBalance());
	                    break;
	                case 0:
	                    System.out.println("Exiting. Thank you!");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 0);
	    }
	}
