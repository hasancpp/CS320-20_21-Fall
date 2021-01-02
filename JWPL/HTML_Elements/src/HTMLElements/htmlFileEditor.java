package HTMLElements;

import javax.swing.filechooser.FileSystemView;
import java.io.*;


public class htmlFileEditor {
     public static String fileContent = "<!DOCTYPE html>\n" +
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
