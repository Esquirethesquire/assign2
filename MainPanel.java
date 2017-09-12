

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;


public class MainPanel extends JPanel implements ActionListener{

	
	JButton Member1=new JButton("Derek Hickman");
	JButton Member2=new JButton("Clayton Tallwhiteman");
	JButton Member3=new JButton("Cordell Appel");
	JButton Member4=new JButton("Eric Rickman");
	JButton Member5=new JButton("Garret Blitzman");
	JButton Member6=new JButton("Merek the Gitman");
	
	Dimension size = new Dimension(600,600);
	private String text =  "Meet Our Team";
	public MainPanel()
	{
		
		JLabel label = new JLabel (this.text, JLabel.CENTER );
        label.setOpaque(true);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
		setLayout(new GridLayout(7,1));
		add(label);
		setPreferredSize(size);
		add(Member1);
		add(Member2);
		add(Member3);
		add(Member4);
		add(Member5);
		add(Member6);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}


	
	
