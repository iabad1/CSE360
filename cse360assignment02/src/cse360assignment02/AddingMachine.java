package cse360assignment02;

/**
 * The AddingMachine class adds, subtracts, keeps track of transactions
 * and gets the current total.
 * 
 * @author Isiah Abad
 * @param total is the current total
 *
 */

 public class AddingMachine {

	 private int total;
	 private static String history; //history variable 
	
	 //added main 
	  public static void main (String [] args) {
         
		 AddingMachine myCalculator = new AddingMachine(); //accessing the functions in class
		  
		 //test run
	        myCalculator.add(5);
	        myCalculator.subtract(6);
	        System.out.println(history.toString());
	        System.out.println(myCalculator.getTotal());
	        myCalculator.clear();
	        System.out.println(history.toString());
	     
	        myCalculator.add(8);
	        myCalculator.add(8);
	        myCalculator.subtract(10);
	        System.out.println(history.toString());
	        System.out.println(myCalculator.getTotal());
	  }

	 /**
	  * AddingMachine contains initial values for history and total. 
	  */
	 
	  public AddingMachine () {
		  
	    total = 0;  // not needed - included for clarity
	    history = "0";
	    
	  }
	  
	  /**
	   * @return Current Total 
	   */
	  
	  public int getTotal () {
		  
	    return total;
	    
	  }
	  
	  /**
	   * @param value is the value that needs to be added to total
	   */
	  
	  public void add (int value) {
		  
		  total = total + value; 
		  history = history + " + " + value;
		 
	  }
	  
	  /**
	   * @param value is the value that needs to be subtracted from total
	   */
	  public void subtract (int value) {
		  
		  total = total - value;
		  history = history + " - " + value;
		  
	  }
	  
	  /**
	   * @return history of "transactions"
	   */
	  public String toString() {
		  
		  return history;
		  
	  }
	  
	/**
	 * clear() method clears the history
	 */
	  public void clear() {
		  
		  total = 0;
		  history = "0";
		  
	  }
}