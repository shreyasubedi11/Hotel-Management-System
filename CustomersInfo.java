
package HotelMangementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class CustomersInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;

    CustomersInfo() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

      

        JLabel ll = new JLabel("Document Type");
        ll.setFont(new Font("Times New Roman", Font.BOLD, 13));
        ll.setForeground(new Color(139, 69, 19));
        ll.setBounds(3, 10, 100, 20);
        add(ll);

        JLabel l2 = new JLabel("Number");
        l2.setBounds(155, 10, 100, 20);
        l2.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l2.setForeground(new Color(139, 69, 19));
        add(l2);

        JLabel l3 = new JLabel("Name");
        l3.setBounds(275, 10, 100, 20);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l3.setForeground(new Color(139, 69, 19));
        add(l3);

        JLabel l4 = new JLabel("Gender");
        l4.setBounds(385, 10, 100, 20);
        l4.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l4.setForeground(new Color(139, 69, 19));
        add(l4);

        JLabel l5 = new JLabel("Country");
        l5.setBounds(510, 10, 100, 20);
        l5.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l5.setForeground(new Color(139, 69, 19));
        add(l5);

        JLabel l6 = new JLabel("Room Number");
        l6.setBounds(645, 10, 100, 20);
        l6.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l6.setForeground(new Color(139, 69, 19));
        add(l6);

        JLabel l7 = new JLabel("Check in time");
        l7.setBounds(785, 10, 100, 20);
        l7.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l7.setForeground(new Color(139, 69, 19));
        add(l7);

        JLabel l8 = new JLabel("Deposit");
        l8.setBounds(915, 10, 100, 20);
        l8.setFont(new Font("Times New Roman", Font.BOLD, 13));
        l8.setForeground(new Color(139, 69, 19));
        add(l8);

        table = new JTable();
         table.setBounds(0, 40, 1000, 400);
        add(table);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM customer");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }

        back = new JButton("Back");
        back.setOpaque(true);
        back.setBackground(new Color(139, 69, 19));
        back.setFont(new Font("Times New Roman", Font.BOLD, 13));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(445, 500, 120, 30);
        add(back);

        setBounds(300, 200, 1050, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new AddReception();
    }

    public static void main(String[] args) {
        new CustomersInfo();
    }
}

