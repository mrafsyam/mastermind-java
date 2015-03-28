import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class HighscorePanel extends JPanel{


	int num_scores; //number of name-score pairs to display
	String[] name; 
	String[] score;
	String[] full_text;
	JPanel name_panel;
	HighscorePanel this_instance;
	
	public HighscorePanel(){
		
		this_instance = this;
		
		//load data from txt file into a string array full_text[]
		full_text = new String[20]; //20 as in 10 names & 10 scores altogether
		int i=0;
		num_scores=10;
		
		try {
	        File file = new File("score.txt");
	        FileReader reader = new FileReader(file);
	        BufferedReader in = new BufferedReader(reader);
	        String string;

	        i=0;
	        while ((string = in.readLine()) != null) {
	        	full_text[i] = string;
				i++;
	    	}
	    	in.close();
       	} catch (IOException e) {
         	e.printStackTrace();
       	}

       	//read data into two separate arrays name[] & score[]
       	name = new String[num_scores];
		score = new String[num_scores];
		int j = 0;
		for (i=0; i<full_text.length; i=i+2){
			name[j] = full_text[i];
			score[j] = full_text[i+1];
			j++;
		}

		//create labels to display "name - scores"
		JLabel name1 = new JLabel(name[0]);
		name1.setForeground(Color.white);
		name1.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name2 = new JLabel(name[1]);
		name2.setForeground(Color.white);
		name2.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name3 = new JLabel(name[2]);
		name3.setForeground(Color.white);
		name3.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name4 = new JLabel(name[3]);
		name4.setForeground(Color.white);
		name4.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name5 = new JLabel(name[4]);
		name5.setForeground(Color.white);
		name5.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name6 = new JLabel(name[5]);
		name6.setForeground(Color.white);
		name6.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name7 = new JLabel(name[6]);
		name7.setForeground(Color.white);
		name7.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name8 = new JLabel(name[7]);
		name8.setForeground(Color.white);
		name8.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name9 = new JLabel(name[8]);
		name9.setForeground(Color.white);
		name9.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel name10 = new JLabel(name[9]);
		name10.setForeground(Color.white);
		name10.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score1 = new JLabel(score[0]);
		score1.setForeground(Color.white);
		score1.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score2 = new JLabel(score[1]);
		score2.setForeground(Color.white);
		score2.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score3 = new JLabel(score[2]);
		score3.setForeground(Color.white);
		score3.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score4 = new JLabel(score[3]);
		score4.setForeground(Color.white);
		score4.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score5 = new JLabel(score[4]);
		score5.setForeground(Color.white);
		score5.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score6 = new JLabel(score[5]);
		score6.setForeground(Color.white);
		score6.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score7 = new JLabel(score[6]);
		score7.setForeground(Color.white);
		score7.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score8 = new JLabel(score[7]);
		score8.setForeground(Color.white);
		score8.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score9 = new JLabel(score[8]);
		score9.setForeground(Color.white);
		score9.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel score10 = new JLabel(score[9]);
		score10.setForeground(Color.white);
		score10.setFont(new Font("Serif", Font.BOLD, 20));

		//set layout, create panel, add labels to them
		name_panel = new JPanel();
		name_panel.setLayout(new BoxLayout(name_panel, BoxLayout.Y_AXIS));
		name_panel.add(name1);
		name_panel.add(name2);
		name_panel.add(name3);
		name_panel.add(name4);
		name_panel.add(name5);
		name_panel.add(name6);
		name_panel.add(name7);
		name_panel.add(name8);
		name_panel.add(name9);
		name_panel.add(name10);
		JPanel score_panel = new JPanel();
		score_panel.setLayout(new BoxLayout(score_panel, BoxLayout.Y_AXIS));
		score_panel.add(score1);
		score_panel.add(score2);
		score_panel.add(score3);
		score_panel.add(score4);
		score_panel.add(score5);
		score_panel.add(score6);
		score_panel.add(score7);
		score_panel.add(score8);
		score_panel.add(score9);
		score_panel.add(score10);
		setLayout(null);
		name_panel.setBounds(150, 130, 100, 700);
		score_panel.setBounds(250, 130, 100, 700);
		name_panel.setOpaque(false);
		score_panel.setOpaque(false);
		
		JButton btnBack = new JButton("Back to Main Menu");
		btnBack.addActionListener(new btnActionListener());
		btnBack.setBounds(120, 500, 200, 50);
		add(btnBack);
		
		//main panel
		ImageIcon imgicn_bg = new ImageIcon("highscoreimg.png");
		Image img_bg = imgicn_bg.getImage();
		JPanel panel_main = new IPanel(img_bg);
		panel_main.setBounds(0,0,400,720);
	    panel_main.setLayout(null);
		panel_main.add(name_panel);
		panel_main.add(score_panel);
		
		add(panel_main);


    }// end of constructor HighscorePanel()
	
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
		
}// end of classs HighscorePanel()


