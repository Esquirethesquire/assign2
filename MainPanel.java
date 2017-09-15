

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.*;


public class MainPanel extends JPanel {

	private JLabel nameSpace, job, education;
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
		nameSpace = new JLabel("Here is our nameSpace");
		job = new JLabel("Here is our nameSpace");
		education = new JLabel("Here is our nameSpace");
		
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
		
		}
	}
	private class ButtonListener2 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is Clayton Tallwhiteman");
		education.setText("B.S. Computer Science");
		job.setText("Software Developer");
		
		}
	}
	private class ButtonListener3 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is Cordell Appel");
		education.setText("B.S. Computer Science");
		job.setText("Software Testing Engineer 1");
		
		}
	}
	private class ButtonListener4 implements ActionListener{
	@Override
		public void actionPerformed(ActionEvent event)
		{
			
		nameSpace.setText("My name is David Rich");
		education.setText("B.S. Computer Science");
		job.setText("Software Testing Engineer 2");
		
		}
	}
	
	
}


	
	

