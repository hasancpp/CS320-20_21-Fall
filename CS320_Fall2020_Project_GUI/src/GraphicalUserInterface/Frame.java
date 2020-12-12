package GraphicalUserInterface;
import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
// Contains the implementation of Frame class in Graphical User Interface package.

public class Frame implements GraphicalUserInterface {

    private JFrame frame;

    public Frame() {
        frame = new JFrame("JWPL Software");
        frame.setSize(700, 700);
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public void add(JComponent component) {
        frame.add(component);
    }
}
