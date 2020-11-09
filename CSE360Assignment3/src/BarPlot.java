import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * The BarPlot class inherits from the decorated plot 
 * class and creates a bar based on the 
 * random generated value. 
 *
 */
public class BarPlot extends DecoratedPlot{

	public void draw(Graphics g) {
		int height = 250; 
		g.setColor(Color.GRAY);
		
		for(int i = 0; i < values.size(); i++) {
			g.fillRect((i * 20) - 5, height - values.get(i), 10, 250);
		}
		
		
		super.draw(g);
	}
	
}
