package ButtonListeners;

import GraphicalUserInterface.Frame;
import GraphicalUserInterface.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class elementButtonListener implements ActionListener {
    private final String id;

    public elementButtonListener(String id) {
        this.id = id;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int size = Panel.panels.get(Panel.elementIndices.get(id)).size();
        Frame.addPanel(Panel.panels.get(Panel.elementIndices.get(id)).get(size - 1));
        Panel.panels.get(Panel.elementIndices.get(id)).add(Panel.getElementPanel(id));
    }
}
