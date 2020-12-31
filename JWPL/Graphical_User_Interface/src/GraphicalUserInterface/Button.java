package GraphicalUserInterface;
import ButtonListeners.elementButtonListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

// Yamaç Demirkan Yılmaz -> v0.1
//Nebi Peker Celik && Yamaç Demirkan Yılmaz -> v0.2
// Contains the implementation of Button class in Graphical User Interface package.

public class Button implements GraphicalUserInterface {

    private HashMap<String, JButton> buttonHashMap = new HashMap<>();

    public void initializeButton() {
        buttonHashMap.put("imgElement", new JButton("imgElementButton"));
        buttonHashMap.put("inputElement", new JButton("inputElementButton"));
        buttonHashMap.put("labelElement", new JButton("labelElementButton"));
        buttonHashMap.put("buttonElement", new JButton("buttonElementButton"));
        buttonHashMap.put("aElement", new JButton("aElementButton"));
        buttonHashMap.put("pElement", new JButton("pElementButton"));
        buttonHashMap.put("h1Element", new JButton("h1ElementButton"));
        buttonHashMap.put("ulElement", new JButton("ulElementButton"));
        buttonHashMap.put("olElement", new JButton("olElementButton"));
        for(Map.Entry<String, JButton> set : buttonHashMap.entrySet())
            set.getValue().addActionListener(new elementButtonListener(set.getKey()));
    }

    public HashMap<String, JButton> getButtonHashMap() {
        return buttonHashMap;
    }

    @Override
    public void add(JComponent component) {
        // ?
    }
}
