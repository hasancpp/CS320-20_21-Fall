public class pElement implements Element {
    private String text = "<p>*</p>\n";

    public pElement(String text) {
        setText(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = this.text.replace("*", text);
    }
}
