package GraphicalUserInterface;
import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
// Contains the implementation of Frame class in Graphical User Interface package.

public class Frame {

    public Frame() {
        JFrame frame = new JFrame("JWPL Software");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
    }
}
