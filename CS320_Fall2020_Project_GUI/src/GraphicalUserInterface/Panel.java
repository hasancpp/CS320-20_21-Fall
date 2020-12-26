package GraphicalUserInterface;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;

// Yamaç Demirkan Yılmaz -> v0.1
//Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Panel class in Graphical User Interface package.



public class Panel implements GraphicalUserInterface {
    private ArrayList<JPanel> panels = new ArrayList<JPanel>();

    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    public void initializePanels() {

        JButton imgUpButton = new JButton();
        JButton imgDownButton = new JButton();

        JButton inputUpButton = new JButton();
        JButton inputDownButton = new JButton();

        JButton labelUpButton = new JButton();
        JButton labelDownButton = new JButton();

        JButton buttonUpButton = new JButton();
        JButton buttonDownButton = new JButton();

        JButton pUpButton = new JButton();
        JButton pDownButton = new JButton();

        JButton aUpButton = new JButton();
        JButton aDownButton = new JButton();

        JButton h1UpButton = new JButton();
        JButton h1DownButton = new JButton();

        JButton ulUpButton = new JButton();
        JButton ulDownButton = new JButton();

        JButton olUpButton = new JButton();
        JButton olDownButton = new JButton();

        JButton clearButton = new JButton();
        clearButton.setIcon(new ImageIcon(new ImageIcon("src/resources/clear.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        imgUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        imgDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        inputUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        inputDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        labelUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        labelDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        buttonUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        buttonDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        pUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        pDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        aUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        aDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        h1UpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        h1DownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        ulUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        ulDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        olUpButton.setIcon(new ImageIcon(new ImageIcon("src/resources/upButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        olDownButton.setIcon(new ImageIcon(new ImageIcon("src/resources/downButton.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

        Border imgElementBorder = BorderFactory.createTitledBorder("imgElement");
        JPanel imgElementPanelBorder = new JPanel();
        LayoutManager imgElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(imgElementLayout);

        JPanel imgElementPanel = new JPanel();
        imgElementPanel.add(new JTextField("src"));
        imgElementPanel.add(new JTextField("width"));
        imgElementPanel.add(new JTextField("height"));
        imgElementPanel.add(imgUpButton);
        imgElementPanel.add(imgDownButton);
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
        inputElementPanel.add(new JCheckBox("readonly"));
        inputElementPanel.add(new JTextField("placeholder"));
        inputElementPanel.add(new JCheckBox("required"));
        inputElementPanel.add(inputUpButton);
        inputElementPanel.add(inputDownButton);
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
        labelElementPanel.add(labelUpButton);
        labelElementPanel.add(labelDownButton);
        labelElementPanel.setBorder(labelElementBorder);
        labelElementPanelBorder.add(labelElementPanel);
        panels.add(labelElementPanel);

        Border buttonElementBorder = BorderFactory.createTitledBorder("buttonElement");
        JPanel buttonElementPanelBorder = new JPanel();
        LayoutManager buttonElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(buttonElementLayout);

        JPanel buttonElementPanel = new JPanel();
        buttonElementPanel.add(new JCheckBox("autofocus"));
        buttonElementPanel.add(new JCheckBox("disabled"));
        buttonElementPanel.add(new JTextField("type"));
        buttonElementPanel.add(new JTextField("text"));
        buttonElementPanel.add(buttonUpButton);
        buttonElementPanel.add(buttonDownButton);
        buttonElementPanel.setBorder(buttonElementBorder);
        buttonElementPanelBorder.add(buttonElementPanel);
        panels.add(buttonElementPanel);

        Border pElementBorder = BorderFactory.createTitledBorder("pElement");
        JPanel pElementPanelBorder = new JPanel();
        LayoutManager pElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(pElementLayout);

        JPanel pElementPanel = new JPanel();
        pElementPanel.add(new JTextField("text"));
        pElementPanel.add(pUpButton);
        pElementPanel.add(pDownButton);
        pElementPanel.setBorder(pElementBorder);
        pElementPanelBorder.add(pElementPanel);
        panels.add(pElementPanel);

        Border aElementBorder = BorderFactory.createTitledBorder("aElement");
        JPanel aElementPanelBorder = new JPanel();
        LayoutManager aElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(aElementLayout);

        JPanel aElementPanel = new JPanel();        
        aElementPanel.add(new JTextField("href"));
        aElementPanel.add(aUpButton);
        aElementPanel.add(aDownButton);
        aElementPanel.setBorder(aElementBorder);
        aElementPanelBorder.add(aElementPanel);
        panels.add(aElementPanel);

        Border h1ElementBorder = BorderFactory.createTitledBorder("h1Element");
        JPanel h1ElementPanelBorder = new JPanel();
        LayoutManager h1ElementLayout = new FlowLayout();
        imgElementPanelBorder.setLayout(h1ElementLayout);

        JPanel h1ElementPanel = new JPanel();       
        h1ElementPanel.add(new JTextField("text"));
        h1ElementPanel.add(h1UpButton);
        h1ElementPanel.add(h1DownButton);
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
        ulElementPanel.add(ulUpButton);
        ulElementPanel.add(ulDownButton);
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
        olElementPanel.add(olUpButton);
        olElementPanel.add(olDownButton);
        olElementPanel.setBorder(olElementBorder);
        olElementPanelBorder.add(olElementPanel);
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
