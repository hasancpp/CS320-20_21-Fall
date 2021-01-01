package HTMLElements;

public class imgElement implements Element {
    private String text = "<img src=\"1\" width=\"2px\" height=\"3px\"><br>\n";

    //constructors
    public imgElement() {
        defaultSrc();
        defaultWidth();
        defaultHeight();
    }

    public imgElement(String src) {
        setSrc(src);
        defaultWidth();
        defaultHeight();
    }

    public imgElement(String src, double width, double height) {
        setSrc(src);
        setWidth(width);
        setHeight(height);
    }

    //other methods
    @Override
    public String getText() {
        return text;
    }

    public void setSrc(String src) {
        text = text.replace("1", src);
    }

    public void defaultSrc() {
        text = text.replace(" src=\"1\"", "");
    }

    public void setWidth(double width) {
        text = text.replace("2", Double.toString(width));
    }

    private void defaultWidth() {
        text = text.replace(" width=\"2px\"", "");
    }

    public void setHeight(double height) {
        text = text.replace("3", Double.toString(height));
    }

    private void defaultHeight() {
        text = text.replace(" height=\"3px\"", "");
    }
}