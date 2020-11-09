import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * Simple Plot creates lines between two points 
 * in the values list. It also inherits from the 
 * Drawable class.
 *
 */


public class SimplePlot extends Drawable{

	
	public void draw(Graphics g) {
		
		int height = 250; 
		
		g.setColor(Color.BLACK);
		
		//creating the plot based off the size
		for(int i = 1; i < values.size(); i++) {
			if(values.size() == 1) {
				g.drawLine(0,height , 0, height - values.get(i-1));
				
			}
			else {
				g.drawLine(((i - 1) * 20), height - values.get(i - 1), i * 20 ,height - values.get(i));
			}
		}
		
		
	}
	
	
	
	
}
