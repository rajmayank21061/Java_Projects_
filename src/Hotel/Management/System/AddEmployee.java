package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameTF, ageTF, salaryTF, phoneTF, adhaarTF, emailTF;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox;
    JButton add,back;
    AddEmployee(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(109,109,109));
        add(panel);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameTF = new JTextField();
        nameTF.setBounds(200,30,150,27);
        nameTF.setBackground(new Color(109,109,109));
        nameTF.setFont(new Font("Tahoma", Font.BOLD,14));
        nameTF.setForeground(Color.WHITE);
        panel.add(nameTF);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("serif", Font.BOLD, 17));
        Age.setForeground(Color.WHITE);
        panel.add(Age);
        ageTF = new JTextField();
        ageTF.setBounds(200,80,150,27);
        ageTF.setBackground(new Color(109,109,109));
        ageTF.setFont(new Font("Tahoma", Font.BOLD,14));
        ageTF.setForeground(Color.WHITE);
        panel.add(ageTF);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(109,109,109));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(109,109,109));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif", Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk", "Housekeeping", "Kitchen Staff","Room Service", "Manager", "Accountant","Chef"});
        comboBox.setBackground(new Color(109,109,109));
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryTF = new JTextField();
        salaryTF.setBounds(200,220,150,27);
        salaryTF.setBackground(new Color(109,109,109));
        salaryTF.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryTF.setForeground(Color.WHITE);
        panel.add(salaryTF);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneTF = new JTextField();
        phoneTF.setBounds(200,270,150,27);
        phoneTF.setBackground(new Color(109,109,109));
        phoneTF.setFont(new Font("Tahoma", Font.BOLD,14));
        phoneTF.setForeground(Color.WHITE);
        panel.add(phoneTF);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("serif", Font.BOLD, 17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);
        adhaarTF = new JTextField();
        adhaarTF.setBounds(200,320,150,27);
        adhaarTF.setBackground(new Color(109,109,109));
        adhaarTF.setFont(new Font("Tahoma", Font.BOLD,14));
        adhaarTF.setForeground(Color.WHITE);
        panel.add(adhaarTF);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailTF = new JTextField();
        emailTF.setBounds(200,370,150,27);
        emailTF.setBackground(new Color(109,109,109));
        emailTF.setFont(new Font("Tahoma", Font.BOLD,14));
        emailTF.setForeground(Color.WHITE);
        panel.add(emailTF);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/employee2.jpg"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameTF.getText();
            String age = ageTF.getText();
            String salary = salaryTF.getText();
            String phone = phoneTF.getText();
            String email = emailTF.getText();
            String aadhar = adhaarTF.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = " Female";
            }

            try{
                conn c = new conn();
                String q = "insert into employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"', '"+email+"', '"+aadhar+"');";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }


        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
