package HTMLElements;

public class h1Element implements Element {
    private String text = "<h1>2</h1><br>\n";

    //constructor
    public h1Element() {    }

    //other methods
    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = this.text.replace("2", text);
    }
}
