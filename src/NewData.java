import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class NewData extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	JButton btn1;
	JComboBox type;
	String[] description = {"  ","Male","Female"};
	int i,count = 0;
	NewData()
	{
		setTitle("Online Recruitment");
		setSize(1365,770);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("A2Z Freshers");
		l1.setBounds(500,30,700,30);
		l1.setForeground(Color.red);
		l1.setFont(new Font("serif",Font.BOLD,20));
		add(l1);

		l2 = new JLabel("Name:");
		l2.setBounds(360,100,400,30);
		l2.setForeground(Color.blue);
		l2.setFont(new Font("serif",Font.BOLD,20));
		add(l2);

		l3 = new JLabel("Parent/Guardian");
		l3.setBounds(360,140,400,30);
		l3.setForeground(Color.blue);
		l3.setFont(new Font("serif",Font.BOLD,20));
		add(l3);

		l4 = new JLabel("Gender");
		l4.setBounds(360,180,400,30);
		l4.setForeground(Color.blue);
		l4.setFont(new Font("serif",Font.BOLD,20));
		add(l4);

		l5 = new JLabel("Age(no. as in 2014):");
		l5.setBounds(360,220,400,30);
		l5.setForeground(Color.blue);
		l5.setFont(new Font("serif",Font.BOLD,20));
		add(l5);

		l6 = new JLabel("Email(ex@xyz.com):");
		l6.setBounds(360,260,400,30);
		l6.setForeground(Color.blue);
		l6.setFont(new Font("serif",Font.BOLD,20));
		add(l6);

		l7 = new JLabel("Qualification:");
		l7.setBounds(360,300,400,30);
		l7.setForeground(Color.blue);
		l7.setFont(new Font("serif",Font.BOLD,20));
		add(l7);	

		l8 = new JLabel("College:");
		l8.setBounds(360,340,400,30);
		l8.setForeground(Color.blue);
		l8.setFont(new Font("serif",Font.BOLD,20));
		add(l8);	

		l9 = new JLabel("Percent:");
		l9.setBounds(360,380,400,30);
		l9.setForeground(Color.blue);
		l9.setFont(new Font("serif",Font.BOLD,20));
		add(l9);

		l10 = new JLabel("Areas of interest:");
		l10.setBounds(360,420,400,30);
		l10.setForeground(Color.blue);
		l10.setFont(new Font("serif",Font.BOLD,20));
		add(l10);

		tf1 = new JTextField();
		tf1.setBounds(600,100,300,30);
		add(tf1);

		tf2 = new JTextField();
		tf2.setBounds(600,140,300,30);
		add(tf2);

		type = new JComboBox();
		for(i=0;i<3;i++)
			while(count< description.length)
      		type.addItem(description[count++]);
                type.setBounds(600,180,300,30);
                add(type);

		tf3 = new JTextField();
		tf3.setBounds(600,220,300,30);
		add(tf3);

		tf4 = new JTextField();
		tf4.setBounds(600,260,300,30);
		add(tf4);

		tf5 = new JTextField();
		tf5.setBounds(600,300,300,30);
		add(tf5);

		tf6 = new JTextField();
		tf6.setBounds(600,340,300,30);
		add(tf6);

		tf7 = new JTextField();
		tf7.setBounds(600,380,300,30);
		add(tf7);

		tf8 = new JTextField();
		tf8.setBounds(600,420,300,30);
		add(tf8);

		btn1 = new JButton("Submit");
		btn1.setBounds(500,480,100,30);
		btn1.setActionCommand("Registered");
		btn1.setFont(new Font("serif",Font.BOLD,20));
		add(btn1);
		btn1.addActionListener(this);
		setVisible(true);

		}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand()=="Registered")
				showData();
		else if(e.getActionCommand()=="Click on me")
			new RegData();
	
    }
	public void showData()
	{
		
		JLabel l,l0;
		String str1 = tf1.getText();
		String str2 = tf2.getText();
		String str3 = tf3.getText();
		String str4 = tf4.getText();
		String str5 = tf5.getText();
		String str6 = tf6.getText();
		String str7 = tf7.getText();
		String str8 = tf8.getText();
		if(tf1.getText().length()>0 && tf2.getText().length()>0 && tf3.getText().length()>0 && tf4.getText().length()>0 && tf5.getText().length()>0 && tf6.getText().length()>0 && tf7.getText().length()>0 && tf8.getText().length()>0)
		  	{
		 	try{
			Class.forName("oracle.jdbc.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","sweths");
			String query = "insert into onl_rec(name,parent,age,email,qualification,college,percent,interest_area) values('"+str1+"','"+str2+"',"+str3+",'"+str4+"','"+str5+"','"+str6+"',"+str7+",'"+str8+"')";		
    		Statement stmt = con.createStatement();
    		System.out.println("Insert Record Query :"+query);
		 	stmt.executeUpdate(query);
			System.out.println("\nRecord Inserted Successfully");
    		
    		}
			catch(Exception e)
			{
				System.out.println(e);
			}
                       
		JFrame f1 = new JFrame();
		f1.setSize(1365,770);
		f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        l = new JLabel();
		l.setBounds(480,200,400,30);
        l.setText("Welcome Mr/Ms "+str1);
        l.setFont(new Font("serif",Font.BOLD,30));
		l.setForeground(Color.red);
        f1.add(l);
                
        l0 = new JLabel();
		l0.setBounds(300,300,700,30);
        l0.setText("Your registration is successful & Send your bio-data to our email-id:a2z@aaa.com");
		l0.setFont(new Font("serif",Font.BOLD,20));
        l0.setForeground(Color.red);
		f1.add(l0);
		
        f1.setVisible(true);
        
        JLabel lc = new JLabel();
        lc.setBounds(100,650,800,30);
        lc.setText("Click on the button to check the status(by selecting 'Registered' button) of your application");
       	lc.setFont(new Font("serif",Font.BOLD,20));
        lc.setForeground(Color.red);
        f1.add(lc);

        JButton bc = new JButton();
        bc = new JButton("Click on me");
		bc.setBounds(900,650,200,30);
		bc.setActionCommand("Click on me");
		bc.setFont(new Font("serif",Font.BOLD,20));
		f1.add(bc);
		bc.addActionListener(this);
        
        }
		else
        {
           	JOptionPane.showMessageDialog(null,"Fill in all details ");
        } 
	}
	
    public static void main(String args[])
    {
        new NewData();
    }
}


