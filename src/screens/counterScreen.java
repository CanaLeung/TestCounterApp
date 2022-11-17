package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Entities.counter;

import UI.addCounterButton;
import UI.loadCounterButton;
import UI.resetCounterButton;
import UI.saveCounterButton;

public class counterScreen implements ActionListener {
    private final JButton quitButton;

    public counterScreen(){
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel countNum = new JLabel("Counter: " + counter.getCount());

        JButton loadButton = loadCounterButton.loadButton();
        JButton addButton = addCounterButton.CountButton();
        JButton resetButton = resetCounterButton.ResetButton();
        JButton saveButton = saveCounterButton.saveButton();
        quitButton = new JButton("Quit");
        quitButton.addActionListener(this);


        panel1.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        panel1.add(addButton);
        panel1.add(resetButton);

        panel2.add(loadButton);
        panel2.add(saveButton);
        panel2.add(quitButton);
        panel3.add(countNum);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Counter");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args){
        new counterScreen();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == quitButton){
            System.exit(0);
        }


    }

}