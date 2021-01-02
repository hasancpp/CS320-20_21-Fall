package HTMLElements;

public class pElement implements Element {
    private String text = "<p>1</p><br>\n";

    //constructor
    public pElement() {
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
