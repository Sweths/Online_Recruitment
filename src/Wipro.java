import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Wipro extends JFrame implements ActionListener
{
        Wipro()
    {
        JFrame wip = new JFrame();
        wip.setTitle("Wipro Limited");
        wip.setSize(1365,770);
                wip.setLayout(null);
                wip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\wipro logo.jpg"));
        im.setBounds(50,200,300,200);
        wip.add(im);
        
         JLabel jt = new JLabel("Wipro Limited");
        jt.setBounds(500,50,200,30);
        jt.setForeground(Color.red);
        jt.setFont(new Font("serif",Font.BOLD,30));
            wip.add(jt);

        JLabel j1 = new JLabel("Wipro Limited is a multinational IT Consulting and System Integration services ");
        j1.setBounds(600,200,1000,30);
        j1.setForeground(Color.blue);
        j1.setFont(new Font("serif",Font.BOLD,20));
            wip.add(j1);
            
            JLabel j2 = new JLabel("Stock price: 507685 (BSE) Rs. 568.15 +0.20 (+0.04%)");
        j2.setBounds(600,250,1000,20);
        j2.setForeground(Color.blue);
        j2.setFont(new Font("serif",Font.BOLD,20));
        wip.add(j2);
            
              
        JLabel j3 = new JLabel("Headquarters: Bangalore");
        j3.setBounds(600,300,1000,20);
        j3.setForeground(Color.blue);
        j3.setFont(new Font("serif",Font.BOLD,20));
        wip.add(j3);
            
              JLabel j4 = new JLabel("Founded: 1945, India");
        j4.setBounds(600,350,1000,20);
        j4.setForeground(Color.blue);
                j4.setFont(new Font("serif",Font.BOLD,20));
            wip.add(j4);
            
             JLabel j5 = new JLabel("CEO: T K Kurien");
        j5.setBounds(600,400,1000,20);
        j5.setForeground(Color.blue);
                j5.setFont(new Font("serif",Font.BOLD,20));
            wip.add(j5);
            
       JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            wip.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            wip.add(bc);
            bc.addActionListener(this);

        wip.setVisible(true);
    }
         @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
    }
        public static void main(String args[])
        {
            new Wipro();
        }
}