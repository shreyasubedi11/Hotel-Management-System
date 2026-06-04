
package HotelMangementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddReception extends JFrame implements ActionListener{
JButton newCustomer,rooms,department,allEmployee,managerInfo,customers,searchRoom,update,roomStatus;
JButton pickup,checkout,logout; 

    AddReception(){
getContentPane().setBackground(Color.WHITE);
setLayout(null);


newCustomer = new JButton("New Customer Form");
newCustomer.setBounds(10,30,270,30);
newCustomer.setFont(new Font("Raleway", Font.BOLD, 15));
newCustomer.setBackground(new Color(139, 69, 19));
newCustomer.setForeground(Color.white);
newCustomer.addActionListener(this);
add(newCustomer);


rooms = new JButton("Rooms");
rooms.setBounds(10,70,270,30);
rooms.setFont(new Font("Raleway", Font.BOLD, 15));
rooms.setBackground(new Color(139, 69, 19));
rooms.setForeground(Color.white);
rooms.addActionListener(this);
add(rooms);

department = new JButton("Department");
department.setBounds(10,110,270,30);
department.setFont(new Font("Raleway", Font.BOLD, 15));
department.setBackground(new Color(139, 69, 19));
department.setForeground(Color.white);
department.addActionListener(this);
add(department);

allEmployee = new JButton("All Employee");
allEmployee.setBounds(10,150,270,30);
allEmployee.setFont(new Font("Raleway", Font.BOLD, 15));
allEmployee.setBackground(new Color(139, 69, 19));
allEmployee.setForeground(Color.white);
allEmployee.addActionListener(this);
add(allEmployee);

customers = new JButton("Customer"); //how many cutomer are there in hotel ahile
customers.setBounds(10,190,270,30);
customers.setFont(new Font("Raleway", Font.BOLD, 15));
customers.setBackground(new Color(139, 69, 19));
customers.setForeground(Color.white);
customers.addActionListener(this);
add(customers);

managerInfo = new JButton("Manager"); 
managerInfo.setBounds(10,230,270,30);
managerInfo.setFont(new Font("Raleway", Font.BOLD, 15));
managerInfo.setBackground(new Color(139, 69, 19));
managerInfo.setForeground(Color.white);
managerInfo.addActionListener(this);
add(managerInfo);

 checkout = new JButton("Checkout"); 
checkout.setBounds(10,270,270,30);
checkout.setFont(new Font("Raleway", Font.BOLD, 15));
checkout.setBackground(new Color(139, 69, 19));
checkout.setForeground(Color.white);
checkout.addActionListener(this);
add(checkout);

update = new JButton("Update Status"); //update status
update.setBounds(10,310,270,30); 
update.setFont(new Font("Raleway", Font.BOLD, 15));
update.setBackground(new Color(139, 69, 19));
update.setForeground(Color.white);
update.addActionListener(this);
add(update);

 roomStatus = new JButton("Room Status"); 
roomStatus.setBounds(10,350,270,30); 
roomStatus.setFont(new Font("Raleway", Font.BOLD, 15));
roomStatus.setBackground(new Color(139, 69, 19));
roomStatus.setForeground(Color.white);
roomStatus.addActionListener(this);
add(roomStatus);

pickup = new JButton("Pickup Service"); 
pickup.setBounds(10,390,270,30); 
pickup.setFont(new Font("Raleway", Font.BOLD, 15));
pickup.setBackground(new Color(139, 69, 19));
pickup.setForeground(Color.white);
pickup.addActionListener(this);
add(pickup);

searchRoom = new JButton("Search Room"); //to check kun room is available kun not and so on
searchRoom.setBounds(10,430,270,30); 
searchRoom.setFont(new Font("Raleway", Font.BOLD, 15));
searchRoom.setBackground(new Color(139, 69, 19));
searchRoom.setForeground(Color.white);
searchRoom.addActionListener(this);
add(searchRoom);

 logout = new JButton("Logout ");
logout.setBounds(10,470,270,30); 
logout.setFont(new Font("Raleway", Font.BOLD, 15));
logout.setBackground(new Color(139, 69, 19));
logout.setForeground(Color.white);
logout.addActionListener(this);
add(logout);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/recep.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(290, 10, 900, 510);
        add(image);
        
        setBounds(350,200,1200,580);
setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource () == newCustomer ){
            setVisible(false);
            new AddCustomer();
        }else if(ae.getSource() == rooms){
            setVisible(false);
            new Room();
        } else if(ae.getSource() == department){
            setVisible(false);
            new Department();
        } else if (ae.getSource() == allEmployee){
            setVisible(false);
            new Employeeinfo();
        }else if (ae.getSource() == managerInfo){
            setVisible(false);
            new Managerinfo();
    }else if (ae.getSource() == customers){
            setVisible(false);
            new CustomersInfo();
    }else if (ae.getSource() == searchRoom){
            setVisible(false);
            new SearchRoom();
    }else if (ae.getSource() == update){
        setVisible(false);
        new UpdateCheck();
    }else if(ae.getSource() == roomStatus ){
        setVisible(false);
        new UpdateRoom();
    }else if(ae.getSource()== pickup ){
        setVisible(false);
        new Pickup();
    }else if(ae.getSource()== checkout){
        setVisible(false);
        new Checkout();
    }else if (ae.getSource() == logout){
        setVisible(false);
        System.exit(0);
        
    }
    }

    public static void main (String[]args){
new AddReception();
}
}
