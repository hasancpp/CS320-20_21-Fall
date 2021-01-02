package GraphicalUserInterface;

import ButtonListeners.downButtonListener;
import ButtonListeners.removeButtonListener;
import ButtonListeners.upButtonListener;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.Border;

// Yamaç Demirkan Yılmaz -> v0.1
//Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Panel class in Graphical User Interface package.

public class Panel implements GraphicalUserInterface {
    public static HashMap<String, Integer> elementIndices = new HashMap<>() {{
        put("imgElement", 0);
        put("inputElement", 1);
        put("labelElement", 2);
        put("buttonElement", 3);
        put("pElement", 4);
        put("aElement", 5);
        put("h1Element", 6);
        put("ulElement", 7);
        put("olElement", 8);
    }};

    public static ArrayList<ArrayList<JPanel>> panels = new ArrayList<>();

    static {
        for(int i = 0; i < elementIndices.size(); i++) {
            panels.add(new ArrayList());
        }
    }

    public void initializePanels() {
        panels.get(0).add(getElementPanel("imgElement"));
        panels.get(1).add(getElementPanel("inputElement"));
        panels.get(2).add(getElementPanel("labelElement"));
        panels.get(3).add(getElementPanel("buttonElement"));
        panels.get(4).add(getElementPanel("pElement"));
        panels.get(5).add(getElementPanel("aElement"));
        panels.get(6).add(getElementPanel("h1Element"));
        panels.get(7).add(getElementPanel("ulElement"));
        panels.get(8).add(getElementPanel("olElement"));
    }

