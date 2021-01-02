package GraphicalUserInterface;

import ButtonListeners.createButtonListener;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Frame extends JFrame {

    public static JFrame frame;
    public static JPanel centerPanel = new JPanel();
    public static JTextField path;

    public Frame() {
        frame = new JFrame("JWPL Software");
        frame.setSize(1000, 700);
        frame.setLayout(new BorderLayout());
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        setPanelColor(topPanel);
        path = new JTextField("Path");
        path.setColumns(40);
        topPanel.add(path);
        frame.add(topPanel, BorderLayout.NORTH);

        centerPanel.setLayout(new GridLayout(9,1));
        setPanelColor(centerPanel);
        Panel panels = new Panel();
        panels.initializePanels();
        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        setPanelColor(bottomPanel);
        bottomPanel.setLayout(new BorderLayout());
        JButton createButton = new JButton("Create");
        createButton.addActionListener(new createButtonListener());
        bottomPanel.add(createButton, BorderLayout.EAST);
        createButton.setMargin(new Insets(30, 55, 30, 55));
        editButton(createButton);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        JPanel rightPanel = new JPanel();
        setPanelColor(rightPanel);
        rightPanel.setLayout(new GridLayout(10,1));
        Button.initializeButton();
        for(Map.Entry<String, JButton> set : Button.getButtonHashMap().entrySet()) {
            rightPanel.add(set.getValue());
            editButton(set.getValue());
        }
        frame.add(rightPanel, BorderLayout.EAST);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2 - frame.getSize().width/2, dim.height/2 - frame.getSize().height/2);

        frame.setVisible(true);
    }

    public static void addPanel(JPanel panel) {
        centerPanel.add(panel);
        centerPanel.revalidate();
        centerPanel.repaint();
        
    }

    public static void removePanel(JPanel panel) {
        centerPanel.remove(panel);
        centerPanel.revalidate();
        centerPanel.repaint();
    }

    public static void editButton(JButton button) {
        button.setBackground(Color.decode("#839B97"));
        button.setForeground(Color.decode("#CFD3CE"));
        button.setFocusPainted(false);
        button.setFocusable(false);
        button.setRolloverEnabled(true);
        button.setBorderPainted(false);
        button.setFont(new Font("Roboto", Font.BOLD, 12));
    }
    public static void swapUp(JPanel panel) {
    	 int index = centerPanel.getComponentZOrder(panel);
    	 if(index>0) {
    		 Component upper = centerPanel.getComponent(index-1);
    		 centerPanel.setComponentZOrder(upper, index);
    		 centerPanel.setComponentZOrder(panel, index-1);
    		 centerPanel.revalidate();
    	     centerPanel.repaint();
    	 } 
    }
    //
    public static void swapDown(JPanel panel) {
   	 int index = centerPanel.getComponentZOrder(panel);
   	 if(index < centerPanel.getComponentCount()-1) {
   		 Component lower = centerPanel.getComponent(index+1);
   		 centerPanel.setComponentZOrder(lower, index);
   		 centerPanel.setComponentZOrder(panel, index+1);
   		 centerPanel.revalidate();
   	     centerPanel.repaint();
   	 } 
   }

    public static void setPanelColor(JPanel panel) {
        panel.setBackground(Color.decode("#C6B497"));
    }
}
