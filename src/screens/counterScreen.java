package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controllers.addCounterController;
import Controllers.loadCounterController;
import Controllers.resetCounterController;
import Controllers.saveCounterController;

import Entities.counter;

import UI.addCounterButton;
import UI.loadCounterButton;
import UI.resetCounterButton;
import UI.saveCounterButton;

public class counterScreen implements ActionListener {
    private final JButton addButton;
    private final JButton resetButton;
    private final JButton saveButton;
    private final JButton quitButton;
    private final JButton loadButton;
    private final JLabel countNum;

    public counterScreen(){
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        countNum = new JLabel("Counter: " + counter.getCount());

        loadButton = loadCounterButton.loadButton();
        loadButton.addActionListener(this);
        addButton = addCounterButton.CountButton();
        addButton.addActionListener(this);
        resetButton = resetCounterButton.ResetButton();
        resetButton.addActionListener(this);
        saveButton = saveCounterButton.saveButton();
        saveButton.addActionListener(this);
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
        if(e.getSource() == addButton){
            addCounterController.addCount();
            countNum.setText("Counter: " + counter.getCount());
        }
        if(e.getSource() == resetButton){
            resetCounterController.resetCount();
            countNum.setText("Counter: " + counter.getCount());
        }

        if(e.getSource() == saveButton){
            saveCounterController.saveCount();
            System.out.println("File saved. Count: " + counter.getCount());
        }

        if(e.getSource() == quitButton){
            System.exit(0);
        }

        if(e.getSource() == loadButton){
            loadCounterController.loadCount();
            countNum.setText("Counter: " + counter.getCount());
        }

    }

}