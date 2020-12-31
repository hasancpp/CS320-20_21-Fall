package GraphicalUserInterface;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

// Yamaç Demirkan Yılmaz -> v0.1
// Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Frame class in Graphical User Interface package.

public class Frame extends JFrame implements GraphicalUserInterface {

    public static JFrame frame;
    private static JPanel centerPanel = new JPanel();

    public Frame() {
        frame = new JFrame("JWPL Software");
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        setPanelColor(topPanel);
        JTextField path = new JTextField("Path");
        path.setColumns(40);
        topPanel.add(path);
        frame.add(topPanel, BorderLayout.NORTH);

        centerPanel.setLayout(new GridLayout(9,1));
        setPanelColor(centerPanel);
        Panel panels = new Panel();
        panels.initializePanels();
        /*
        for(Map.Entry<String, JPanel> set : panels.getPanels().entrySet()) {
            centerPanel.add(set.getValue());
        }
        */
        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        setPanelColor(bottomPanel);
        bottomPanel.setLayout(new BorderLayout());
        JButton createButton = new JButton("Create");
        bottomPanel.add(createButton, BorderLayout.EAST);
        createButton.setMargin(new Insets(30, 55, 30, 55));
        editButton(createButton);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel();
        setPanelColor(rightPanel);
        rightPanel.setLayout(new GridLayout(10,1));
        Button buttons = new Button();
        buttons.initializeButton();
        for(Map.Entry<String, JButton> set : buttons.getButtonHashMap().entrySet()) {
            rightPanel.add(set.getValue());
            editButton(set.getValue());
        }
        frame.add(rightPanel, BorderLayout.EAST);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2 - frame.getSize().width/2, dim.height/2 - frame.getSize().height/2);

        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public void add(JComponent component) {
    }

    public static void addPanel(JPanel panel) {
        centerPanel.add(panel);
        centerPanel.revalidate();
    }

    public void editButton(JButton button) {
        button.setBackground(Color.decode("#839B97"));
        button.setForeground(Color.decode("#CFD3CE"));
        button.setFocusPainted(false);
        button.setFocusable(false);
        button.setRolloverEnabled(true);
        button.setBorderPainted(false);
        button.setFont(new Font("Roboto", Font.BOLD, 12));
    }

    public void setPanelColor(JPanel panel) {
        panel.setBackground(Color.decode("#C6B497"));
    }
}
