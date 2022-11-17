package ActionListeners;

import Controllers.addCounterController;
import Entities.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        addCounterController.addCount();
        System.out.println(counter.getCount());
    }
}
