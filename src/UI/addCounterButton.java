package UI;


import ActionListeners.addButtonListener;

import javax.swing.*;

public class addCounterButton extends button{
    public static JButton CountButton = createButton("Add Count", new addButtonListener());

    public static JButton CountButton() {
        return CountButton;
    }
}
