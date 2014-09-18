package ps3;

public class NSFException extends Exception{
	   /**This class almost entirely copied from @Dad's 
	    * InsufficientFundsException
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	   public NSFException(double needs) {
		// TODO Auto-generated constructor stub
	}
	/**
	    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
	    * @param amount
	    */
	   public void InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount()
	   {
	      return amount;
	   }

}
