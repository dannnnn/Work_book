package Bounce;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Panel pe care va fi afisat bila
 * @author Dan
 *
 */
public class BallPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Adaugarea Bilei pe Panel
	 * @param b Bila
	 */
	public void add(Ball b)
	{
		balls.add(b);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		for(Ball b: balls)
		{
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Ball> balls = new ArrayList<Ball>();
}
