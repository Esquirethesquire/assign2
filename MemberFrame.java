import java.awt.*;
import javax.swing.*;

public class MemberFrame {

  MemberFrame(int id){
	  
    switch (id) {
      case 1: DHPanel();
              break;
      case 2: CTPanel();
              break;
      case 3: CAPanel();
              break;
      case 4: DRPanel();
              break;
      default: break;
    }
  }

  //Derek's panel goes here
  public void DHPanel(){
    JFrame f = new JFrame("Meet Derek!");
    f.setVisible(true);
    f.setSize(600, 600);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("DEREK");
	ImageIcon icon = new ImageIcon("Totalwar.png");
	JLabel imageLabel = new JLabel(icon);
    JLabel lbl2 = new JLabel("B.S. Computer Science");
    JLabel lbl3 = new JLabel("Software Designer");

    p.add(lbl);
    p.add(imageLabel);
    p.add(lbl2);
    p.add(lbl3);
    
    f.add(p);
  }

  //Clayton's Panel goes here
  public void CTPanel(){
    JFrame f = new JFrame("Meet Clayton!");
    f.setVisible(true);
    f.setSize(600, 600);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("CLAYTON");
	ImageIcon icon = new ImageIcon("Fallout4.jpg");
	JLabel imageLabel = new JLabel(icon);
    JLabel lbl2 = new JLabel("B.S. Computer Science");
    JLabel lbl3 = new JLabel("Software Designer");

    p.add(lbl);
    p.add(imageLabel);
    p.add(lbl2);
    p.add(lbl3);

    f.add(p);
  }

  //Cordell's Panel goes here
  public void CAPanel(){
    JFrame f = new JFrame("Meet Cordell!");
    f.setVisible(true);
    f.setSize(600, 600);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("CORDELL");
	ImageIcon icon = new ImageIcon("ElderScrolls.jpeg");
	JLabel imageLabel = new JLabel(icon);
    JLabel lbl2 = new JLabel("B.S. Computer Science");
    JLabel lbl3 = new JLabel("Software Designer");


    p.add(lbl);
    p.add(imageLabel);
    p.add(lbl2);
    p.add(lbl3);
  
    f.add(p);
  }

  //Dave's Panel goes here
  public void DRPanel(){
    JFrame f = new JFrame("Meet Dave!");
    f.setVisible(true);
    f.setSize(600, 600);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("DAVE");
	ImageIcon icon = new ImageIcon("warhammer.jpg");
	JLabel imageLabel = new JLabel(icon);
    JLabel lbl2 = new JLabel("B.S. Computer Science");
    JLabel lbl3 = new JLabel("Software Designer");

    p.add(lbl);
    p.add(imageLabel);
    p.add(lbl2);
    p.add(lbl3);

    f.add(p);
  }

}
