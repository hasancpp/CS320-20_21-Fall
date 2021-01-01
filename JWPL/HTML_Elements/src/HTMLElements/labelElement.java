package HTMLElements;

public class labelElement implements Element {
    private String text = "<label for=\"2\">1</label><br>\n";

    //constructors
    public labelElement() {
        setText("");
        defaultLabel();
    }

    public labelElement(String text) {
        setText(text);
        defaultLabel();
    }

    public labelElement(String text, String forinput) {
        setText(text);
        setFor(forinput);
    }

    //other methods
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = this.text.replace("1", text);
    }

    public void setFor(String text) {
        this.text = this.text.replace("2", text);
    }

    public void defaultLabel() {
        this.text = this.text.replace(" for=\"2\"", "");
    }
}
