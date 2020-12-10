package GraphicalUserInterface;
import java.util.ArrayList;
import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
// Contains the implementation of Panel class in Graphical User Interface package.

public class Panel {
    private ArrayList<JPanel> panels = new ArrayList<JPanel>();

    public void initializePanels() {
        JPanel imgElementPanel = new JPanel();
        imgElementPanel.add(new JTextField());
        imgElementPanel.add(new JTextField());
        imgElementPanel.add(new JTextField());
        panels.add(imgElementPanel);

        JPanel inputElementPanel = new JPanel();
        inputElementPanel.add(new JTextField());
        inputElementPanel.add(new JTextField());
        inputElementPanel.add(new JTextField());
        inputElementPanel.add(new JTextField());
        inputElementPanel.add(new JTextField());
        panels.add(inputElementPanel);

        JPanel labelElementPanel = new JPanel();
        labelElementPanel.add(new JTextField());
        labelElementPanel.add(new JTextField());
        panels.add(labelElementPanel);

        JPanel buttonElementPanel = new JPanel();
        buttonElementPanel.add(new JTextField());
        buttonElementPanel.add(new JTextField());
        buttonElementPanel.add(new JTextField());
        buttonElementPanel.add(new JTextField());
        panels.add(buttonElementPanel);

        JPanel pElementPanel = new JPanel();
        pElementPanel.add(new JTextField());
        panels.add(pElementPanel);

        JPanel aElementPanel = new JPanel();
        aElementPanel.add(new JTextField());
        panels.add(aElementPanel);

        JPanel h1ElementPanel = new JPanel();
        h1ElementPanel.add(new JTextField());
        panels.add(h1ElementPanel);

        JPanel ulElementPanel = new JPanel();
        ulElementPanel.add(new JTextField());
        panels.add(ulElementPanel);

        JPanel olElementPanel = new JPanel();
        olElementPanel.add(new JTextField());
        panels.add(olElementPanel);
    }

    public ArrayList<JPanel> getPanels() {
        return panels;
    }
}
