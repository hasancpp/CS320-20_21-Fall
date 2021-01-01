package HTMLElements;

import java.util.ArrayList;

public class olElement implements Element {
    private String text = "<ol>\n" +
            "</ol><br>\n";

    public olElement() { }

    public olElement(String item) {
        addItem(item);
    }

    public olElement(ArrayList<String> arr) {
        for (String item : arr)
            addItem(item);
    }

    public void addItem(String item) {
        int index = text.indexOf("</ol>");
        StringBuilder newString = new StringBuilder(text);
        newString.insert(index, "<li>" + item + "</li>\n");
        text = newString.toString();
    }

    @Override
    public String getText() {
        return text;
    }
}
