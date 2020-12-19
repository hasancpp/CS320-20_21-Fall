package GraphicalUserInterface;
import java.awt.*;

import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
// Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Frame class in Graphical User Interface package.

public class Frame extends JFrame implements GraphicalUserInterface {

    private JFrame frame;

    public Frame() {
        frame = new JFrame("JWPL Software");
        frame.setLayout(new BorderLayout());
        frame.setSize(1200, 700);
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public void add(JComponent component) {
        // ???
    }
}
