package ps3;

public class Test {
	public static void main(String[] args) {
		Account.setAnnualInterestRate(3.2);
		Account Bobby = new Account(1122, 20000);
		System.out.println(Bobby.getID());
		System.out.println(Bobby.getBalance());
		System.out.println(Bobby.deposit_moola(3000));
		try{
		System.out.println(Bobby.withdraw_moola(2500));
		}catch(NSFException amount){
			amount.getAmount();}
		System.out.println(Account.getAnnualInterestRate());
		Account.setAnnualInterestRate(2.7);
		System.out.println(Account.getAnnualInterestRate());
		try{
		System.out.println(Bobby.withdraw_moola(50000));
		}catch(NSFException amount){
				amount.getAmount();}
		System.out.println(Bobby.getDate());

		
	}



}
