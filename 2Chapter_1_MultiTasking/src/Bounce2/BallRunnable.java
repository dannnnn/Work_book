package Bounce2;

/**
 * Class Runnable ce contine miscarea bilei
 * @author Dan
 *
 */
public class BallRunnable implements Runnable
{
	/**
	 * Constructor Clasa
	 * @param aball Bila
	 * @param panel Component unde se afla BIla
	 */
	public BallRunnable(Ball aBall,BallPanel aComponent)	
	{
		ball = aBall;
		component = aComponent;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		try
		{
			for(int i = 1;i<=STEPS; i++)
			{
				ball.move(component.getBounds(),component.getBalls());
				component.repaint();
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	private Ball ball;
	private BallPanel component;
	public static final int STEPS = 100000;
	public static final int DELAY = 3;
}
