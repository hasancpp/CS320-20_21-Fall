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
        System.out.println(fileContent);
        pElement p1 = new pElement("hello world");
        addElement(p1);
        pElement p2 = new pElement("hiho");
        addElement(p2);
        System.out.println(fileContent);
        changeOrder(p1, p2);
        System.out.println(fileContent);
    }
}
