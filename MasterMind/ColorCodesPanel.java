import javax.swing.*;
import java.awt.*;

public class ColorCodesPanel extends JPanel{

	RoundButton mybtn1; 
	RoundButton mybtn2; 
	RoundButton mybtn3; 
	RoundButton mybtn4;


	public ColorCodesPanel(){
		//repaint();
		setPreferredSize (new Dimension(200,50));
	}


	public void paintComponent(Graphics g){

		super.paintComponent(g); //overwrite paintComponent() of JPanel into this one. 
		
		mybtn1 = new RoundButton("a");
		mybtn2 = new RoundButton("a");
		mybtn3 = new RoundButton("a");
		mybtn4 = new RoundButton("a");


		mybtn1.setBackground(Color.black);
		add(mybtn1);
		mybtn2.setBackground(Color.black);
		add(mybtn2);
		mybtn3.setBackground(Color.black);
		add(mybtn3);
		mybtn4.setBackground(Color.black);
		add(mybtn4);

	}

}