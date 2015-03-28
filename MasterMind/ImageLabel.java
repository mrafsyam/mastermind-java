import javax.swing.ImageIcon;
import javax.swing.JLabel;

class ImageLabel extends JLabel {

  public ImageLabel(ImageIcon icon) {
  	setIcon(icon);
    setIconTextGap(0);
    setBorder(null);
    setText(null);
  }

  public void setImage(ImageIcon icon){
  	setIcon(icon);
  }

}