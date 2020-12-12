public class pElement implements Element {
    private String text = "<p>1</p><br>\n";

    //constructors
    public pElement() {
        setText("&nbsp");
    }

    public pElement(String text) {
        setText(text);
    }

    //other methods
    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = this.text.replace("1", text);
    }
}
