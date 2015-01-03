import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Cat extends JFrame implements ActionListener
{
        Cat()
    {
        JFrame cat = new JFrame();
        cat.setSize(1365,770);
        cat.setTitle("Caterpillar Inc.");
        cat.setLayout(null);
                cat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel im = new JLabel(new ImageIcon("G:\\4th semester\\ADBMS\\project\\cat(1).jpg"));
        im.setBounds(50,250,300,200);
        cat.add(im);

        JLabel ct = new JLabel("Caterpillar Inc.");
        ct.setBounds(500,50,200,30);
        ct.setForeground(Color.red);
        ct.setFont(new Font("serif",Font.BOLD,30));
            cat.add(ct);
        
        JLabel c1 = new JLabel("An American corporation which designs, manufactures, markets and");
        c1.setBounds(600,200,1000,30);
        c1.setForeground(Color.blue);
        c1.setFont(new Font("serif",Font.BOLD,20));
            cat.add(c1);
            
            JLabel c2 = new JLabel(" sells machinery and engines and sells financial products and insurance to customers via a worldwide dealer network.");
        c2.setBounds(600,250,1000,20);
        c2.setForeground(Color.blue);
        c2.setFont(new Font("serif",Font.BOLD,20));
        cat.add(c2);
            
              
        JLabel c3 = new JLabel("Stock price: CAT (NYSE) US$ 97.39 +1.18 (+1.23%)");
        c3.setBounds(600,300,1000,20);
        c3.setForeground(Color.blue);
        c3.setFont(new Font("serif",Font.BOLD,20));
        cat.add(c3);
            
              JLabel c4 = new JLabel("Headquarters:Peoria, IL, United States of America");
        c4.setBounds(600,350,1000,20);
        c4.setForeground(Color.blue);
                c4.setFont(new Font("serif",Font.BOLD,20));
            cat.add(c4);
            
             JLabel c5 = new JLabel("Founders:Daniel Best, Benjamin Holt");
        c5.setBounds(600,400,1000,20);
        c5.setForeground(Color.blue);
                c5.setFont(new Font("serif",Font.BOLD,20));
            cat.add(c5);
            
             JLabel c6 = new JLabel("Founded:1925");
        c6.setBounds(600,450,1000,20);
        c6.setForeground(Color.blue);
                c6.setFont(new Font("serif",Font.BOLD,20));
            cat.add(c6);

            JLabel c7 = new JLabel("CEO:Douglas R Oberhelman");
        c7.setBounds(600,480,1000,20);
        c7.setForeground(Color.blue);
                c7.setFont(new Font("serif",Font.BOLD,20));
            cat.add(c7);
            
        JLabel lc = new JLabel();
            lc.setBounds(500,650,800,30);
            lc.setText("Click on the button to go back to the logo page");
            lc.setFont(new Font("serif",Font.BOLD,20));
            lc.setForeground(Color.red);
            cat.add(lc);

            JButton bc;
            bc = new JButton("Click me");
            bc.setBounds(900,650,200,30);
            bc.setActionCommand("Click me");
            bc.setFont(new Font("serif",Font.BOLD,20));
            cat.add(bc);
            bc.addActionListener(this);

        cat.setVisible(true);
    }
         @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (e.getActionCommand()=="Click me")
                new ComData();         
       
    }
        public static void main(String args[])
        {
            new Cat();
        }
}