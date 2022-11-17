package UI;

import ActionListeners.resetButtonListener;

import javax.swing.*;

public class resetCounterButton extends button {
    static JButton resetButton = createButton("Reset Count", new resetButtonListener());

    public static JButton ResetButton(){
        return resetButton;
    }
}
