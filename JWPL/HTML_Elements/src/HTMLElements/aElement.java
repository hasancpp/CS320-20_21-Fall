package HTMLElements;

public class aElement implements Element{
    private String text = "<a href=\"1\">2</a><br>\n";
    
    //constructor
    public aElement() { }

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
