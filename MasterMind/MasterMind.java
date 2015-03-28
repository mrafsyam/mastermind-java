import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class MasterMind {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MasterMind();
	}
	
	
	public MasterMind(){
		 //add to frame's contentpane
	    JFrame frame = new JFrame("MasterMind");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize (new Dimension(400,720)); 
		frame.setResizable(false); 
		
		MainMenuPanel menu = new MainMenuPanel();
		frame.getContentPane().setLayout(new BorderLayout());
	    frame.getContentPane().add(menu);
		
	    frame.pack();
	    frame.setVisible(true);
	}
}
