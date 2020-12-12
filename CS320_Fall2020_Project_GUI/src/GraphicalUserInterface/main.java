package GraphicalUserInterface;

import javax.swing.*;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        Frame myframe = new Frame();
        Panel mypanel = new Panel();
        mypanel.initializePanels();
        Button mybutton = new Button();
        mybutton.initializeButton();

        for(Map.Entry<String, JButton> set : mybutton.getButtonHashMap().entrySet()) {
            myframe.getFrame().add(set.getValue());
        }

        for(int i=0; i < mypanel.getPanels().size(); i++) {
            myframe.getFrame().add(mypanel.getPanels().get(i));
        }

        myframe.getFrame().pack();
        myframe.getFrame().setVisible(true);
    }

}
