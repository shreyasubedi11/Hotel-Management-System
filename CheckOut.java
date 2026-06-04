package  HotelMangementSystem;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;


public class Checkout extends JFrame implements ActionListener{
    
    Choice ccustomerid;
    JLabel lblroomnumber,lblcheckintime, lblcheckouttime;
    JButton back,checkout;
    Checkout(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Checkout");
        text.setBounds(100,20,100,30);
        text.setFont(new Font("Times New Roman", Font.BOLD, 20));
        text.setForeground(new Color(139, 69, 19));
        add(text);
        
        JLabel lblid = new JLabel("Customer Id");
        lblid.setBounds(30,80,100,30);
        add(lblid);
        
        ccustomerid = new Choice();
        ccustomerid.setBounds(150,80,150,25);
        add(ccustomerid);
       
     
       
       
        
         JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(30,130,100,30);
        add(lblroom);
        
        lblroomnumber = new JLabel();
        lblroomnumber.setBounds(150,130,100,30);
        add(lblroomnumber);
        
        JLabel lblcheckin = new JLabel("Checkin Time");
        lblcheckin.setBounds(30,180,100,30);
        add(lblcheckin);
        
         lblcheckintime = new JLabel();
        lblcheckintime.setBounds(150,180,180,30);
        add(lblcheckintime);
        
         JLabel lblcheckout = new JLabel("Checkout Time");
        lblcheckout.setBounds(30,230,100,30);
        add(lblcheckout);
        
        Date date = new Date();
        lblcheckouttime = new JLabel("" + date);
        lblcheckouttime.setBounds(150,230,180,30);//180 for full date showing
        add(lblcheckouttime);
        
        back = new JButton ("Back");
    back.setOpaque(true); 
    back.setBackground(new Color(139, 69, 19)); 
    back.setFont(new Font("Times New Roman", Font.BOLD, 13));
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    back.setBounds(200,440,120,30);
    add(back);
    
    checkout = new JButton ("Checkout");
    checkout.setOpaque(true); 
    checkout.setBackground(new Color(139, 69, 19)); 
    checkout.setFont(new Font("Times New Roman", Font.BOLD, 13));
   checkout.setForeground(Color.WHITE);
   checkout.addActionListener(this);
    checkout.setBounds(30,440,120,30);
    add(checkout);
        
       try{
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from customer");
           while(rs.next()){
               ccustomerid.add(rs.getString("number"));
               lblroomnumber.setText(rs.getString("room"));
               lblcheckintime.setText(rs.getString("checkintime"));
           }
}catch(Exception e){
    e.printStackTrace();
           
       } 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/m.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 400, Image.SCALE_SMOOTH); // Use SCALE_SMOOTH for better quality
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(460, 80, 700, 400); //95 from the top
        add(image);
         
      setBounds(350, 150, 1200, 580);
     setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkout){
         String query1 = "delete from customer where number = '" +  ccustomerid.getSelectedItem() + "'";
            String query2 = "update room set availability = 'Available' where roomnumber = '" + lblroomnumber + "'";
          try{
           Conn c = new Conn();
           c.s.executeUpdate(query1);
           c.s.executeUpdate(query2);
           
     JOptionPane.showMessageDialog(null, "Checkout Done");
                setVisible(false);
                new AddReception();
            } catch (Exception e) {
                e.printStackTrace();
            }
          
          
        } else  {
            setVisible(false);
            new AddReception();
        }
    }
    public static void main(String args[]){
        new Checkout();
    }
    
}
