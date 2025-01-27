package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo(){
        Border border = BorderFactory.createLineBorder(Color.BLACK,3);

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(Color.gray);
        table.setBorder(border);
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {

            conn c = new conn();
            String q = "select * from Customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setForeground(Color.WHITE);
        id.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(150,11,100,14);
        number.setForeground(Color.WHITE);
        number.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(270,11,100,14);
        name.setForeground(Color.WHITE);
        name.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360,11,100,14);
        gender.setForeground(Color.WHITE);
        gender.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480,11,100,25);
        country.setForeground(Color.WHITE);
        country.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(600,11,100,14);
        room.setForeground(Color.WHITE);
        room.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(room);

        JLabel Time = new JLabel("CI Time");
        Time.setBounds(680,11,100,14);
        Time.setForeground(Color.WHITE);
        Time.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(Time);

        JLabel Deposit = new JLabel("Deposit");
        Deposit.setBounds(800,11,100,25);
        Deposit.setForeground(Color.WHITE);
        Deposit.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(Deposit);

        JButton back = new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);

        JButton clear = new JButton("Clear");
        clear.setBounds(300,510,120,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        panel.add(clear);

        // Add this where you defined the clear button action listener:
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        panel,
                        "This will delete ALL customer data. Are you sure?",
                        "Confirm Clear",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

                if (choice == JOptionPane.YES_OPTION) {
                    try {
                        conn c = new conn();
                        String truncateQuery = "TRUNCATE TABLE Customer";
                        c.statement.executeUpdate(truncateQuery);

                        // Refresh the table display
                        String refreshQuery = "SELECT * FROM Customer";
                        ResultSet resultSet = c.statement.executeQuery(refreshQuery);
                        table.setModel(DbUtils.resultSetToTableModel(resultSet));

                        JOptionPane.showMessageDialog(
                                panel,
                                "All customer data has been cleared successfully!",
                                "Success",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                panel,
                                "Error clearing data: " + ex.getMessage(),
                                "Error",
                                JOptionPane.ERROR_MESSAGE
                        );
                        ex.printStackTrace();
                    }
                }
            }
        });



        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerInfo();
    }
}