    public static void editPanel(JPanel panel, String id) {
        JButton upButton = new JButton();
        editButton(upButton);
        JButton downButton = new JButton();
        editButton(downButton);
        JButton removeButton = new JButton();
        editButton(removeButton);
        upButton.setIcon(new ImageIcon(new ImageIcon("Graphical_User_Interface/src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        downButton.setIcon(new ImageIcon(new ImageIcon("Graphical_User_Interface/src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        removeButton.setIcon(new ImageIcon(new ImageIcon("Graphical_User_Interface/src/resources/remove.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        removeButton.addActionListener(new removeButtonListener(id, panels.get(Panel.elementIndices.get(id)).size()));
        upButton.addActionListener(new upButtonListener(id, panels.get(Panel.elementIndices.get(id)).size()));
        downButton.addActionListener(new downButtonListener(id, panels.get(Panel.elementIndices.get(id)).size()));
        panel.add(upButton);
        panel.add(downButton);
        panel.add(removeButton);
        panel.setBackground(Color.decode("#CFD3CE"));
    }

    public static void editButton(JButton button) {
        button.setFocusable(false);
        button.setBackground(Color.decode("#839B97"));
        button.setRolloverEnabled(true);
        button.setBorderPainted(false);
    }

    public static JCheckBox editCheckBox(JCheckBox checkBox) {
        checkBox.setFocusable(false);
        return checkBox;
    }

    @Override
    public void add(JComponent component) {

    }

    public static JPanel getElementPanel(String id) {
        switch (id) {
            case "imgElement":
                Border imgElementBorder = BorderFactory.createTitledBorder("imgElement");
                JPanel imgElementPanelBorder = new JPanel();
                LayoutManager imgElementLayout = new FlowLayout();
                imgElementPanelBorder.setLayout(imgElementLayout);

                JPanel imgElementPanel = new JPanel();
                imgElementPanel.add(new JTextField("src"));
                imgElementPanel.add(new JTextField("width"));
                imgElementPanel.add(new JTextField("height"));
                editPanel(imgElementPanel, "imgElement");
                imgElementPanel.setBorder(imgElementBorder);
                imgElementPanelBorder.add(imgElementPanel);
                imgElementPanel.setName("imgElement");
                return imgElementPanel;
            case "inputElement":
                Border inputElementBorder = BorderFactory.createTitledBorder("inputElement");
                JPanel inputElementPanelBorder = new JPanel();
                LayoutManager inputElementLayout = new FlowLayout();
                inputElementPanelBorder.setLayout(inputElementLayout);

                JPanel inputElementPanel = new JPanel();
                inputElementPanel.add(new JTextField("type"));
                inputElementPanel.add(new JTextField("value"));
                inputElementPanel.add(editCheckBox(new JCheckBox("readonly")));
                inputElementPanel.add(new JTextField("placeholder"));
                inputElementPanel.add(editCheckBox(new JCheckBox("required")));
                editPanel(inputElementPanel, "inputElement");
                inputElementPanel.setBorder(inputElementBorder);
                inputElementPanelBorder.add(inputElementPanel);
                inputElementPanel.setName("inputElement");
                return inputElementPanel;
            case "labelElement":
                Border labelElementBorder = BorderFactory.createTitledBorder("labelElement");
                JPanel labelElementPanelBorder = new JPanel();
                LayoutManager labelElementLayout = new FlowLayout();
                labelElementPanelBorder.setLayout(labelElementLayout);

                JPanel labelElementPanel = new JPanel();
                labelElementPanel.add(new JTextField("forinput"));
                labelElementPanel.add(new JTextField("text"));
                editPanel(labelElementPanel, "labelElement");
                labelElementPanel.setBorder(labelElementBorder);
                labelElementPanelBorder.add(labelElementPanel);
                labelElementPanel.setName("labelElement");
                return labelElementPanel;
            case "buttonElement":
                Border buttonElementBorder = BorderFactory.createTitledBorder("buttonElement");
                JPanel buttonElementPanelBorder = new JPanel();
                LayoutManager buttonElementLayout = new FlowLayout();
                buttonElementPanelBorder.setLayout(buttonElementLayout);

                JPanel buttonElementPanel = new JPanel();
                buttonElementPanel.add(editCheckBox(new JCheckBox("autofocus")));
                buttonElementPanel.add(editCheckBox(new JCheckBox("disabled")));
                buttonElementPanel.add(new JTextField("type"));
                buttonElementPanel.add(new JTextField("text"));
                editPanel(buttonElementPanel, "buttonElement");
                buttonElementPanel.setBorder(buttonElementBorder);
                buttonElementPanelBorder.add(buttonElementPanel);
                buttonElementPanel.setName("buttonElement");
                return buttonElementPanel;
            case "pElement":
                Border pElementBorder = BorderFactory.createTitledBorder("pElement");
                JPanel pElementPanelBorder = new JPanel();
                LayoutManager pElementLayout = new FlowLayout();
                pElementPanelBorder.setLayout(pElementLayout);

                JPanel pElementPanel = new JPanel();
                pElementPanel.add(new JTextField("text"));
                editPanel(pElementPanel, "pElement");
                pElementPanel.setBorder(pElementBorder);
                pElementPanelBorder.add(pElementPanel);
                pElementPanel.setName("pElement");
                return pElementPanel;
            case "aElement":
                Border aElementBorder = BorderFactory.createTitledBorder("aElement");
                JPanel aElementPanelBorder = new JPanel();
                LayoutManager aElementLayout = new FlowLayout();
                aElementPanelBorder.setLayout(aElementLayout);

                JPanel aElementPanel = new JPanel();
                aElementPanel.add(new JTextField("href"));
                editPanel(aElementPanel, "aElement");
                aElementPanel.setBorder(aElementBorder);
                aElementPanelBorder.add(aElementPanel);
                aElementPanel.setName("aElement");
                return aElementPanel;
            case "h1Element":
                Border h1ElementBorder = BorderFactory.createTitledBorder("h1Element");
                JPanel h1ElementPanelBorder = new JPanel();
                LayoutManager h1ElementLayout = new FlowLayout();
                h1ElementPanelBorder.setLayout(h1ElementLayout);

                JPanel h1ElementPanel = new JPanel();
                h1ElementPanel.add(new JTextField("text"));
                editPanel(h1ElementPanel, "h1Element");
                h1ElementPanel.setBorder(h1ElementBorder);
                h1ElementPanelBorder.add(h1ElementPanel);
                h1ElementPanel.setName("h1Element");
                return h1ElementPanel;
            case "ulElement":
                Border ulElementBorder = BorderFactory.createTitledBorder("ulElement");
                JPanel ulElementPanelBorder = new JPanel();
                LayoutManager ulElementLayout = new FlowLayout();
                ulElementPanelBorder.setLayout(ulElementLayout);

                JPanel ulElementPanel = new JPanel();
                for(int i = 0; i < 10; i++) {
                    ulElementPanel.add(new JTextField("item"));
                }
                editPanel(ulElementPanel, "ulElement");
                ulElementPanel.setBorder(ulElementBorder);
                ulElementPanelBorder.add(ulElementPanel);
                ulElementPanel.setName("ulElement");
                return ulElementPanel;
            case "olElement":
                Border olElementBorder = BorderFactory.createTitledBorder("olElement");
                JPanel olElementPanelBorder = new JPanel();
                LayoutManager olElementLayout = new FlowLayout();
                olElementPanelBorder.setLayout(olElementLayout);

                JPanel olElementPanel = new JPanel();
                for(int i = 0; i < 10; i++) {
                    olElementPanel.add(new JTextField("item"));
                }
                editPanel(olElementPanel, "olElement");
                olElementPanel.setBorder(olElementBorder);
                olElementPanelBorder.add(olElementPanel);
                olElementPanel.setName("olElement");
                return olElementPanel;
            default:
                return null;
        }
    }
}
