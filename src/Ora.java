import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Ora extends JFrame implements ActionListener
{
        Ora()
    {
        JFrame ora = new JFrame();
        ora.setTitle("Oracle corporation");
        ora.setSize(1365,770);
                ora.setLayout(null);
                ora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\ora.jpg"));
        im.setBounds(50,250,300,200);
        ora.add(im);
        
        JLabel ct = new JLabel("Oracle Corporation");
        ct.setBounds(500,50,200,30);
        ct.setForeground(Color.red);
        ct.setFont(new Font("serif",Font.BOLD,30));
            ora.add(ct);

        JLabel c1 = new JLabel("Oracle Corporation is an American multinational computer technology corporation ");
        c1.setBounds(600,200,1000,30);
        c1.setForeground(Color.blue);
        c1.setFont(new Font("serif",Font.BOLD,20));
            ora.add(c1);
            
            JLabel c2 = new JLabel("Stock price: ORCL (NYSE) US$ 37.50 -0.87 (-2.27%)");
        c2.setBounds(600,250,1000,20);
        c2.setForeground(Color.blue);
        c2.setFont(new Font("serif",Font.BOLD,20));
        ora.add(c2);
            
              
        JLabel c3 = new JLabel("Headquarters: Redwood City, CA, United States of America");
        c3.setBounds(600,300,1000,20);
        c3.setForeground(Color.blue);
        c3.setFont(new Font("serif",Font.BOLD,20));
        ora.add(c3);
            
              JLabel c4 = new JLabel("Founders: Ed Oates, Larry Ellison, Bob Miner");
        c4.setBounds(600,350,1000,20);
        c4.setForeground(Color.blue);
                c4.setFont(new Font("serif",Font.BOLD,20));
            ora.add(c4);
            
             JLabel c5 = new JLabel("Founded: 1977, California, United States");
        c5.setBounds(600,400,1000,20);
        c5.setForeground(Color.blue);
                c5.setFont(new Font("serif",Font.BOLD,20));
            ora.add(c5);
            
             JLabel c6 = new JLabel("CEO: Larry Ellison");
        c6.setBounds(600,450,1000,20);
        c6.setForeground(Color.blue);
                c6.setFont(new Font("serif",Font.BOLD,20));
            ora.add(c6);

            JLabel c7 = new JLabel("Customer service: 00 1 650-506-7000 (Consumer)");
        c7.setBounds(600,480,1000,20);
        c7.setForeground(Color.blue);
                c7.setFont(new Font("serif",Font.BOLD,20));
            ora.add(c7);
            
       JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            ora.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            ora.add(bc);
            bc.addActionListener(this);

        ora.setVisible(true);
    }
         @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
    }
        public static void main(String args[])
        {
            new Ora();
        }
}