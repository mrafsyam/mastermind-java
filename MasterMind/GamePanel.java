import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;    
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class GamePanel extends JPanel {
	
	GamePanel this_instance;
	char[] code;
	char[] guess;
	int newscore;
	int guessCount;
	int right_place;
	int wrong_place;
	int wrong;
	WavePlayerThread music;
	ImageIcon update_pegs;
	RoundButton btn1;
	RoundButton btn2;
	RoundButton btn3;
	RoundButton btn4;
	RoundButton btn5;
	RoundButton btn6;
	RoundButton btn7;
	RoundButton btn8;
	RoundButton btn9;
	RoundButton btn10;
	RoundButton btn11;
	RoundButton btn12;
	RoundButton btn13;
	RoundButton btn14;
	RoundButton btn15;
	RoundButton btn16;
	RoundButton btn17;
	RoundButton btn18;
	RoundButton btn19;
	RoundButton btn20;
	RoundButton btn21;
	RoundButton btn22;
	RoundButton btn23;
	RoundButton btn24;
	RoundButton btn25;
	RoundButton btn26;
	RoundButton btn27;
	RoundButton btn28;
	RoundButton btn29;
	RoundButton btn30;
	RoundButton btn31;
	RoundButton btn32;
	RoundButton btn33;
	RoundButton btn34;
	RoundButton btn35;
	RoundButton btn36;
	RoundButton btn37;
	RoundButton btn38;
	RoundButton btn39;
	RoundButton btn40;

	JLabel peg1;
	JLabel peg2;
	JLabel peg3;
	JLabel peg4;
	JLabel peg5;
	JLabel peg6;
	JLabel peg7;
	JLabel peg8;
	JLabel peg9;
	JLabel peg10;
	
	int timeCount;
	DTimer timer;
	JLabel viewTime;
	
	String newname;//new player name
	
	
	//constructor GamePanel()
  	public GamePanel(){
  		
  		this_instance = this;
  		
  		//title on main panel
  		ImageIcon imgicn_title = new ImageIcon("mm_title.png");
		JLabel title = new JLabel();
		title.setIcon(imgicn_title);
		title.setBounds(20,5,235,60);

		//timer on the top right of main panel
		timer = new DTimer();
		viewTime = timer.getViewTime();//new JLabel("00:00");
		viewTime.setBounds(255,5,120,85);
		viewTime.setFont (viewTime.getFont ().deriveFont (43.0f));


		//colors on the right of main panel
  		ImageIcon imgicn_colors = new ImageIcon("colors.png");
		JLabel colors = new JLabel();
		colors.setIcon(imgicn_colors);
		colors.setBounds(310,80,75,537);

		//button control at bottom of main panel
		ImageIcon imgicn_btnmainmenu = new ImageIcon("btnmainmenu.png");
		JLabel btnMainMenu = new JLabel(imgicn_btnmainmenu);
		btnMainMenu.setBounds(10,625,120,50);
		btnMainMenu.addMouseListener(mlMainMenu);
		ImageIcon imgicn_btnnewgame = new ImageIcon("btnnewgame.png");
		JLabel btnNewGame = new JLabel(imgicn_btnnewgame);
		btnNewGame.setBounds(143,625,110,50);
		btnNewGame.addMouseListener(mlNewGame);
		ImageIcon imgicn_btncheck = new ImageIcon("btncheck.png");
		JLabel btnCheck = new JLabel(imgicn_btncheck);
		btnCheck.setBounds(268,625,100,50);
		btnCheck.addMouseListener(mlCheck);

		//buttons color codes on main panel
		int btn_sep = 47;
		int btn_dsep = 55;
		btn1 = new RoundButton("a");
		btn1.setBackground(Color.gray);
		btn1.setBounds(31,80,45,42);
		btn1.addActionListener(new btnActionListener());
		btn2 = new RoundButton("a");
		btn2.setBackground(Color.gray);
		btn2.setBounds(31+btn_sep,80,45,42);
		btn2.addActionListener(new btnActionListener());
		btn3 = new RoundButton("a");
		btn3.setBackground(Color.gray);
		btn3.setBounds(31+2*btn_sep,80,45,42);
		btn3.addActionListener(new btnActionListener());
		btn4 = new RoundButton("a");
		btn4.setBackground(Color.gray);
		btn4.setBounds(31+3*btn_sep,80,45,42);
		btn4.addActionListener(new btnActionListener());
	
		btn5 = new RoundButton("a");
		btn5.setBackground(Color.gray);
		btn5.setBounds(31,80+1*btn_dsep,45,42);
		btn5.addActionListener(new btnActionListener());
		btn6 = new RoundButton("a");
		btn6.setBackground(Color.gray);
		btn6.setBounds(31+btn_sep,80+1*btn_dsep,45,42);
		btn6.addActionListener(new btnActionListener());
		btn7 = new RoundButton("a");
		btn7.setBackground(Color.gray);
		btn7.setBounds(31+2*btn_sep,80+1*btn_dsep,45,42);
		btn7.addActionListener(new btnActionListener());
		btn8 = new RoundButton("a");
		btn8.setBackground(Color.gray);
		btn8.setBounds(31+3*btn_sep,80+1*btn_dsep,45,42);
		btn8.addActionListener(new btnActionListener());
		
		btn9 = new RoundButton("a");
		btn9.setBackground(Color.gray);
		btn9.setBounds(31,80+2*btn_dsep,45,42);
		btn9.addActionListener(new btnActionListener());
		btn10 = new RoundButton("a");
		btn10.setBackground(Color.gray);
		btn10.setBounds(31+btn_sep,80+2*btn_dsep,45,42);
		btn10.addActionListener(new btnActionListener());
		btn11 = new RoundButton("a");
		btn11.setBackground(Color.gray);
		btn11.setBounds(31+2*btn_sep,80+2*btn_dsep,45,42);
		btn11.addActionListener(new btnActionListener());
		btn12 = new RoundButton("a");
		btn12.setBackground(Color.gray);
		btn12.setBounds(31+3*btn_sep,80+2*btn_dsep,45,42);
		btn12.addActionListener(new btnActionListener());

		btn13 = new RoundButton("a");
		btn13.setBackground(Color.gray);
		btn13.setBounds(31,80+3*btn_dsep,45,42);
		btn13.addActionListener(new btnActionListener());
		btn14 = new RoundButton("a");
		btn14.setBackground(Color.gray);
		btn14.setBounds(31+btn_sep,80+3*btn_dsep,45,42);
		btn14.addActionListener(new btnActionListener());
		btn15 = new RoundButton("a");
		btn15.setBackground(Color.gray);
		btn15.setBounds(31+2*btn_sep,80+3*btn_dsep,45,42);
		btn15.addActionListener(new btnActionListener());
		btn16 = new RoundButton("a");
		btn16.setBackground(Color.gray);
		btn16.setBounds(31+3*btn_sep,80+3*btn_dsep,45,42);
		btn16.addActionListener(new btnActionListener());
		
		btn17 = new RoundButton("a");
		btn17.setBackground(Color.gray);
		btn17.setBounds(31,80+4*btn_dsep,45,42);
		btn17.addActionListener(new btnActionListener());
		btn18 = new RoundButton("a");
		btn18.setBackground(Color.gray);
		btn18.setBounds(31+btn_sep,80+4*btn_dsep,45,42);
		btn18.addActionListener(new btnActionListener());
		btn19 = new RoundButton("a");
		btn19.setBackground(Color.gray);
		btn19.setBounds(31+2*btn_sep,80+4*btn_dsep,45,42);
		btn19.addActionListener(new btnActionListener());
		btn20 = new RoundButton("a");
		btn20.setBackground(Color.gray);
		btn20.setBounds(31+3*btn_sep,80+4*btn_dsep,45,42);
		btn20.addActionListener(new btnActionListener());
		
		btn21 = new RoundButton("a");
		btn21.setBackground(Color.gray);
		btn21.setBounds(31,80+5*btn_dsep,45,42);
		btn21.addActionListener(new btnActionListener());
		btn22 = new RoundButton("a");
		btn22.setBackground(Color.gray);
		btn22.setBounds(31+btn_sep,80+5*btn_dsep,45,42);
		btn22.addActionListener(new btnActionListener());
		btn23 = new RoundButton("a");
		btn23.setBackground(Color.gray);
		btn23.setBounds(31+2*btn_sep,80+5*btn_dsep,45,42);
		btn23.addActionListener(new btnActionListener());
		btn24 = new RoundButton("a");
		btn24.setBackground(Color.gray);
		btn24.setBounds(31+3*btn_sep,80+5*btn_dsep,45,42);
		btn24.addActionListener(new btnActionListener());
		
		btn25 = new RoundButton("a");
		btn25.setBackground(Color.gray);
		btn25.setBounds(31,80+6*btn_dsep,45,42);
		btn25.addActionListener(new btnActionListener());
		btn26 = new RoundButton("a");
		btn26.setBackground(Color.gray);
		btn26.setBounds(31+btn_sep,80+6*btn_dsep,45,42);
		btn26.addActionListener(new btnActionListener());
		btn27 = new RoundButton("a");
		btn27.setBackground(Color.gray);
		btn27.setBounds(31+2*btn_sep,80+6*btn_dsep,45,42);
		btn27.addActionListener(new btnActionListener());
		btn28 = new RoundButton("a");
		btn28.setBackground(Color.gray);
		btn28.setBounds(31+3*btn_sep,80+6*btn_dsep,45,42);
		btn28.addActionListener(new btnActionListener());
		
		btn29 = new RoundButton("a");
		btn29.setBackground(Color.gray);
		btn29.setBounds(31,80+7*btn_dsep,45,42);
		btn29.addActionListener(new btnActionListener());
		btn30 = new RoundButton("a");
		btn30.setBackground(Color.gray);
		btn30.setBounds(31+btn_sep,80+7*btn_dsep,45,42);
		btn30.addActionListener(new btnActionListener());
		btn31 = new RoundButton("a");
		btn31.setBackground(Color.gray);
		btn31.setBounds(31+2*btn_sep,80+7*btn_dsep,45,42);
		btn31.addActionListener(new btnActionListener());
		btn32 = new RoundButton("a");
		btn32.setBackground(Color.gray);
		btn32.setBounds(31+3*btn_sep,80+7*btn_dsep,45,42);
		btn32.addActionListener(new btnActionListener());
		
		btn33 = new RoundButton("a");
		btn33.setBackground(Color.gray);
		btn33.setBounds(31,80+8*btn_dsep,45,42);
		btn33.addActionListener(new btnActionListener());
		btn34 = new RoundButton("a");
		btn34.setBackground(Color.gray);
		btn34.setBounds(31+btn_sep,80+8*btn_dsep,45,42);
		btn34.addActionListener(new btnActionListener());
		btn35 = new RoundButton("a");
		btn35.setBackground(Color.gray);
		btn35.setBounds(31+2*btn_sep,80+8*btn_dsep,45,42);
		btn35.addActionListener(new btnActionListener());
		btn36 = new RoundButton("a");
		btn36.setBackground(Color.gray);
		btn36.setBounds(31+3*btn_sep,80+8*btn_dsep,45,42);
		btn36.addActionListener(new btnActionListener());
		
		btn37 = new RoundButton("a");
		btn37.setBackground(Color.gray);
		btn37.setBounds(31,80+9*btn_dsep,45,42);
		btn37.addActionListener(new btnActionListener());
		btn38 = new RoundButton("a");
		btn38.setBackground(Color.gray);
		btn38.setBounds(31+btn_sep,80+9*btn_dsep,45,42);
		btn38.addActionListener(new btnActionListener());
		btn39 = new RoundButton("a");
		btn39.setBackground(Color.gray);
		btn39.setBounds(31+2*btn_sep,80+9*btn_dsep,45,42);
		btn39.addActionListener(new btnActionListener());
		btn40 = new RoundButton("a");
		btn40.setBackground(Color.gray);
		btn40.setBounds(31+3*btn_sep,80+9*btn_dsep,45,42);
		btn40.addActionListener(new btnActionListener());
		
	
		
		
	


  		//10 pegs on main panel
  		int peg_sep = 55; //separation for pegs
	   	ImageIcon peg_ori = new ImageIcon("peg_ori.png");
		peg1 = new JLabel();
		peg1.setIcon(peg_ori);
		peg1.setBounds(250,80,46,42);
		peg2 = new JLabel();
		peg2.setIcon(peg_ori);
		peg2.setBounds(250,80+peg_sep,46,42);
		peg3 = new JLabel();
		peg3.setIcon(peg_ori);
		peg3.setBounds(250,80+2*peg_sep,46,42);
		peg4 = new JLabel();
		peg4.setIcon(peg_ori);
		peg4.setBounds(250,80+3*peg_sep,46,42);
		peg5 = new JLabel();
		peg5.setIcon(peg_ori);
		peg5.setBounds(250,80+4*peg_sep,46,42);
		peg6 = new JLabel();
		peg6.setIcon(peg_ori);
		peg6.setBounds(250,80+5*peg_sep,46,42);
		peg7 = new JLabel();
		peg7.setIcon(peg_ori);
		peg7.setBounds(250,80+6*peg_sep,46,42);
		peg8 = new JLabel();
		peg8.setIcon(peg_ori);
		peg8.setBounds(250,80+7*peg_sep,46,42);
		peg9 = new JLabel();
		peg9.setIcon(peg_ori);
		peg9.setBounds(250,80+8*peg_sep,46,42);
		peg10 = new JLabel();
		peg10.setIcon(peg_ori);
		peg10.setBounds(250,80+9*peg_sep,46,42);

		//main panel - bg panel
  		ImageIcon imgicn_bg = new ImageIcon("backgroud_wood.png");
        Image img_bg = imgicn_bg.getImage();
	    JPanel panel_main = new IPanel(img_bg);
	    panel_main.setLayout(null);
	    panel_main.add(title);
	    panel_main.add(colors);
	    panel_main.add(viewTime);
	    panel_main.add(btnMainMenu);
	    panel_main.add(btnNewGame);
	    panel_main.add(btnCheck);

	    //add buttons to main panel
	    panel_main.add(btn1);
	    panel_main.add(btn2);
	    panel_main.add(btn3);
	    panel_main.add(btn4);
	    panel_main.add(btn5);
	    panel_main.add(btn6);
	    panel_main.add(btn7);
	    panel_main.add(btn8);
	    panel_main.add(btn9);
	    panel_main.add(btn10);
	    panel_main.add(btn11);
	    panel_main.add(btn12);
	    panel_main.add(btn13);
	    panel_main.add(btn14);
	    panel_main.add(btn15);
	    panel_main.add(btn16);  
	    panel_main.add(btn17);
	    panel_main.add(btn18);
	    panel_main.add(btn19);
	    panel_main.add(btn20);
	    panel_main.add(btn21);
	    panel_main.add(btn22);
	    panel_main.add(btn23);
	    panel_main.add(btn24);
	    panel_main.add(btn25);
	    panel_main.add(btn26);
	    panel_main.add(btn27);
	    panel_main.add(btn28);
	    panel_main.add(btn29);
	    panel_main.add(btn30);
	    panel_main.add(btn31);
	    panel_main.add(btn32);
	    panel_main.add(btn33);
	    panel_main.add(btn34);
	    panel_main.add(btn35);
	    panel_main.add(btn36);
	    panel_main.add(btn37);
	    panel_main.add(btn38);
	    panel_main.add(btn39);
	    panel_main.add(btn40);

	    //add pegs to main panel
	    panel_main.add(peg1);
	    panel_main.add(peg2);
	    panel_main.add(peg3);
	    panel_main.add(peg4);
	    panel_main.add(peg5);
	    panel_main.add(peg6);
	    panel_main.add(peg7);
	    panel_main.add(peg8);
	    panel_main.add(peg9);
	    panel_main.add(peg10);

	 
	    setLayout(new BorderLayout());
	    add(panel_main);
	    
	    //start of the game
	    music = new WavePlayerThread("DesiJourney.wav");
	    music.start();
	    
	    newname = (String) JOptionPane.showInputDialog (null, "Enter your name : ");
	    guessCount=1;
	    code = new char[4];
	    guess = new char[4];
	    randomizeCode();
	    enableRow(1);
	    
	    
	    timer.startDTimer();
	    
	    //game then continue on btnCheck()
	    
	    
	    
  	
  	}// end of constructor GamePanel()
  	
  	//method to enable buttons of a single row at a time
  	public void enableRow(int inRow){
  		
  		switch(inRow){
  			case (1):
  				btn1.setEnabled(true);
  				btn2.setEnabled(true);
  				btn3.setEnabled(true);
  				btn4.setEnabled(true);
  				break;
  				
  			case (2):
  				btn5.setEnabled(true);
  				btn6.setEnabled(true);
  				btn7.setEnabled(true);
  				btn8.setEnabled(true);
  				break;
  			
  			case (3):
  				btn9.setEnabled(true);
  				btn10.setEnabled(true);
  				btn11.setEnabled(true);
  				btn12.setEnabled(true);
  				break;
  			
  			case (4):
  				btn13.setEnabled(true);
  				btn14.setEnabled(true);
  				btn15.setEnabled(true);
  				btn16.setEnabled(true);
  				break;
  				
  			case (5):
  				btn17.setEnabled(true);
  				btn18.setEnabled(true);
  				btn19.setEnabled(true);
  				btn20.setEnabled(true);
  				break;
  			
  			case (6):
  				btn21.setEnabled(true);
  				btn22.setEnabled(true);
  				btn23.setEnabled(true);
  				btn24.setEnabled(true);
  				break;
  			
  			case (7):
  				btn25.setEnabled(true);
  				btn26.setEnabled(true);
  				btn27.setEnabled(true);
  				btn28.setEnabled(true);
  				break;
  			
  			case (8):
  				btn29.setEnabled(true);
  				btn30.setEnabled(true);
  				btn31.setEnabled(true);
  				btn32.setEnabled(true);
  				break;
  			
  			case (9):
  				btn33.setEnabled(true);
  				btn34.setEnabled(true);
  				btn35.setEnabled(true);
  				btn36.setEnabled(true);
  				break;
  				
  			case (10):
  				btn37.setEnabled(true);
  				btn38.setEnabled(true);
  				btn39.setEnabled(true);
  				btn40.setEnabled(true);
  				break;	
  		}
  	}

  	//method to randomize color code
  	public void randomizeCode(){
  		
  		randomCodes newrandom = new randomCodes();
  		code = newrandom.getRandomCodes();
	    //JOptionPane.showMessageDialog (null, code[0]+code[1]+code[2]+code[3] );

  		
  	}//end of randomizeCode()
  	
  	//mouselistener for btnMainMenu
  	MouseListener mlMainMenu = new MouseListener() {
        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseClicked(MouseEvent e) {
        	JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this_instance);
	    	MainMenuPanel menu = new MainMenuPanel();
			frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().removeAll();
		    frame.getContentPane().add(menu);
		    frame.pack();
		    frame.setVisible(true);
		    music.cancel();
        }
    };

    //mouselistener for btnNewGame
  	MouseListener mlNewGame = new MouseListener() {
        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseClicked(MouseEvent e) {
        	JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this_instance);
        	GamePanel gp = new GamePanel();
			frame.getContentPane().setLayout(new BorderLayout());
			frame.getContentPane().removeAll();
		    frame.getContentPane().add(gp);
		    frame.pack();
		    frame.setVisible(true);
		    music.cancel();
        }
    };
    
    
    

    
    //mouselistener for btnCheck
  	MouseListener mlCheck = new MouseListener() {
        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseClicked(MouseEvent e) {
        	
        	
        		
        	//else, game is not over
        		
        	//re-initialize pegs variables
        	right_place = 0;
        	wrong_place = 0;
        	wrong = 0;
        		
        		
    	    	
    	    //enable the next row of color codes buttons
    	    enableRow(guessCount);
    	    	
    	    //get the guess
    	    guess = getGuess(guessCount);
    	    
    	    
    	    //JOptionPane.showMessageDialog (null, "guess : " + guess[0] + " code : " + code[0]);
        	//if game is not over
    	    //check if any color code button is not set yet 
    	    boolean won = false;
    	    for (int i=0; i<4; i++){
    	    	if (guess[i]== code[i]){
    	    		won = true;
    	    	}
    	    }
    	    
        	if (guessCount == 10 || won == true){
        		//game is over here. update highscore
        		timeCount = timer.getTime();
        		timer.stopDTimer();
            	newscore = ((11 - guessCount)*100) - timeCount*10; //score algorithm
            	
            	try {
					updateHighscore();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            	
    			JOptionPane.showMessageDialog (null, "Game is over. Score : " + newscore);
    			music.cancel();
    			return;
        	}
    	    	
    	    //check if any color code button is not set yet 
    	    boolean validcode = true;
    	    for (int i=0; i<4; i++){
    	    	if (guess[i]== 'x'){
    	    		validcode = false;
    	    	}
    	    }
    	    
    	    if (validcode == false){
    			JOptionPane.showMessageDialog (null, "You must supply 4 color codes before checking");
	    		return; //do nothing if it is not set
    	    }
    	    	
    	    //check the guess against the code
    	    checkGuessCode();
    	    	
    	    //update pegs on panel according to pegs variable
    	    updatePegs(guessCount);
    	    	
    	    //increase guessCount
    	    guessCount++;
    	    	
    	    right_place = 0;
    	    wrong_place = 0;
    	    wrong = 0;
    	    enableRow(guessCount);
    	    //game is not over, return to game
    	    return;
    	    	 	
    	}//end of mouseClicked()
   
    };// end of listener for btnCheck
    
    
    
    //method to update highscore (score.txt)
    public void updateHighscore() throws IOException{
    	
    	
    	String[] full_text = new String[20];
    	Scanner scan;
    	int num_scores = 10;
    	int i = 0;



    	try {
    				File file = new File("score.txt");
    		        FileReader reader = new FileReader(file);
    		        BufferedReader in = new BufferedReader(reader);
    		        String string;

    		        while ((string = in.readLine()) != null) {
    		        	full_text[i] = string;
    					//System.out.println(full_text[i]); //for display
    					i++;
    		    	}
    		    	
    		    	in.close();

    	 } catch (IOException e) {
    	     e.printStackTrace();
    	 }


    			
    			String[] name = new String[num_scores];
    			String[] score = new String[num_scores];

    			int j = 0;
    			for (i=0; i<full_text.length; i=i+2){
    				name[j] = full_text[i];
    				score[j] = full_text[i+1];
    				j++;
    			}
    			

    			//parse string array score[] array into another integer array
    			int scoreInt[] = new int[num_scores];
    			for (i=0; i < num_scores; i++){
    				scoreInt[i] = Integer.parseInt(score[i]);
    				//System.out.println(scoreInt[i]);
    			}


    			//check for correct index to insert
    			for (i=num_scores-1; newscore > scoreInt[i]; i--){
    				//do nothing
    			}
    			int index = i;

    			//update old arrays, 1 more after the index to insert
    			for (i=num_scores-1; i > index; i--){
    	            name[i] = name[i-1];
    	            score[i] = score[i-1];
    			}

    			//insert new data
    			name[index]= newname;
    			score[index]= Integer.toString(newscore);
		
    			PrintWriter writer = new PrintWriter("score.txt","UTF-8");
    			for (i=0; i < num_scores; i++)
    			{
    				writer.println(name[i]);
    				writer.println(score[i]);               
    			}
    			
    			writer.close();    	
    }
    
    //methods to update pegs on JPanel according to "pegs variable"
    public void updatePegs(int inRow){
    	
    	//create ImageIcon varible
    	update_pegs = new ImageIcon("peg_ori.png");
		//peg1.setIcon(peg_ori)
		
    	//first, pick which image
    	if (right_place == 4){
    		update_pegs = new ImageIcon("peg_4right.png");
    	} 
    	if (wrong_place == 4){
    		update_pegs = new ImageIcon("peg_4wrong.png");
    	}
    	if (wrong == 4){
    		update_pegs = new ImageIcon("peg_ori.png");
    	}
    	if (right_place == 1 && wrong_place == 0 && wrong == 3){
    		update_pegs = new ImageIcon("peg_1right.png");
    	}
    	if (right_place == 1 && wrong_place == 1 && wrong ==2){
    		update_pegs = new ImageIcon("peg_1right1wrong.png");
    	}
    	if (right_place == 0 && wrong_place == 1 && wrong ==3){
    		update_pegs = new ImageIcon("peg_1wrong.png");
    	}
    	if (right_place == 2 && wrong_place == 0 && wrong ==2){
    		update_pegs = new ImageIcon("peg_2right.png");
    	}
    	if (right_place == 2 && wrong_place == 1 && wrong ==1){
    		update_pegs = new ImageIcon("peg_2right1wrong.png");
    	}
    	if (right_place == 2 && wrong_place == 2 && wrong ==0){
    		update_pegs = new ImageIcon("peg_2right2wrong.png");
    	}
    	if (right_place == 0 && wrong_place == 2 && wrong ==2){
    		update_pegs = new ImageIcon("peg_2wrong.png");
    	}
    	if (right_place == 3 && wrong_place == 0 && wrong ==1){
    		update_pegs = new ImageIcon("peg_3right.png");
    	}
    	if (right_place == 0 && wrong_place == 3 && wrong ==1){
    		update_pegs = new ImageIcon("peg_3wrong.png");
    	}
    	
    	//update the pegs by row
    	switch(inRow){
    		case 1:
    			peg1.setIcon(update_pegs);
    			break;
    		case 2:
    			peg2.setIcon(update_pegs);
    			break;
    		case 3:
    			peg3.setIcon(update_pegs);
    			break;
    		case 4:
    			peg4.setIcon(update_pegs);
    			break;
    			
    	}
    	
		
	}
    
    //method to check user's guess against the randomly generated codes
    public void checkGuessCode(){
    	
    	//reset
    	right_place=0;
    	wrong_place =0;
    	wrong = 0;
    	
		//check for num of right_place
		for (int i=0; i<4; i++){
			if (guess[i] == code[i]){
				right_place++;
			}
		}
		// all is correct, return
		if (right_place == 4){
			return;
		}

		//check for num of wrong place
		int right_wrong_place = 0;
		for (int i=0; i<4; i++){
			for (int j=0; j<4; j++){
				if (guess[i] == code[j]){
					right_wrong_place++;
				}
			}
		}
		wrong_place = right_wrong_place - right_place;

		//set the num of wrong 
		wrong = 4 - wrong_place - right_place;
		
		//debug
		//JOptionPane.showMessageDialog (null, " right_place : " + right_place + "wrong_place : " + wrong_place + " wrong : " + wrong);


	}//end of checkGuessCode()
    
  //method to get the guess from the color codes buttons
  	public char[] getGuess(int inRow){
  		
  		char[] guesscode = new char[4];
  		
  		switch(inRow){
  			case (1):
  				guesscode[0] = btn1.getColor();
  				guesscode[1] = btn2.getColor();
  				guesscode[2] = btn3.getColor();
  				guesscode[3] = btn4.getColor();
  				break;
  				
  			case (2):
  				guesscode[0] = btn5.getColor();
				guesscode[1] = btn6.getColor();
				guesscode[2] = btn7.getColor();
				guesscode[3] = btn8.getColor();
  				break;
  			
  			case (3):
  				guesscode[0] = btn9.getColor();
				guesscode[1] = btn10.getColor();
				guesscode[2] = btn11.getColor();
				guesscode[3] = btn12.getColor();
  				break;
  			
  			case (4):
  				guesscode[0] = btn13.getColor();
				guesscode[1] = btn14.getColor();
				guesscode[2] = btn15.getColor();
				guesscode[3] = btn16.getColor();
  				break;
  		}
  		
  		return guesscode;
  	}

    //listener for color codes buttons
  	public class btnActionListener implements ActionListener {

	    public void actionPerformed(ActionEvent e) {
		    RoundButton btn = (RoundButton) e.getSource();

		    btn.setPicked(true);
		    

			Object[] colors = {"blue", "black", "yellow", "green", "white", "red", "orange", "cyan"};
			String color = (String) JOptionPane.showInputDialog (null, "Pick a color : ");

			switch (color){
				case "blue":
				case "b":
					btn.setBackground(Color.blue);
					btn.setColor('b');
					break;

				case "pink":
				case "p":
					btn.setBackground(Color.pink);
					btn.setColor('p');
					break;

				case "yellow":
				case "y":
					btn.setBackground(Color.yellow);
					btn.setColor('y');
					break;

				case "green":
				case "g":
					btn.setBackground(Color.green);
					btn.setColor('g');
					break;

				case "white":
				case "w":
					btn.setBackground(Color.white);
					btn.setColor('w');
					break;

				case "red":
				case "r":
					btn.setBackground(Color.red);
					btn.setColor('r');
					break;
					
				case "orange":
				case "o":
					btn.setBackground(Color.orange);
					btn.setColor('o');
					break;

				case "cyan":
				case "c":
					btn.setBackground(Color.cyan);
					btn.setColor('c');
					break;

				default:
					btn.setBackground(Color.blue);
					btn.setColor('b');
					break;

			}// end of switch (color)
		    
		    

		}

  	}//end of btnActionListener

}


