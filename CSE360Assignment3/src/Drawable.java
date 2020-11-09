import java.awt.Graphics;
import java.util.LinkedList;

/**
 * 
 * Drawable sets the randomly generated numbers inside of a list. 
 * Drawable is also the head of the Decorator pattern.
 *
 */
public abstract class Drawable {

	protected LinkedList<Integer> values = new LinkedList<Integer>();


	public void setValue(int v) {
		
		//placing the points in a vector
		System.out.print(" "+ values.size());
		values.add(v);
		
		if(values.size() == 20) {
			values.clear();
		}
		
	}
	
	public void draw(Graphics g) {}
	
}
