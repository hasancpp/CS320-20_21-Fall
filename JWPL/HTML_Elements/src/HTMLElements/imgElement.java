package HTMLElements;

public class imgElement implements Element {
    private String text = "<img src=\"1\" width=\"2px\" height=\"3px\"><br>\n";

    //constructors
    public imgElement() {    }

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

    public void setWidth(String width) {
        text = text.replace("2", width);
    }

    public void defaultWidth() {
        text = text.replace(" width=\"2px\"", "");
    }

    public void setHeight(String height) {
        text = text.replace("3", height);
    }

    public void defaultHeight() {
        text = text.replace(" height=\"3px\"", "");
    }
}