package HTMLElements;

public class olElement implements Element {
    private String text = "<ol>\n" +
            "</ol><br>\n";

    //constructor
    public olElement() { }

    //other methods
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
