package UI;

import javax.swing.*;

public class button {
    static JButton Button;

    public static JButton getButton(){
        return Button;
    }

    public static JButton createButton(String title){
        Button = new JButton(title);
        return getButton();
    }
}
