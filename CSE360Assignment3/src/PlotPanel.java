
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 * 
 * PlotPanel observes the randomly generated numbers 
 * and paints the panels. When a new number is generated it 
 * updates the draw. 
 *
 */

@SuppressWarnings({ "deprecation", "serial" })
public class PlotPanel extends JPanel implements Observer{
	
	Drawable draw; 
	
	public PlotPanel(Drawable drawable) {
		this.draw = drawable; 
		
	}
	
	@Override
	public void update(Observable o , Object arg) {
		
		draw.setValue(((Source)o).getValue());
		
		repaint();
		
		
	}

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		if(draw != null) {
			
			draw.draw(g);
			
		}
		
		
	}
	
	
	
}
