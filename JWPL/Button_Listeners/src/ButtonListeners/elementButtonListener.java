package ButtonListeners;

import GraphicalUserInterface.Frame;
import GraphicalUserInterface.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class elementButtonListener implements ActionListener {
    private String id;

    public elementButtonListener(String id) {
        this.id = id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame.addPanel(Panel.panels.get(id));
    }
}
