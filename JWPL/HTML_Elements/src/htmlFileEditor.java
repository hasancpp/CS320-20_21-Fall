import javax.swing.filechooser.FileSystemView;



import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
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
        StringBuilder newString = new StringBuilder(fileContent);
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

    public static void create() {
        String path = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "\\JWPLfile";
        int index = 0;
        File f;
        do {
            f = new File(path + index++ + ".html");
        } while (f.exists());
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write(fileContent);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void create(String path) {
        path += "\\JWPLfile";
        int index = 0;
        File f;
        do {
            f = new File(path + index++ + ".html");
        } while (f.exists());
        BufferedWriter bw ;
        try {
            bw = new BufferedWriter(new FileWriter(f));
            bw.write(fileContent);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
