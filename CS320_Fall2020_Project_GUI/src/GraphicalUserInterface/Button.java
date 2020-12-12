package GraphicalUserInterface;
import java.util.HashMap;
import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
// Contains the implementation of Button class in Graphical User Interface package.

public class Button implements GraphicalUserInterface {

    private HashMap<String, JButton> buttonHashMap = new HashMap<String, JButton>();

    public void initializeButton() {
        buttonHashMap.put("imgElementButton", new JButton("imgElementButton"));
        buttonHashMap.put("inputElementButton", new JButton("inputElementButton"));
        buttonHashMap.put("labelElementButton", new JButton("labelElementButton"));
        buttonHashMap.put("buttonElementButton", new JButton("buttonElementButton"));
        buttonHashMap.put("aElementButton", new JButton("aElementButton"));
        buttonHashMap.put("pElementButton", new JButton("pElementButton"));
        buttonHashMap.put("h1ElementButton", new JButton("h1ElementButton"));
        buttonHashMap.put("ulElementButton", new JButton("ulElementButton"));
        buttonHashMap.put("olElementButton", new JButton("olElementButton"));
    }

    public HashMap<String, JButton> getButtonHashMap() {
        return buttonHashMap;
    }

    @Override
    public void add(JComponent component) {
        // ?
    }
}
