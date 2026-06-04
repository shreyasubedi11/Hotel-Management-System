
package HotelMangementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;


public class Employeeinfo extends JFrame implements ActionListener{
    JTable table;
    JButton back;
Employeeinfo(){
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    
   

        JLabel ll = new JLabel("Name");
        ll.setFont(new Font("Times New Roman", Font.BOLD, 13));
        ll.setForeground(new Color(139, 69, 19));
        ll.setBounds(3, 10, 100, 20);
        add(ll);

        JLabel l2 = new JLabel("Age");
        l2.setBounds(110, 10, 100, 20);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l2.setForeground(new Color(139, 69, 19));
        add(l2);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(250, 10, 100, 20);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l3.setForeground(new Color(139, 69, 19));
        add(l3);

        JLabel l4 = new JLabel("Job");
        l4.setBounds(390, 10, 100, 20);
        l4.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l4.setForeground(new Color(139, 69, 19));
        add(l4);

        JLabel l5 = new JLabel("Salary");
        l5.setBounds(495, 10, 100, 20);
        l5.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l5.setForeground(new Color(139, 69, 19));
        add(l5);

        JLabel l6 = new JLabel("PhoneNumber");
        l6.setBounds(615, 10, 100, 20);
        l6.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l6.setForeground(new Color(139, 69, 19));
        add(l6);

        JLabel l7 = new JLabel("Email");
        l7.setBounds(750, 10, 100, 20);
        l7.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l7.setForeground(new Color(139, 69, 19));
        add(l7);

        JLabel l8 = new JLabel("Citizenship.No.");
        l8.setBounds(870, 10, 100, 20);
        l8.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l8.setForeground(new Color(139, 69, 19));
        add(l8);
         
        table = new JTable();
        table.setBounds(0,40,1000,400);
        add(table);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch (Exception e){
            e.printStackTrace();
        }
    back = new JButton ("Back");
   
    back.setOpaque(true); // Set the label to be opaque background color milaunu parney bela only not needed for foreground color change
    back.setBackground(new Color(139, 69, 19)); // Set the background color
    back.setFont(new Font("Times New Roman", Font.BOLD, 13));
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    back.setBounds(200,500,120,30);
    add(back);
    
   setBounds(300,200,1050,600);
   setVisible(true);
   
   
}   
public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new AddReception();
}
public static void main(String[]args){
    new Employeeinfo();
}
}
