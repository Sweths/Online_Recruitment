import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Tata extends JFrame implements ActionListener
{
        Tata()
    {
        JFrame tat = new JFrame();
        tat.setTitle("Tata Motors");
        tat.setSize(1365,770);
                tat.setLayout(null);
                tat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\tata.jpg"));
        im.setBounds(50,200,300,200);
        tat.add(im);

        JLabel ct = new JLabel("TATA Motors");
        ct.setBounds(500,50,200,30);
        ct.setForeground(Color.red);
        ct.setFont(new Font("serif",Font.BOLD,30));
            tat.add(ct);

        JLabel c1 = new JLabel("Tata Motors Limited is an Indian multinational automotive manufacturing company ");
        c1.setBounds(600,200,1000,30);
        c1.setForeground(Color.blue);
        c1.setFont(new Font("serif",Font.BOLD,20));
            tat.add(c1);
            
            JLabel c2 = new JLabel("Stock price: 570001 (BSE) Rs. 190.95 +0.05 (+0.03%)");
        c2.setBounds(600,250,1000,20);
        c2.setForeground(Color.blue);
        c2.setFont(new Font("serif",Font.BOLD,20));
        tat.add(c2);
            
              
        JLabel c3 = new JLabel("Headquarters: Mumbai, Maharashtra,India");
        c3.setBounds(600,300,1000,20);
        c3.setForeground(Color.blue);
        c3.setFont(new Font("serif",Font.BOLD,20));
        tat.add(c3);
            
              JLabel c4 = new JLabel("Founder: J. R. D. Tata");
        c4.setBounds(600,350,1000,20);
        c4.setForeground(Color.blue);
                c4.setFont(new Font("serif",Font.BOLD,20));
            tat.add(c4);
            
             JLabel c5 = new JLabel("Founded: 1945");
        c5.setBounds(600,400,1000,20);
        c5.setForeground(Color.blue);
                c5.setFont(new Font("serif",Font.BOLD,20));
            tat.add(c5);
        
            
     JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            tat.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            tat.add(bc);
            bc.addActionListener(this);

        tat.setVisible(true);
    }
         @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
    }        public static void main(String args[])
        {
            new Tata();
        }
}