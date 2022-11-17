package ActionListeners;

import Controllers.resetCounterController;
import Entities.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class resetButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        resetCounterController.resetCount();
        System.out.println(counter.getCount());
    }
}
