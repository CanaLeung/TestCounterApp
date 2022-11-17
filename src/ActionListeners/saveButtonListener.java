package ActionListeners;

import Controllers.saveCounterController;
import Entities.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class saveButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        saveCounterController.saveCount();
        System.out.println(counter.getCount());
    }
}
