package HTMLElements;

public class aElement implements Element{
    private String text = "<a href=\"1\">2</a><br>\n";
    
    //constructors
 
    public aElement(String href) {
        setHref(text);
        setText("");
    }
    
    public aElement(String href, String text) {
    	setHref(href);
    	setText(text);
    }

    public void setHref(String href) {
        this.text = this.text.replace("1", href);
    }

    public void setText(String text) {
    	this.text = this.text.replace("2", text);
    }

	@Override
	public String getText() {
		return text;
	}
   
}
