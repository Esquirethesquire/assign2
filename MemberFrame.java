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
    f.setSize(400, 400);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("DEREK");

    p.add(lbl);
    f.add(p);
  }

  //Clayton's Panel goes here
  public void CTPanel(){
    JFrame f = new JFrame("Meet Clayton!");
    f.setVisible(true);
    f.setSize(400, 400);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("CLAYTON");

    p.add(lbl);
    f.add(p);
  }

  //Cordell's Panel goes here
  public void CAPanel(){
    JFrame f = new JFrame("Meet Cordell!");
    f.setVisible(true);
    f.setSize(400, 400);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("CORDELL");

    p.add(lbl);
    f.add(p);
  }

  //Dave's Panel goes here
  public void DRPanel(){
    JFrame f = new JFrame("Meet Dave!");
    f.setVisible(true);
    f.setSize(400, 400);

    JPanel p = new JPanel();

    JLabel lbl = new JLabel("DAVE");

    p.add(lbl);
    f.add(p);
  }

}
