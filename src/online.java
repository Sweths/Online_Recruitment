import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class online extends JFrame implements ActionListener
{
	JFrame onl = new JFrame();
	JLabel l;
	JButton b1,b2;
	online()
	{

		onl.setTitle("Online Recruitment");
		onl.setSize(1365,770);
		onl.setLayout(null);
		onl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel logo=new JLabel(new ImageIcon("G:\\logos\\logo.jpg"));
		logo.setBounds(400,260,180,100);
		onl.add(logo);

		l = new JLabel("A2Z Freshers");
		l.setBounds(600,280,500,50);
		l.setForeground(Color.red);
		l.setFont(new Font("serif",Font.BOLD,50));
		onl.add(l);

		b1 = new JButton("Registered");
		b1.setBounds(400,400,200,50);
		b1.setActionCommand("Registered");
		b1.setFont(new Font("serif",Font.BOLD,20));
		onl.add(b1);
		b1.addActionListener(this);
		
		b2 = new JButton("Fresh Apply");
		b2.setBounds(800,400,200,50);
		b2.setActionCommand("Fresh Apply");
		b2.setFont(new Font("serif",Font.BOLD,20));
		onl.add(b2);
		b2.addActionListener(this);

		onl.setVisible(true);

	}
        
        
        @Override
	public void actionPerformed(ActionEvent e)
	{
		
        if (e.getActionCommand()=="Registered")
			new RegData();
		if(e.getActionCommand()=="Fresh Apply")
			new NewData();    
       
               
        
    }
   
       public static void main(String[] args) 
        {
		new online();

       }
}