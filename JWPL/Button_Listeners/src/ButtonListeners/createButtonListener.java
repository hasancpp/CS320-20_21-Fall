package ButtonListeners;

import GraphicalUserInterface.Frame;
import HTMLElements.*;
import org.w3c.dom.html.HTMLElement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        for (Component awtPanel : Frame.centerPanel.getComponents()) {
            JPanel panel = (JPanel) awtPanel;
            Element element;
            switch (panel.getName()) {
                case "imgElement":
                    element = new imgElement();
                    String src = ((JTextField) panel.getComponent(0)).getText();
                    if (src.equals("src")) ((imgElement) element).defaultSrc(); else ((imgElement) element).setSrc(src);
                    String width = ((JTextField) panel.getComponent(1)).getText();
                    if (width.equals("width")) ((imgElement) element).defaultWidth(); else ((imgElement) element).setWidth(width);
                    String height = ((JTextField) panel.getComponent(2)).getText();
                    if (height.equals("height")) ((imgElement) element).defaultHeight(); else ((imgElement) element).setHeight(height);
                    break;
                case "inputElement":
                    element = new inputElement();
                    break;
                case "labelElement":
                    element = new labelElement();
                    break;
                case "buttonElement":
                    element = new buttonElement();
                    break;
                case "pElement":
                    element = new pElement();
                    break;
                case "aElement":
                    element = new aElement();
                    break;
                case "h1Element":
                    element = new h1Element();
                    break;
                case "ulElement":
                    element = new ulElement();
                    break;
                case "olElement":
                    element = new olElement();
                    break;
                default:
                    element = null;
                    break;
            }
            HTMLElements.htmlFileEditor.addElement(element);
            String path = Frame.path.getText();
            if (path.equals("Path")) HTMLElements.htmlFileEditor.create(); else HTMLElements.htmlFileEditor.create(path);
        }
    }
}
