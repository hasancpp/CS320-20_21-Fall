package HTMLElements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

class htmlFileEditorTest {

    private htmlFileEditor file;

    @BeforeEach
    void setUp() {
        file = new htmlFileEditor();
    }

    @Test
    void addElement() {
        Element element = new pElement();
        file.addElement(element);
        assertTrue(htmlFileEditor.fileContent.equals("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>1</p><br>\n" +
                "</body>\n" +
                "</html>"));
    }

    @Test
    void create() {
        file.create();
        String path = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "\\JWPLfile";
        File f = new File(path + 0 + ".html");
        assertTrue(f.exists());
        f.delete();
    }
}