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
	JButton Member4=new JButton("David Rich");

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

		Member1.addActionListener(this);
		Member2.addActionListener(this);
		Member3.addActionListener(this);
		Member4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		int id=0;

		if (e.getSource() == Member1){
			id = 1;
		} else if (e.getSource() == Member2){
			id = 2;
		} else if (e.getSource() == Member3){
			id = 3;
		} else if (e.getSource() == Member4){
			id = 4;
		} else {
			System.out.println("ERR0R.");
		}

		if (id>0){
			new MemberFrame(id);
		}
	}
}
