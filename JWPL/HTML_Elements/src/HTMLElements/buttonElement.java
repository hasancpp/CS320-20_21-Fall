package HTMLElements;

public class buttonElement implements Element {
    private String text = "<button type=\"2\">1</button><br>\n";

    //constructor
    public buttonElement() { }

    //other methods
    public void setAutofocus(boolean value) {
        int index = text.indexOf(">");
        StringBuilder newString = new StringBuilder(text);
        if (value) newString.insert(index, " autofocus"); else text = text.replace(" autofocus", "");
        text = newString.toString();
    }

    public void setDisabled(boolean value) {
        int index = text.indexOf(">");
        StringBuilder newString = new StringBuilder(text);
        if (value) newString.insert(index, " disabled"); else text = text.replace(" disabled", "");
        text = newString.toString();
    }

    public void setType(String text) {
        this.text = this.text.replace("2", text);
    }

    public void defaultType() {
        this.text = this.text.replace(" type=\"2\"", "");
    }

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = this.text.replace("1", text);
    }
}
