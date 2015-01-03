import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class ComData extends JFrame implements ActionListener
{
    ComData()
    {
        JFrame cd = new JFrame();
        cd.setTitle("Logo page");
        cd.setSize(1375,750);
        cd.setLayout(null);
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JLabel lo = new JLabel("A2Z Freshers");
        lo.setBounds(600,25,500,30);
        lo.setForeground(Color.red);
        lo.setFont(new Font("serif",Font.BOLD,30));
        cd.add(lo);

        JLabel lo0 = new JLabel("We're allied with..........");
        lo0.setBounds(50,75,300,30);
        lo0.setForeground(Color.orange);
        lo0.setFont(new Font("serif",Font.BOLD,30));
        cd.add(lo0);
        
        JButton lo1=new JButton(new ImageIcon("G:\\logos\\select\\audi.jpg"));
        lo1.setBounds(75,120,200,150);
        lo1.setActionCommand("Audi");
        cd.add(lo1);
        lo1.addActionListener(this);
                
        JButton lo2=new JButton(new ImageIcon("G:\\logos\\select\\jaguar.jpg"));
        lo2.setBounds(300,120,325,160);
        lo2.setActionCommand("Jaguar");
        cd.add(lo2);
        lo2.addActionListener(this);

        JButton lo3=new JButton(new ImageIcon("G:\\logos\\select\\vw.jpg"));
        lo3.setBounds(650,120,220,180);
        lo3.setActionCommand("Volkswagon");
        cd.add(lo3);
        lo3.addActionListener(this);
                
        JButton lo4=new JButton(new ImageIcon("G:\\logos\\select\\BMW.jpg"));
        lo4.setBounds(900,120,300,150);
        lo4.setActionCommand("BMW");
        cd.add(lo4);
        lo4.addActionListener(this);
                
        JButton lo5=new JButton(new ImageIcon("G:\\logos\\select\\cat.jpg"));
        lo5.setBounds(75,400,200,150);
        lo5.setActionCommand("Caterpillar");
        cd.add(lo5);
        lo5.addActionListener(this);
        
        JButton lo6=new JButton(new ImageIcon("G:\\logos\\select\\ora.jpg"));
    lo6.setBounds(300,400,310,160);
    lo6.setActionCommand("Oracle");
    cd.add(lo6);
    lo6.addActionListener(this);
                
        JButton lo7=new JButton(new ImageIcon("G:\\logos\\select\\wipro.jpg"));
    lo7.setBounds(650,400,200,190);
    lo7.setActionCommand("Wipro");
    cd.add(lo7);
    lo7.addActionListener(this);
                
        JButton lo8=new JButton(new ImageIcon("G:\\logos\\select\\tata.jpg"));
    lo8.setBounds(900,400,200,150);
    lo8.setActionCommand("TATA");
    cd.add(lo8);
    lo8.addActionListener(this);
                
        JLabel lo9=new JLabel("......and many more");
    lo9.setBounds(950,500,350,150);
        lo9.setForeground(Color.orange);
        lo9.setFont(new Font("serif",Font.BOLD,30));
    cd.add(lo9);
        
         JLabel lc = new JLabel();
        lc.setBounds(525,650,800,30);
        lc.setText("Click on the button to go to the application");
        lc.setFont(new Font("serif",Font.BOLD,20));
        lc.setForeground(Color.red);
        cd.add(lc);

        JButton bc = new JButton();
        bc = new JButton("Enter me");
        bc.setBounds(900,650,200,30);
        bc.setActionCommand("Enter me");
        bc.setFont(new Font("serif",Font.BOLD,20));
        cd.add(bc);
        bc.addActionListener(this);
        
                
        cd.setVisible(true);
        JOptionPane.showMessageDialog(null,"Click on the logo to know about the company");
       }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand() == "Audi")
            new Audi();
        if(e.getActionCommand() == "Jaguar")
            new Jaguar();
        if(e.getActionCommand() == "Volkswagon")
            new Volkswagon();
        if(e.getActionCommand() == "BMW")
            new BMW();
      if(e.getActionCommand() == "Caterpillar")
            new Cat();
       if(e.getActionCommand() == "Oracle")
            new Ora();
        if(e.getActionCommand() == "Wipro")
            new Wipro();
        if(e.getActionCommand() == "TATA")
            new Tata();
        
        if(e.getActionCommand() == "TATA")
            new Tata();

        if(e.getActionCommand() == "Enter me")
            new online();

        
    }
    public static void main(String args[])
    {
        new ComData();
    }
}