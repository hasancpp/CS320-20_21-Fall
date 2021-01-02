package HTMLElements;

public class labelElement implements Element {
    private String text = "<label for=\"2\">1</label><br>\n";

    //constructor
    public labelElement() {}

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

    public void defaultFor() {
        this.text = this.text.replace(" for=\"2\"", "");
    }
}
