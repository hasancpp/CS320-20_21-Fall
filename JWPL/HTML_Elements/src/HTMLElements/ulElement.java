package HTMLElements;

import java.util.ArrayList;

public class ulElement implements Element {
    private String text = "<ul>\n" +
            "</ul><br>\n";

    public ulElement() { }

    public ulElement(String item) {
        addItem(item);
    }

    public ulElement(ArrayList<String> arr) {
        for (String item : arr)
            addItem(item);
    }

    public void addItem(String item) {
        int index = text.indexOf("</ul>");
        StringBuilder newString = new StringBuilder(text);
        newString.insert(index, "<li>" + item + "</li>\n");
        text = newString.toString();
    }

    @Override
    public String getText() {
        return text;
    }
}
