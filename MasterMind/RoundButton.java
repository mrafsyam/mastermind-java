import java.awt.*;
import javax.swing.*;

public class RoundButton extends JButton {

  char color;
  boolean picked;

  public RoundButton(String label) {
    super(label);

    color = 'x';
    picked = false;

    // These statements enlarge the button so that it becomes a circle rather than an oval.
    Dimension size = getPreferredSize();
    size.width = size.height = Math.max(size.width, size.height);
    setPreferredSize(size);
    setEnabled(false);

    // This call causes the JButton not to paint the background - allows us to paint a round background.
    setContentAreaFilled(false);
  }

  // Paint the round background and label.
  protected void paintComponent(Graphics g) {
    if (getModel().isArmed()) {
    // You might want to make the highlight color 
    // a property of the RoundButton class.
      g.setColor(Color.lightGray);
    } else {
      g.setColor(getBackground());
    }
    g.fillOval(0, 0, getSize().width-1, getSize().height-1);
  }

  // Paint the border of the button using a simple stroke.
  protected void paintBorder(Graphics g) {
    g.setColor(getForeground());
    g.drawOval(0, 0, getSize().width-1, getSize().height-1); 
  }

  //setters
  public void setColor(char inColor){
    color = inColor;
  }

  public void setPicked(boolean inState){
    picked = inState;
  }

  //getters
  public char getColor(){
    return color;
  }

  public boolean getPicked(){
    return picked;
  }

}