package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {
    JTextField rn_val,price_val;
    JComboBox avail_val,clnSt_val,bedTp_val;
    JButton add_btn,back_btn;
    AddRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(109,109,109));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Add Rooms");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma", Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        rn_val =new JTextField();
        rn_val.setBounds(200,70,156,20);
        rn_val.setFont(new Font("Tahoma", Font.PLAIN, 14));
        rn_val.setForeground(Color.WHITE);
        rn_val.setBackground(new Color(109,109,109));
        panel.add(rn_val);

        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);

        avail_val =new JComboBox(new String[] {"Available", "Occupied"});
        avail_val.setBounds(200,110,156,20);
        avail_val.setFont(new Font("Tahoma", Font.PLAIN, 14));
        avail_val.setForeground(Color.WHITE);
        avail_val.setBackground(new Color(109,109,109));
        panel.add(avail_val);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        price_val =new JTextField();
        price_val.setBounds(200,150,156,20);
        price_val.setFont(new Font("Tahoma", Font.PLAIN, 14));
        price_val.setForeground(Color.WHITE);
        price_val.setBackground(new Color(109,109,109));
        panel.add(price_val);


        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        clnSt_val =new JComboBox(new String[]{"Cleaned","Dirty"});
        clnSt_val.setBounds(200,190,156,20);
        clnSt_val.setFont(new Font("Tahoma", Font.PLAIN, 14));
        clnSt_val.setForeground(Color.WHITE);
        clnSt_val.setBackground(new Color(109,109,109));
        panel.add(clnSt_val);

        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);

        bedTp_val =new JComboBox(new String[]{"Single Bed","Double Bed"});
        bedTp_val.setBounds(200,230,156,20);
        bedTp_val.setFont(new Font("Tahoma", Font.PLAIN, 14));
        bedTp_val.setForeground(Color.WHITE);
        bedTp_val.setBackground(new Color(109,109,109));
        panel.add(bedTp_val);

        add_btn = new JButton("Add");
        add_btn.setBounds(64,321,111,33);
        add_btn.setBackground(Color.BLACK);
        add_btn.setForeground(Color.WHITE);
        add_btn.addActionListener(this);
        panel.add(add_btn);

        back_btn = new JButton("Back");
        back_btn.setBounds(198,321,111,33);
        back_btn.setBackground(Color.BLACK);
        back_btn.setForeground(Color.WHITE);
        back_btn.addActionListener(this);
        panel.add(back_btn);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roombed.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);



        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_btn){ //when we click add button
            try{
                conn c = new conn();
                String room = rn_val.getText();
                String avail = (String) avail_val.getSelectedItem();
                String status = (String)  clnSt_val.getSelectedItem();
                String price = price_val.getText();
                String type =  (String) bedTp_val.getSelectedItem();

                String q = "insert into room values('"+room+"', '"+avail+"', '"+status+"', '"+price+"', '"+type+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Room Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
