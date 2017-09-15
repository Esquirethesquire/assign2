
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;


public class MainPanel extends JPanel {

	private JLabel nameSpace, job, education ,imageLabel;
	JButton Member1=new JButton("Derek Hickman");	
	JButton Member2=new JButton("Clayton Tallwhiteman");
	JButton Member3=new JButton("Cordell Appel");
	JButton Member4=new JButton("David Rich");

	
	Dimension size = new Dimension(600,600);
	private String text =  "Meet Our Team";

	public MainPanel()
	{
		Member1.addActionListener(new ButtonListener1());
		Member2.addActionListener(new ButtonListener2());
		Member3.addActionListener(new ButtonListener3());
		Member4.addActionListener(new ButtonListener4());
		nameSpace = new JLabel("");
		job = new JLabel("");
		education = new JLabel("");
		ImageIcon icon = new ImageIcon("MainPic.jpg");
		imageLabel = new JLabel(icon);
		
		
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
		add(nameSpace);
		add(imageLabel);
		add(job);
		add(education);
			
		
	}
	
	private class ButtonListener1 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is Derek Hickman");
		education.setText("B.S. Computer Science");
		job.setText("Software Designer");
		imageLabel.setIcon(new ImageIcon("TotalWar.png"));

		
		}
	}
	private class ButtonListener2 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is Clayton Tallwhiteman");
		education.setText("B.S. Computer Science");
		job.setText("Software Developer");
		imageLabel.setIcon(new ImageIcon("Fallout4.jpg"));
		
		}
	}
	private class ButtonListener3 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is Cordell Appel");
		education.setText("B.S. Computer Science");
		job.setText("Software Testing Engineer 1");
		imageLabel.setIcon(new ImageIcon("ElderScrolls.jpeg"));
		
		}
	}
	private class ButtonListener4 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is David Rich");
		education.setText("B.S. Computer Science");
		job.setText("Software Testing Engineer 2");
		imageLabel.setIcon(new ImageIcon("warhammer.jpg"));
		
		}
	}
	
	
}


	
	
