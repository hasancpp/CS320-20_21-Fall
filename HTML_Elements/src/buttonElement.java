public class buttonElement implements Element {
    private String text = "<button type=\"2\">1</button><br>\n";

    //constructors
    public buttonElement() {
        setText("&nbsp");
        defaultType();
        setAutofocus(false);
        setDisabled(false);
    }

    public buttonElement(String text) {
        setText(text);
        defaultType();
        setAutofocus(false);
        setDisabled(false);
    }

    public buttonElement(String text, boolean autofocus, boolean disabled) {
        setText(text);
        defaultType();
        setAutofocus(autofocus);
        setDisabled(disabled);
    }

    public buttonElement(String text, String type, boolean autofocus, boolean disabled) {
        setText(text);
        setType(type);
        setAutofocus(autofocus);
        setDisabled(disabled);
    }

    //other methods
    public void setAutofocus(boolean value) {
        int index = text.indexOf(">");
        StringBuilder newString = new StringBuilder(text);
        if (value) newString.insert(index, " autofocus"); else text.replace(" autofocus", "");
        text = newString.toString();
    }

    public void setDisabled(boolean value) {
        int index = text.indexOf(">");
        StringBuilder newString = new StringBuilder(text);
        if (value) newString.insert(index, " disabled"); else text.replace(" disabled", "");
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
