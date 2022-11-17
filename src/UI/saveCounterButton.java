package UI;

import ActionListeners.saveButtonListener;

import javax.swing.*;

public class saveCounterButton extends button {
    static JButton saveButton = createButton("Save", new saveButtonListener());
    public static JButton saveButton(){return saveButton;}

}
