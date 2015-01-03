import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BMW extends JFrame implements ActionListener
{
        BMW()
    {
        JFrame bmw = new JFrame();
        bmw.setTitle("BMW");
        bmw.setSize(1365,770);
                bmw.setLayout(null);
                bmw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\BMW logo.png"));
        im.setBounds(50,250,300,200);
        bmw.add(im);

        JLabel bt = new JLabel("BMW");
        bt.setBounds(500,50,200,30);
        bt.setForeground(Color.red);
        bt.setFont(new Font("serif",Font.BOLD,30));
            bmw.add(bt);
        
        JLabel b1 = new JLabel("Bayerische Motoren Werke AG, commonly known as BMW or BMW ");
        b1.setBounds(600,200,1000,30);
        b1.setForeground(Color.blue);
        b1.setFont(new Font("serif",Font.BOLD,20));
            bmw.add(b1);
            
            JLabel b2 = new JLabel("AG, is a German automobile, motorcycle and engine manufacturing company");
        b2.setBounds(600,250,1000,20);
        b2.setForeground(Color.blue);
        b2.setFont(new Font("serif",Font.BOLD,20));
        bmw.add(b2);
            
              
        JLabel b3 = new JLabel("Stock price: BMW (XETRA) € 88.40 +1.10 (+1.26%)");
        b3.setBounds(600,300,1000,20);
        b3.setForeground(Color.blue);
        b3.setFont(new Font("serif",Font.BOLD,20));
        bmw.add(b3);
            
              JLabel b4 = new JLabel("Headquarters: Munich, Bavaria, Germany");
        b4.setBounds(600,350,1000,20);
        b4.setForeground(Color.blue);
                b4.setFont(new Font("serif",Font.BOLD,20));
            bmw.add(b4);
            
             JLabel b5 = new JLabel("Founder: Franz Josef Popp");
        b5.setBounds(600,400,1000,20);
        b5.setForeground(Color.blue);
                b5.setFont(new Font("serif",Font.BOLD,20));
            bmw.add(b5);
            
             JLabel b6 = new JLabel("Founded: March 7, 1916, Milbertshofen-Am Hart, Germany");
        b6.setBounds(600,450,1000,20);
        b6.setForeground(Color.blue);
                b6.setFont(new Font("serif",Font.BOLD,20));
            bmw.add(b6);

            JLabel b7 = new JLabel("CEO: Norbert Reithofer");
        b7.setBounds(600,480,1000,20);
        b7.setForeground(Color.blue);
                b7.setFont(new Font("serif",Font.BOLD,20));
            bmw.add(b7);
            
           JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            bmw.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            bmw.add(bc);
            bc.addActionListener(this);

        bmw.setVisible(true);
    }
         @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
    }
        public static void main(String args[])
        {
            new BMW();
        }
}