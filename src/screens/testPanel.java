package screens;

import javax.swing.*;
import java.awt.*;

public class testPanel extends JPanel {

    CardLayout card;
    JPanel panel;


    public testPanel(CardLayout card, JPanel cpanel){
        this.card = card;
        this.panel = cpanel;
        JButton b2 = new JButton("Go to one");

        b2.addActionListener(e -> showPanel(card, cpanel));
        add(b2);
    }

    public void showPanel(CardLayout card, JPanel cpanel){
        this.card = card;
        this.panel = cpanel;
        card.show(cpanel, "1");
    }


}
