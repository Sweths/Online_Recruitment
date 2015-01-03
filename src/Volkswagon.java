import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Volkswagon extends JFrame implements ActionListener
{
        Volkswagon()
    {
        JFrame vol = new JFrame();
        vol.setTitle("Volkswagen group");
        vol.setSize(1365,770);
                vol.setLayout(null);
                vol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\volkswagon logo.png"));
        im.setBounds(50,250,300,200);
        vol.add(im);

        JLabel vt = new JLabel("Volkswagen Group");
        vt.setBounds(500,50,200,30);
        vt.setForeground(Color.red);
        vt.setFont(new Font("serif",Font.BOLD,30));
            vol.add(vt);
        
        JLabel v1 = new JLabel("Volkswagen Group is a German multinational automotive company ");
        v1.setBounds(600,200,1000,30);
        v1.setForeground(Color.blue);
        v1.setFont(new Font("serif",Font.BOLD,20));
            vol.add(v1);
            
            JLabel v2 = new JLabel("Stock price: vow3 (XETRA) € 179.95 -0.90 (-0.50%)");
        v2.setBounds(600,250,1000,20);
        v2.setForeground(Color.blue);
        v2.setFont(new Font("serif",Font.BOLD,20));
        vol.add(v2);
            
              
        JLabel v3 = new JLabel("Headquarters:Wolfsburg, Germany");
        v3.setBounds(600,300,1000,20);
        v3.setForeground(Color.blue);
        v3.setFont(new Font("serif",Font.BOLD,20));
        vol.add(v3);
            
              JLabel v4 = new JLabel("Founders:German Labour Front");
        v4.setBounds(600,350,1000,20);
        v4.setForeground(Color.blue);
                v4.setFont(new Font("serif",Font.BOLD,20));
            vol.add(v4);
            
             JLabel v5 = new JLabel("Founded:May 28, 1937, Germany");
        v5.setBounds(600,400,1000,20);
        v5.setForeground(Color.blue);
                v5.setFont(new Font("serif",Font.BOLD,20));
            vol.add(v5);
            
             JLabel v6 = new JLabel("CEO: Martin Winterkorn");
        v6.setBounds(600,450,1000,20);
        v6.setForeground(Color.blue);
                v6.setFont(new Font("serif",Font.BOLD,20));
            vol.add(v6);

            JLabel v7 = new JLabel("Slogan : Das Auto");
        v7.setBounds(600,480,1000,20);
        v7.setForeground(Color.blue);
                v7.setFont(new Font("serif",Font.BOLD,20));
            vol.add(v7);
            
               JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            vol.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            vol.add(bc);
            bc.addActionListener(this);

        vol.setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
              
    }
    
        public static void main(String args[])
        {
            new Volkswagon();
        }
}