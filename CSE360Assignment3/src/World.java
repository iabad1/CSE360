

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author Isiah Abad
 * Id: 1214560659
 * Assignment 3
 * 
 * This class contains the main method. World inherits
 * from JFrame and implements ActionListener.
 * Uses 3 PlotPanels and has a source. 
 * 
 * 
 */

@SuppressWarnings("serial")
public class World extends JFrame implements ActionListener {
	
	// new source
	Source source = new Source();

	//creating the method for world.
	@SuppressWarnings("deprecation")
	public World() {
		
		//building the plots 
		SimplePlot simplePlot = new SimplePlot();
		MarkedPlot markedPlot = new MarkedPlot();
		BarPlot barPlot = new BarPlot();
		// creating the frame and button
		
		JFrame frame = new JFrame("Plot");
		Button btn = new Button("Run");
		btn.setFont(new Font("Arial", Font.PLAIN, 40));
		btn.addActionListener(this);
		
		markedPlot.add(simplePlot);
		barPlot.add(markedPlot); //combining all three plots to make bar plot
		
		
		//Plot Panels
		PlotPanel panel1 = new PlotPanel(barPlot); //top panel
		PlotPanel panel2 = new PlotPanel(markedPlot); //middle panel
		PlotPanel panel3 = new PlotPanel(simplePlot); //bottom panel 
		
		//adding observers 
		source.addObserver(panel1);
		source.addObserver(panel2);
		source.addObserver(panel3);
		
		//changing panel background
		panel1.setBackground(Color.WHITE);
		panel2.setBackground(Color.YELLOW);
		panel3.setBackground(Color.GREEN);
		
		//changing size of panels
		panel1.setPreferredSize(new Dimension(500, 250));
		panel2.setPreferredSize(new Dimension(500, 250));
		panel3.setPreferredSize(new Dimension(500, 250));
		btn.setPreferredSize(new Dimension(500, 70));
		
		//adding to mainPanel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(btn);
		
		//making the frame resize itself
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(mainPanel);
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	public void actionPerformed(ActionEvent e ) {
		
		
		//using source to randomly generate number
		source.create();
		int num; 
		num = source.getValue();
		System.out.print(num + " ");
		
	}
	

	// opening up the program
	public static void main(String[] args) {
		
		 new World();
		
	}
	
	
	
}
