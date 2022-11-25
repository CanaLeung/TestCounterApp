package screens;

import javax.swing.*;
import java.awt.*;

public class cardScreen {

    public cardScreen(){
        JFrame frame = new JFrame("demo");
        JPanel mainPanel = new JPanel(); // container
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton button1 = new JButton("Switch to 2nd");
        JButton button2 = new JButton("Switch to 1st");

        CardLayout card = new CardLayout(3 ,5);

        mainPanel.setLayout(card);
        panel1.add(button1);
        button1.addActionListener(e -> card.show(mainPanel,"2"));
        panel2.add(button2);
        button2.addActionListener(e -> card.show(mainPanel, "1"));
        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.GRAY);

        mainPanel.add(panel1, "1");
        mainPanel.add(panel2, "2");
        card.show(mainPanel, "1");

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("demo");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args){
        new cardScreen();
    }

}
