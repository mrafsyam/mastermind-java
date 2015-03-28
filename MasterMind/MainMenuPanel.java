import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author Raf
 *
 */
public class MainMenuPanel extends JPanel{

	/**
	 * @param args
	 */
	
	JPanel panel_main;
	JPanel second_panel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainMenuPanel();
	}
	
	public MainMenuPanel(){
		
		//title on main panel
  		ImageIcon imgicn_title = new ImageIcon("mm_title.png");
		JLabel title = new JLabel();
		title.setIcon(imgicn_title);
		title.setBounds(80,20,400,200);
		
		//button control at bottom of main panel
		ImageIcon imgicn_btnPlay = new ImageIcon("btnPlay.png");
		JLabel btnPlay = new JLabel(imgicn_btnPlay);
		btnPlay.addMouseListener(mlPlay);
		btnPlay.setBounds(105,200,200,70);
		
		ImageIcon imgicn_btnHowTo = new ImageIcon("btnHowTo.png");
		JLabel btnHowTo = new JLabel(imgicn_btnHowTo);
		btnHowTo.addMouseListener(mlHowTo);
		btnHowTo.setBounds(105,300,200,70);
		
		ImageIcon imgicn_btnHighscore = new ImageIcon("btnHighscore.png");
		JLabel btnHighscore = new JLabel(imgicn_btnHighscore);
		btnHighscore.addMouseListener(mlHighscore);
		btnHighscore.setBounds(105,400,200,70);
		
		//main panel - bg panel
  		ImageIcon imgicn_bg = new ImageIcon("bg_mainmenu.png");
        Image img_bg = imgicn_bg.getImage();
	    panel_main = new JPanel();
	    panel_main.setLayout(new BorderLayout());
	    second_panel = new IPanel(img_bg);
	    second_panel.setOpaque(false);
	    second_panel.setLayout(null);
	    second_panel.add(title);
	    second_panel.add(btnPlay);
	    second_panel.add(btnHowTo);
	    second_panel.add(btnHighscore);
	    panel_main.add(second_panel, BorderLayout.CENTER);
	    
	    
	    //add to this object's instance 
	    setLayout(new BorderLayout());
	    add(panel_main);
			
	}//end of MainMenu() constructor
	
	//mouselistener for btnPlay
  	MouseListener mlPlay = new MouseListener() {
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
        	panel_main.remove(second_panel);
        	panel_main.revalidate();
        	
        	GamePanel gp = new GamePanel();
        	panel_main.add(gp);
        }
    };
    
  //mouselistener for btnHowTo
  	MouseListener mlHowTo = new MouseListener() {
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
        	panel_main.remove(second_panel);
        	panel_main.revalidate();
        	HowtoPlayPanel htp = new HowtoPlayPanel();
        	panel_main.add(htp);
        }
    };
    
  //mouselistener for btnHighscore
  	MouseListener mlHighscore = new MouseListener() {
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
        	panel_main.remove(second_panel);
        	panel_main.revalidate();
        	HighscorePanel hs = new HighscorePanel();
        	panel_main.add(hs);	
        }
    };

}
