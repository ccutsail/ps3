package ps3;

import java.util.Date;


public class Account {

	private int id = 0;
	private double balance = 0;
	public static double annualInterestRate = 0;
	private Date dateCreated = new Date();

	
	public Account() {
		
 		
	}
	public Account(int id, double balance){
		this.id = id;     
		this.balance = balance;
		
	}
	public int getID()   {
		return id;   }
	
    public void setID(int id)   {     
		 this.id = id;   }

	public void setBalance(double balance)   {     
		 this.balance = balance;   }

	public static double getAnnualInterestRate()   {
			return annualInterestRate;   }
		
	public static double setAnnualInterestRate(double setAnnualInterestRate)   {     
			 annualInterestRate = setAnnualInterestRate;   
			 return annualInterestRate;}
	 
	public double getBalance()   {
		return balance;   }
	
	public Date getDate()   {
		return dateCreated;   }
	
	public double withdraw_moola(double amount) throws
		NSFException
		{
		if(amount <= balance){
			balance = balance - amount;
		return balance;}
		else{
			double needs = balance - amount;
			throw new NSFException(needs);
			
			
		}
	}
	
	public double deposit_moola(double amount){
		balance = balance + amount;
		return balance;
	
		
	}
}

