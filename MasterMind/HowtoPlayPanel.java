import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HowtoPlayPanel extends JPanel{
	
	HowtoPlayPanel this_instance;

	public HowtoPlayPanel(){
		
		this_instance = this;
		
		//main panel
		ImageIcon imgicn_bg = new ImageIcon("howtoimg.png");
        Image img_bg = imgicn_bg.getImage();
	    JPanel panel_main = new IPanel(img_bg);
	    panel_main.setLayout(null);
	
	    JButton btnBack = new JButton("Back to Main Menu");
		btnBack.addActionListener(new btnActionListener());
		btnBack.setBounds(120, 630, 200, 50);
		panel_main.add(btnBack); 
		setLayout(new BorderLayout());
		add(panel_main);
	
		
	}//end of constructor HowtoPlayPanel()
	
	public class btnActionListener implements ActionListener {

	    public void actionPerformed(ActionEvent e) {
	    	JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this_instance);
	    	MainMenuPanel menu = new MainMenuPanel();
			frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().removeAll();
		    frame.getContentPane().add(menu);
		    frame.pack();
		    frame.setVisible(true);
	    }
	}
	
	
}//end of class HowToPlayPanel