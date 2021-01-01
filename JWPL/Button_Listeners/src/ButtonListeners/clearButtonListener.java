package ButtonListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import GraphicalUserInterface.Frame;
import GraphicalUserInterface.Panel;

import javax.swing.*;

public class clearButtonListener implements ActionListener {

    private String ID;

    public clearButtonListener(String ID) {
        this.ID = ID;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame.removePanel(Panel.panels.get(ID));
    }
}
