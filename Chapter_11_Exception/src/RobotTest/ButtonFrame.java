package RobotTest;
import javax.swing.*;

public class ButtonFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;
	public ButtonFrame()
	{
		setTitle("ButtonTest");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		ButtonPanel panel = new ButtonPanel();
		add(panel);
	}
}
