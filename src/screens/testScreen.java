package screens;

import javax.swing.*;
import java.awt.*;

public class testScreen {

    public static void main(String[] args){
        new testScreen();
    }

    public testScreen(){
        JFrame finalFrame = new JFrame("final");
        CardLayout card = new CardLayout();
        JPanel cPanel = new JPanel();
        JPanel panel1 = new JPanel();
        testPanel panel2 = new testPanel(card, cPanel);
        cPanel.setLayout(card);

        JButton panel1txt = new JButton("go to 2");
        JLabel panel2txt = new JLabel("screen 2");
        panel1txt.addActionListener(e -> card.show(cPanel, "2"));
        panel1.add(panel1txt);
        panel2.add(panel2txt);

        cPanel.add(panel1, "1");
        cPanel.add(panel2,"2");
        finalFrame.add(cPanel);
        finalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        finalFrame.pack();
        finalFrame.setVisible(true);
    }


}
