package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/fff.png"));
        //JLabel is use for image set
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,600);
        add(label);

        setLayout(null);  //default layout always is border layout
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try {
            Thread.sleep(3000);
            new Dashboard();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
