import java.util.Observable;
import java.util.Random;

/**
 * Source randomly generates a random number between 
 * 0 to 250 and notifies the observers.
 * 
 */

@SuppressWarnings("deprecation")
public class Source extends Observable{
	
	private int value;
	
	public void create() {
		
		
		//random number between 0 to 250
		Random rand = new Random();
		value = rand.nextInt(250); 
		
		
		//notify the observers 
		setChanged();
		notifyObservers();
			
	}
	
	public int getValue() {
		
		return value;
		
	}
	
}
