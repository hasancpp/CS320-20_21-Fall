package GraphicalUserInterface;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

// Yamaç Demirkan Yılmaz -> v0.1
//Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Panel class in Graphical User Interface package.



public class Panel implements GraphicalUserInterface {
    private ArrayList<JPanel> panels = new ArrayList<>();

    public void initializePanels() {
        Border imgElementBorder = BorderFactory.createTitledBorder("imgElement");
        JPanel imgElementPanelBorder = new JPanel();
        LayoutManager imgElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(imgElementLayout);

        JPanel imgElementPanel = new JPanel();
        imgElementPanel.add(new JTextField("src"));
        imgElementPanel.add(new JTextField("width"));
        imgElementPanel.add(new JTextField("height"));
        editPanel(imgElementPanel);
        imgElementPanel.setBorder(imgElementBorder);
        imgElementPanelBorder.add(imgElementPanel);
        panels.add(imgElementPanel);

        Border inputElementBorder = BorderFactory.createTitledBorder("inputElement");
        JPanel inputElementPanelBorder = new JPanel();
        LayoutManager inputElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(inputElementLayout);

        JPanel inputElementPanel = new JPanel();
        inputElementPanel.add(new JTextField("type"));
        inputElementPanel.add(new JTextField("value"));
        inputElementPanel.add(editCheckBox(new JCheckBox("readonly")));
        inputElementPanel.add(new JTextField("placeholder"));
        inputElementPanel.add(editCheckBox(new JCheckBox("required")));
        editPanel(inputElementPanel);
        inputElementPanel.setBorder(inputElementBorder);
        inputElementPanelBorder.add(inputElementPanel);
        panels.add(inputElementPanel);

        Border labelElementBorder = BorderFactory.createTitledBorder("labelElement");
        JPanel labelElementPanelBorder = new JPanel();
        LayoutManager labelElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(labelElementLayout);

        JPanel labelElementPanel = new JPanel();
        labelElementPanel.add(new JTextField("forinput"));
        labelElementPanel.add(new JTextField("text"));
        editPanel(labelElementPanel);
        labelElementPanel.setBorder(labelElementBorder);
        labelElementPanelBorder.add(labelElementPanel);
        panels.add(labelElementPanel);

        Border buttonElementBorder = BorderFactory.createTitledBorder("buttonElement");
        JPanel buttonElementPanelBorder = new JPanel();
        LayoutManager buttonElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(buttonElementLayout);

        JPanel buttonElementPanel = new JPanel();
        buttonElementPanel.add(editCheckBox(new JCheckBox("autofocus")));
        buttonElementPanel.add(editCheckBox(new JCheckBox("disabled")));
        buttonElementPanel.add(new JTextField("type"));
        buttonElementPanel.add(new JTextField("text"));
        editPanel(buttonElementPanel);
        buttonElementPanel.setBorder(buttonElementBorder);
        buttonElementPanelBorder.add(buttonElementPanel);
        panels.add(buttonElementPanel);

        Border pElementBorder = BorderFactory.createTitledBorder("pElement");
        JPanel pElementPanelBorder = new JPanel();
        LayoutManager pElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(pElementLayout);

        JPanel pElementPanel = new JPanel();
        pElementPanel.add(new JTextField("text"));
        editPanel(pElementPanel);
        pElementPanel.setBorder(pElementBorder);
        pElementPanelBorder.add(pElementPanel);
        panels.add(pElementPanel);

        Border aElementBorder = BorderFactory.createTitledBorder("aElement");
        JPanel aElementPanelBorder = new JPanel();
        LayoutManager aElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(aElementLayout);

        JPanel aElementPanel = new JPanel();        
        aElementPanel.add(new JTextField("href"));
        editPanel(aElementPanel);
        aElementPanel.setBorder(aElementBorder);
        aElementPanelBorder.add(aElementPanel);
        panels.add(aElementPanel);

        Border h1ElementBorder = BorderFactory.createTitledBorder("h1Element");
        JPanel h1ElementPanelBorder = new JPanel();
        LayoutManager h1ElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(h1ElementLayout);

        JPanel h1ElementPanel = new JPanel();       
        h1ElementPanel.add(new JTextField("text"));
        editPanel(h1ElementPanel);
        h1ElementPanel.setBorder(h1ElementBorder);
        h1ElementPanelBorder.add(h1ElementPanel);
        panels.add(h1ElementPanel);

        Border ulElementBorder = BorderFactory.createTitledBorder("ulElement");
        JPanel ulElementPanelBorder = new JPanel();
        LayoutManager ulElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(ulElementLayout);
        
        JPanel ulElementPanel = new JPanel();
        for(int i = 0; i < 10; i++) {
            ulElementPanel.add(new JTextField("item"));
        }
        editPanel(ulElementPanel);
        ulElementPanel.setBorder(ulElementBorder);
        ulElementPanelBorder.add(ulElementPanel);
        panels.add(ulElementPanel);

        Border olElementBorder = BorderFactory.createTitledBorder("olElement");
        JPanel olElementPanelBorder = new JPanel();
        LayoutManager olElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(olElementLayout);

        JPanel olElementPanel = new JPanel();
        for(int i = 0; i < 10; i++) {
            olElementPanel.add(new JTextField("item"));
        }
        editPanel(olElementPanel);
        olElementPanel.setBorder(olElementBorder);
        olElementPanelBorder.add(olElementPanel);
        panels.add(olElementPanel);
    }

    public ArrayList<JPanel> getPanels() {
        return panels;
    }

    public void editPanel(JPanel panel) {
        JButton upButton = new JButton();
        editButton(upButton);
        JButton downButton = new JButton();
        editButton(downButton);
        JButton removeButton = new JButton();
        editButton(removeButton);
        upButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        downButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        removeButton.setIcon(new ImageIcon(new ImageIcon("src/resources/remove.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        panel.add(upButton);
        panel.add(downButton);
        panel.add(removeButton);
        panel.setBackground(Color.decode("#CFD3CE"));
    }

    public void editButton(JButton button) {
        button.setFocusable(false);
        button.setBackground(Color.decode("#839B97"));
        button.setRolloverEnabled(true);
        button.setBorderPainted(false);
    }

    public JCheckBox editCheckBox(JCheckBox checkBox) {
        checkBox.setFocusable(false);
        return checkBox;
    }

    @Override
    public void add(JComponent component) {
        panels.add((JPanel) component);
    }
}
