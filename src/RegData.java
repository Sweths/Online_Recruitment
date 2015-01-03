import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class RegData extends JFrame implements ActionListener
{
    JFrame fd = new JFrame();
    JTextField tr1,tr2; 
    JLabel l,l0,lr0,lr1,lr2;
    JButton button;
    RegData()
    {
        fd.setTitle("Online Recruitment");
        fd.setSize(1365,770);
        fd.setLayout(null);
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        lr0 = new JLabel("A2Z Freshers");
        lr0.setForeground(Color.orange);
        lr0.setBounds(550,200,400,30);
        lr0.setFont(new Font("serif",Font.BOLD,36));
        fd.add(lr0);

        lr1 = new JLabel("Name:");
        lr1.setForeground(Color.blue);
        lr1.setBounds(360,350,400,30);
        lr1.setFont(new Font("serif",Font.BOLD,20));
        fd.add(lr1);

        lr2 = new JLabel("Email:");
        lr2.setForeground(Color.blue);
        lr2.setBounds(360,400,400,30);
        lr2.setFont(new Font("serif",Font.BOLD,20));
        fd.add(lr2);

        tr1 = new JTextField();
        tr1.setBounds(600,350,300,30);
        fd.add(tr1);

        tr2 = new JTextField();
        tr2.setBounds(600,400,300,30);
        fd.add(tr2);

        button = new JButton("Status");
        button.setBounds(500,580,100,50);
        button.setActionCommand("Status");
        button.setFont(new Font("serif",Font.BOLD,20));
        fd.add(button);
        button.addActionListener(this);

        fd.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand()== "Status")
             regFunc();
        if(e.getActionCommand() == "Enter me")
                new online();
            }
    public void regFunc()
    {
           

        Connection conn = null;
        Statement st = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;       
        
        String st1 = tr1.getText();
        String st2 = tr2.getText();
        
            
        
        if(tr1.getText().length()>0 && tr2.getText().length()>0)
            {
                
                
                JFrame fa = new JFrame();
                fa.setTitle("Report-age");
                fa.setSize(1375,750);
                fa.setLayout(null);
                fa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                fa.setVisible(true);
            try{

            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","sweths");
            PreparedStatement ps = conn.prepareStatement("select * from onl_rec where name=? and email = ?");
            ps.setString(1,st1);
            ps.setString(2,st2);
            rs = ps.executeQuery();

            if(rs.next())
            {
               

                String query = "SELECT * FROM onl_rec WHERE age BETWEEN 23 AND 30";     
                st = conn.createStatement();
                rs1 = st.executeQuery(query);

                JLabel la10 = new JLabel("Details of people selected by INICK INFOTECH");
                la10.setBounds(500,25,400,30);
                fa.add(la10);
                
                JLabel lac = new JLabel();
                lac.setText("Name                        Parent                  Age                         Email                         Qualification          College                 Percent                  Interest_area");
                lac.setBounds(0,75,1000,30);
                fa.add(lac);
                
                
                int x=125;
                while(rs1.next())
                {
                    int y=0;
                    for(int i=1;i<=8;i++)
                    {
                                        
                        JLabel laj=new JLabel();
                        laj.setText(rs1.getString(i));
                        laj.setBounds(y,x,100,30);
                        fa.add(laj);
                        y+=100;
                    }   
                                
                    x+=75;
                    System.out.println(rs1.getString(1)+" , "+rs1.getString(2)+" , "+rs1.getInt(3)+" , "+rs1.getString(4)+" , "+rs1.getString(5)+" , "+rs1.getString(6)+" , "+rs1.getInt(7)+" , "+rs1.getString(8));
                }
                System.out.println("Record retrieved Successfully\n\n");                                                                               
                        
                JFrame fi = new JFrame();
                fi.setTitle("Report-Interest_area(DBMS)");
                fi.setSize(1375,750);
                fi.setLayout(null);
                fi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                fi.setVisible(true);
        
                JLabel li0 = new JLabel("Details of people selected by ORACLE");
                li0.setBounds(500,25,400,30);
                fi.add(li0);
                
                 JLabel lic = new JLabel();
                lic.setText("Name                        Parent                  Age                         Email                         Qualification          College                 Percent                  Interest_area");
                lic.setBounds(0,75,1000,30);
                fi.add(lic);
                        
                String query1 = "SELECT * FROM onl_rec WHERE interest_area ='DBMS'";        
                st = conn.createStatement();
                rs2 = st.executeQuery(query1);
                int a=125;
                while(rs2.next())
                {
                    int b=0;
                    for(int j=1;j<=8;j++)
                    {
                        JLabel lij=new JLabel();
                        lij.setText(rs2.getString(j));
                        lij.setBounds(b,a,100,30);
                        fi.add(lij);
                        b+=100;
                    }   
                    a+=75;
                    System.out.println(rs2.getString(1)+" , "+rs2.getString(2)+" , "+rs2.getInt(3)+" , "+rs2.getString(4)+" , "+rs2.getString(5)+" , "+rs2.getString(6)+" , "+rs2.getInt(7)+" , "+rs2.getString(8));
                }
                System.out.println("Record retrieved Successfully");

             JFrame fr = new JFrame();
                fr.setSize(1365,770);
                fr.setLayout(null);
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                l = new JLabel();
                l.setBounds(500,250,400,30);
                l.setText("Welcome Mr/Ms "+st1);
                l.setFont(new Font("serif",Font.BOLD,30));
                l.setForeground(Color.red);
                fr.add(l);
                
                l0 = new JLabel();
                l0.setBounds(50,400,1200,30);
                l0.setText("The applications are under process. Switch tabs to know if you are in any of the selected list.If not please wait until all processings are complete");
                l0.setFont(new Font("serif",Font.BOLD,20));
                l0.setForeground(Color.red);
                fr.add(l0);

                JLabel lc = new JLabel();
        lc.setBounds(525,650,800,30);
        lc.setText("Click on the button to go to the application");
        lc.setFont(new Font("serif",Font.BOLD,20));
        lc.setForeground(Color.red);
        fr.add(lc);

        JButton bc = new JButton();
        bc = new JButton("Enter me");
        bc.setBounds(900,650,200,30);
        bc.setActionCommand("Enter me");
        bc.setFont(new Font("serif",Font.BOLD,20));
        fr.add(bc);
        bc.addActionListener(this);
        
                fr.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Your application is not yet being registered.Register your application");
            }
            }        
            catch(Exception e)
            {
                System.out.println(e);
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fill in all details ");
            }
    }
    public static void main(String args[])
    {
        new RegData();
    }
}