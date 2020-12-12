import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmlFileEditor {
     protected static String fileContent = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "</head>\n" +
            "<body>\n" +
            "</body>\n" +
            "</html>";

    public static void addElement(Element element) {
        int index = fileContent.indexOf("</body>");
        StringBuffer newString = new StringBuffer(fileContent);
        newString.insert(index, element.getText());
        fileContent = newString.toString();
    }

    public static void removeElement(Element element) {
        fileContent = fileContent.replace(element.getText(), "");
    }

    public static void changeOrder(Element element1, Element element2) {
        if (fileContent.indexOf(element1.getText()) > fileContent.indexOf(element2.getText())) {
            fileContent = fileContent.replace(element1.getText(), element2.getText());
            fileContent = fileContent.replaceFirst(Pattern.quote(element2.getText()), Matcher.quoteReplacement(element1.getText()));
        } else {
            fileContent = fileContent.replace(element2.getText(), element1.getText());
            fileContent = fileContent.replaceFirst(Pattern.quote(element1.getText()), Matcher.quoteReplacement(element2.getText()));
        }
    }

    public static void main(String[] args) {
        imgElement img1 = new imgElement("http://cafefernando.com/images/brownie1.jpg");
        addElement(img1);
        imgElement img2 = new imgElement();
        addElement(img2);
        imgElement img3 = new imgElement("http://cafefernando.com/images/brownie1.jpg", 50, 50);
        addElement(img3);
        changeOrder(img1, img3);
        System.out.println(fileContent);
    }
}
