package ButtonListeners;

import GraphicalUserInterface.Frame;
import HTMLElements.*;

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
                case "imgElement" -> {
                    element = new imgElement();
                    String src = ((JTextField) panel.getComponent(0)).getText();
                    if (src.equals("src")) ((imgElement) element).defaultSrc();
                    else ((imgElement) element).setSrc(src);
                    String width = ((JTextField) panel.getComponent(1)).getText();
                    if (width.equals("width")) ((imgElement) element).defaultWidth();
                    else ((imgElement) element).setWidth(width);
                    String height = ((JTextField) panel.getComponent(2)).getText();
                    if (height.equals("height")) ((imgElement) element).defaultHeight();
                    else ((imgElement) element).setHeight(height);
                }
                case "inputElement" -> {
                    element = new inputElement();
                    String type = ((JTextField) panel.getComponent(0)).getText();
                    if (type.equals("type")) ((inputElement) element).defaultType();
                    else ((inputElement) element).setType(type);
                    boolean readonly = ((JCheckBox) panel.getComponent(1)).isSelected();
                    ((inputElement) element).setReadonly(readonly);
                    String placeholder = ((JTextField) panel.getComponent(2)).getText();
                    if (placeholder.equals("placeholder")) ((inputElement) element).defaultPlaceholder();
                    else ((inputElement) element).setPlaceholder(placeholder);
                    boolean required = ((JCheckBox) panel.getComponent(3)).isSelected();
                    ((inputElement) element).setRequired(required);
                }
                case "labelElement" -> {
                    element = new labelElement();
                    String forinput = ((JTextField) panel.getComponent(0)).getText();
                    if (forinput.equals("forinput")) ((labelElement) element).defaultFor();
                    else ((labelElement) element).setFor(forinput);
                    String text = ((JTextField) panel.getComponent(1)).getText();
                    if (text.equals("text")) ((labelElement) element).setText("");
                    else ((labelElement) element).setText(text);
                }
                case "buttonElement" -> {
                    element = new buttonElement();
                    boolean autofocus = ((JCheckBox) panel.getComponent(0)).isSelected();
                    ((buttonElement) element).setAutofocus(autofocus);
                    boolean disabled = ((JCheckBox) panel.getComponent(1)).isSelected();
                    ((buttonElement) element).setDisabled(disabled);
                    String type = ((JTextField) panel.getComponent(2)).getText();
                    if (type.equals("type")) ((buttonElement) element).defaultType();
                    else ((buttonElement) element).setType(type);
                    String text = ((JTextField) panel.getComponent(3)).getText();
                    if (text.equals("text")) ((buttonElement) element).setText("");
                    else ((buttonElement) element).setText(text);
                }
                case "pElement" -> {
                    element = new pElement();
                    String text = ((JTextField) panel.getComponent(0)).getText();
                    if (text.equals("text")) ((pElement) element).setText("");
                    else ((pElement) element).setText(text);
                }
                case "aElement" -> {
                    element = new aElement();
                    String href = ((JTextField) panel.getComponent(0)).getText();
                    if (href.equals("href")) ((aElement) element).setHref("");
                    else ((aElement) element).setHref(href);
                    String text = ((JTextField) panel.getComponent(1)).getText();
                    if (text.equals("text")) ((aElement) element).setText("");
                    else ((aElement) element).setText(text);
                }
                case "h1Element" -> {
                    element = new h1Element();
                    String txt = ((JTextField) panel.getComponent(0)).getText();
                    if (txt.equals("text")) ((h1Element) element).setText("");
                    else ((h1Element) element).setText(txt);
                }
                case "ulElement" -> {
                    element = new ulElement();
                    for (Component awtItem : panel.getComponents()) {
                        JTextField item = (JTextField) awtItem;
                        String text = item.getText();
                        if (text.equals("text")) ((ulElement) element).addItem("");
                        else ((ulElement) element).addItem(text);
                    }
                }
                case "olElement" -> {
                    element = new olElement();
                    for (Component awtItem : panel.getComponents()) {
                        JTextField item = (JTextField) awtItem;
                        String text = item.getText();
                        if (text.equals("text")) ((olElement) element).addItem("");
                        else ((olElement) element).addItem(text);
                    }
                }
                default -> element = null;
            }
            HTMLElements.htmlFileEditor.addElement(element);
        }
        String path = Frame.path.getText();
        if (path.equals("Path")) HTMLElements.htmlFileEditor.create(); else HTMLElements.htmlFileEditor.create(path);
    }
}
