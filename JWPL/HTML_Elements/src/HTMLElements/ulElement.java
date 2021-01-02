package HTMLElements;

public class ulElement implements Element {
    private String text = "<ul>\n" +
            "</ul><br>\n";

    //constructor
    public ulElement() { }

    //other methods
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
