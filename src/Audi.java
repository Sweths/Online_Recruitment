import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Audi extends JFrame implements ActionListener
{
        Audi()
	{
		JFrame aud = new JFrame();
		aud.setTitle("Audi cars");
                aud.setSize(1365,770);
                aud.setLayout(null);
                aud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\images.jpg"));
		im.setBounds(50,250,300,200);
		aud.add(im);
                
                        JLabel at = new JLabel("Audi");
        at.setBounds(500,50,200,30);
        at.setForeground(Color.red);
        at.setFont(new Font("serif",Font.BOLD,30));
            aud.add(at);

		JLabel a1 = new JLabel("Audi AG is a German automobile manufacturer ");
		a1.setBounds(600,200,1000,30);
		a1.setForeground(Color.blue);
        a1.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a1);
            
            JLabel a2 = new JLabel("that designs, engineers, manufactures and distributes automobiles. ");
		a2.setBounds(600,220,1000,20);
		a2.setForeground(Color.blue);
        a2.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a2);
            
            JLabel a3 = new JLabel("Audi oversees worldwide operations.");
		a3.setBounds(600,270,1000,20);
		a3.setForeground(Color.blue);
                a3.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a3);
            
            JLabel a4 = new JLabel("Stock price: NSU (FRA) € 620.69 -1.90 (-0.30%)");
		a4.setBounds(600,320,1000,20);
		a4.setForeground(Color.blue);
                a4.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a4);
            
             JLabel a5 = new JLabel("Headquarters: Ingolstadt, Germany");
		a5.setBounds(600,370,1000,20);
		a5.setForeground(Color.blue);
                a5.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a5);
            
              JLabel a6 = new JLabel("Founder: August Horch");
		a6.setBounds(600,420,1000,20);
		a6.setForeground(Color.blue);
                a6.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a6);
            
             JLabel a7 = new JLabel("Founded: July 16, 1909, Zwickau, Germany");
		a7.setBounds(600,470,1000,20);
		a7.setForeground(Color.blue);
                a7.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a7);
            
             JLabel a8 = new JLabel("CEO: Rupert Stadler");
		a8.setBounds(600,520,1000,20);
		a8.setForeground(Color.blue);
                a8.setFont(new Font("serif",Font.BOLD,20));
            aud.add(a8);
            
		JLabel lc = new JLabel();
        lc.setBounds(500,650,800,30);
        lc.setText("Click on the button to go back to the logo page");
       	lc.setFont(new Font("serif",Font.BOLD,20));
        lc.setForeground(Color.red);
        aud.add(lc);

        JButton bc;
        bc = new JButton("Click me");
	bc.setBounds(900,650,200,30);
	bc.setActionCommand("Click me");
	bc.setFont(new Font("serif",Font.BOLD,20));
	aud.add(bc);
	bc.addActionListener(this);

	aud.setVisible(true);
	}
        @Override
	public void actionPerformed(ActionEvent e)
	{
		
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
        }  
	public static void main(String args[])
        {
            new Audi();
        }
}