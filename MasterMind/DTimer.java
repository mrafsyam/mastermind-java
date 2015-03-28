

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class DTimer extends JFrame implements ActionListener
{

/**** 
* Attributes: 
* 
****/

	protected JLabel viewTime;  // Component for displaying the time elapsed
	protected int timeCount;	// Variable to memorize the elapsed time
	protected Timer timer;		// objet javax.swing.Timer

/****
* Constructor :
*
****/

// (Default) sets the counter to 0 and a 1 second delay
	public DTimer ()
	{	this (0, 1000);
	}
	
// Built a timer with the given initial time and the delay to 1 second
	public DTimer (int initialTime)
	{	this (initialTime, 1000);
	}
	
// Built a timer with time and the delay gives
	public DTimer (int initialTime, int delay)
	{	super ("Demo clock without thread");
		
		this.timeCount = initialTime;
		this.viewTime = new JLabel (""+this.timeCount);
		this.timer = new Timer (delay, this);
		//this.initGraphic ();
	}
	
	public JLabel getViewTime(){
		return viewTime;
	}
	
/****
* Methods :
*
****/

// Initialize the graphical part of the demo

protected void initGraphic ()
	{	JButton bouton = new JButton ("start/stop");
		bouton.setActionCommand ("Bouton");
		bouton.addActionListener (this);
		this.viewTime.setHorizontalAlignment (JLabel.CENTER);
		this.getContentPane ().add (bouton, BorderLayout.SOUTH);
		this.getContentPane ().add (this.viewTime, BorderLayout.CENTER);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setLocation (250, 250);
		this.pack ();
		this.setVisible (true);
	}
	
// Starts the timer
	public void startDTimer ()
	{	this.timer.start ();
	}
	
// Stop the timer
	public void stopDTimer ()
	{	this.timer.stop ();
	}
	
// Used to recover the time already elapsed
	public int getTime ()
	{	return ( this.timeCount );
	}
	
// Allows to know the state of activity timer (spear or not)
	public boolean isRunning ()
	{	return ( this.timer.isRunning () );
	}
	

	public void actionPerformed (ActionEvent e)
	{	

		// Case generates an event with the button

		if ( "Bouton".equals (e.getActionCommand ()) )
		{	
			if ( this.isRunning () )
			{	this.stopDTimer ();
			}
			else 
			{	this.startDTimer ();
			}
		}
		else // Case generates an event by the component javax.swing.Timer
		{	this.timeCount++;
			this.viewTime.setText (""+this.timeCount);
		}
	}

	public static void main (String argv [])
	{	new DTimer ();
	}
}

