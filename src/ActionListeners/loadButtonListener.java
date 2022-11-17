package ActionListeners;

import Controllers.loadCounterController;
import Entities.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loadButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        loadCounterController.loadCount();
        System.out.println(counter.getCount());
    }
}
