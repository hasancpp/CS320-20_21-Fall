package GraphicalUserInterface;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
//Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Panel class in Graphical User Interface package.

public class Panel implements GraphicalUserInterface {
    private ArrayList<JPanel> panels = new ArrayList<JPanel>();

    public void initializePanels() {
        JPanel imgElementPanel = new JPanel();
        imgElementPanel.add(new JLabel("imgElement"));
        imgElementPanel.add(new JTextField("src"));
        imgElementPanel.add(new JTextField("width"));
        imgElementPanel.add(new JTextField("height"));
        imgElementPanel.add(new JButton(new ImageIcon("src/resources/upButton.png")));
        panels.add(imgElementPanel);

        JPanel inputElementPanel = new JPanel();
        inputElementPanel.add(new JTextField("type"));
        inputElementPanel.add(new JTextField("value"));
        inputElementPanel.add(new JCheckBox("readonly"));
        inputElementPanel.add(new JTextField("placeholder"));
        inputElementPanel.add(new JCheckBox("required"));
        panels.add(inputElementPanel);

        JPanel labelElementPanel = new JPanel();
        labelElementPanel.add(new JTextField("forinput"));
        labelElementPanel.add(new JTextField("text"));
        panels.add(labelElementPanel);

        JPanel buttonElementPanel = new JPanel();
        buttonElementPanel.add(new JCheckBox("autofocus"));
        buttonElementPanel.add(new JCheckBox("disabled"));
        buttonElementPanel.add(new JTextField("type"));
        buttonElementPanel.add(new JTextField("text"));
        panels.add(buttonElementPanel);

        JPanel pElementPanel = new JPanel();
        pElementPanel.add(new JTextField("text"));
        panels.add(pElementPanel);

        JPanel aElementPanel = new JPanel();        
        aElementPanel.add(new JTextField("href"));
        panels.add(aElementPanel);
        
        JPanel h1ElementPanel = new JPanel();       
        h1ElementPanel.add(new JTextField("text"));
        panels.add(h1ElementPanel);
        
        JPanel ulElementPanel = new JPanel();
        for(int i = 0; i < 10; i++) {
            ulElementPanel.add(new JTextField("item"));
        }
        panels.add(ulElementPanel);

        JPanel olElementPanel = new JPanel();
        for(int i = 0; i < 10; i++) {
            olElementPanel.add(new JTextField("item"));
        }
        panels.add(olElementPanel);
        
        
    }

    public ArrayList<JPanel> getPanels() {
        return panels;
    }

    @Override
    public void add(JComponent component) {
        panels.add((JPanel) component);
    }
}
