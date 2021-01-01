package HTMLElements;

public class h1Element implements Element {
    private String text = "<h1>2</h1><br>\n";

    //constructors
    public h1Element() {
        setText("&nbsp");
    }

    public h1Element(String text) {
        setText(text);
    }

    //other methods
    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = this.text.replace("2", text);
    }
}
