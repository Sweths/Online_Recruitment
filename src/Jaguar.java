import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Jaguar extends JFrame implements ActionListener
{
        Jaguar()
    {
        JFrame jag = new JFrame();
        jag.setTitle("Jaguar cars");
        jag.setSize(1365,770);
                jag.setLayout(null);
                jag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\jaguar logo.png"));
        im.setBounds(50,250,300,200);
        jag.add(im);

                JLabel jt = new JLabel("Jaguar cars");
        jt.setBounds(500,50,200,30);
        jt.setForeground(Color.red);
        jt.setFont(new Font("serif",Font.BOLD,30));
            jag.add(jt);
                
                JLabel j1 = new JLabel("Jaguar Cars is a brand of Jaguar Land Rover, a British multinational car");
        j1.setBounds(600,200,1000,30);
        j1.setForeground(Color.blue);
        j1.setFont(new Font("serif",Font.BOLD,20));
            jag.add(j1);
            
            JLabel j2 = new JLabel("manufacturer ,owned by Indian Tata Motors since 2008. ");
        j2.setBounds(600,220,1000,20);
        j2.setForeground(Color.blue);
        j2.setFont(new Font("serif",Font.BOLD,20));
        jag.add(j2);
            
              
        JLabel j3 = new JLabel("Headquarters:Whitley, Coventry, England");
        j3.setBounds(600,300,1000,20);
        j3.setForeground(Color.blue);
        j3.setFont(new Font("serif",Font.BOLD,20));
        jag.add(j3);
            
              JLabel j4 = new JLabel("Founders: William Walmsley, William Lyons");
        j4.setBounds(600,350,1000,20);
        j4.setForeground(Color.blue);
                j4.setFont(new Font("serif",Font.BOLD,20));
            jag.add(j4);
            
             JLabel j5 = new JLabel("Founded: 1922");
        j5.setBounds(600,400,1000,20);
        j5.setForeground(Color.blue);
                j5.setFont(new Font("serif",Font.BOLD,20));
            jag.add(j5);
            
             JLabel j6 = new JLabel("CEO: Ralf Speth");
        j6.setBounds(600,450,1000,20);
        j6.setForeground(Color.blue);
                j6.setFont(new Font("serif",Font.BOLD,20));
            jag.add(j6);
            
            JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            jag.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            jag.add(bc);
            bc.addActionListener(this);

        jag.setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
              
    }
        public static void main(String args[])
        {
            new Jaguar();
        }
}