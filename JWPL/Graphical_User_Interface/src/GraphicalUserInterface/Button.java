package GraphicalUserInterface;
import ButtonListeners.elementButtonListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class Button {

    private final HashMap<String, JButton> buttonHashMap = new HashMap<>();

    public void initializeButton() {
        buttonHashMap.put("imgElement", new JButton("image element"));
        buttonHashMap.put("inputElement", new JButton("input element"));
        buttonHashMap.put("labelElement", new JButton("label element"));
        buttonHashMap.put("buttonElement", new JButton("button element"));
        buttonHashMap.put("aElement", new JButton("anchor element"));
        buttonHashMap.put("pElement", new JButton("paragraph element"));
        buttonHashMap.put("h1Element", new JButton("header1 element"));
        buttonHashMap.put("ulElement", new JButton("unordered list element"));
        buttonHashMap.put("olElement", new JButton("ordered list element"));
        for(Map.Entry<String, JButton> set : buttonHashMap.entrySet())
            set.getValue().addActionListener(new elementButtonListener(set.getKey()));
    }

    public HashMap<String, JButton> getButtonHashMap() {
        return buttonHashMap;
    }

}
