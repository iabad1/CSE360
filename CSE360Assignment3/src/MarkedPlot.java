import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * The MarkerPlot inherits from the decorated plot 
 * class and created a rectangle point based on the 
 * random generated value. 
 *
 */

public class MarkedPlot extends DecoratedPlot{
	
	public void draw(Graphics g) {
		
		int height = 250;
		g.setColor(Color.BLUE);
		
		
		for(int i = 0; i < values.size(); i++) {
			g.fillRect((i * 20) - 5, height - values.get(i), 10, 10);
		}
		
		super.draw(g);
	}
	
}
