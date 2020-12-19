package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        Frame myframe = new Frame();
        JPanel toppanel = new JPanel();
        myframe.getFrame().add(toppanel, BorderLayout.NORTH);
        JPanel centerpanel = new JPanel();
        myframe.getFrame().add(centerpanel, BorderLayout.CENTER);
        JPanel bottompanel = new JPanel();
        myframe.getFrame().add(bottompanel, BorderLayout.SOUTH);
        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new GridLayout(9,1));
        Button mybuttons = new Button();
        mybuttons.initializeButton();
        for(Map.Entry<String, JButton> set : mybuttons.getButtonHashMap().entrySet()) {
            buttonpanel.add(set.getValue());
        }
        myframe.getFrame().add(buttonpanel, BorderLayout.EAST);

        myframe.getFrame().pack();
        myframe.getFrame().setVisible(true);
    }

}
