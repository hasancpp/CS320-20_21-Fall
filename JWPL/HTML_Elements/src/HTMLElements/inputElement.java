package HTMLElements;

public class inputElement implements Element {
	private String text = "<input type=\"1\" placeholder=\"2\"><br>\n";

	//constructor
    public inputElement() {

    }

    //other methods
    public void setReadonly(boolean readonly) {
        int index = text.indexOf(">");
        StringBuilder newString = new StringBuilder(text);
        if (readonly) newString.insert(index, " readonly"); else text = text.replace(" readonly", "");
        text = newString.toString();
    }
    
    public void setRequired(boolean required) {
        int index = text.indexOf(">");
        StringBuilder newString = new StringBuilder(text);
        if (required) newString.insert(index, " required"); else text = text.replace(" required", "");
        text = newString.toString();
    }

    public void setType(String text) {
        this.text = this.text.replace("1", text);
    }

    public void defaultType() {
        this.text = this.text.replace(" type=\"1\"", "");
    }

    public void setPlaceholder(String text) {
        this.text = this.text.replace("2", text);
    }

    public void defaultPlaceholder() {
        this.text = this.text.replace(" placeholder=\"2\"", "");
    }

	@Override
	public String getText() {
		return text;
	}
}
