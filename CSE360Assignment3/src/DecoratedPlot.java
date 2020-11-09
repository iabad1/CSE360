
import java.awt.Graphics;
/**
 * 
 * Decorated plot extends Drawable and is the parent
 * of Marked Plot and BarPLot. 
 *
 */

public abstract class DecoratedPlot extends Drawable{

	Drawable drawable;
	
	
	public void add(Drawable d) {
		drawable = d;
	}
	@Override
	public void setValue(int value) {
		
		
		
		this.values.add(value);
		
		if(values.size() == 20) {
			values.clear();
		}
		
	}
	@Override
	public void draw(Graphics g) {
		
		drawable.draw(g);
		
	}
	
	
}
