package UI;

import ActionListeners.loadButtonListener;

import javax.swing.*;
import java.awt.event.ActionListener;

public class loadCounterButton extends button implements ActionListener {
    public static JButton loadButton = createButton("Load Count", new loadButtonListener());

    public static JButton loadButton() {
        return loadButton;
    }


}
