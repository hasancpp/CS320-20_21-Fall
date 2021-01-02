package HTMLElementsTests;

import HTMLElements.Element;
import HTMLElements.htmlFileEditor;
import HTMLElements.pElement;
import org.junit.jupiter.api.Test;

import javax.swing.filechooser.FileSystemView;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class htmlFileEditorTest {

    @Test
    void addElement() {
        Element element = new pElement();
        htmlFileEditor.addElement(element);
        assertEquals("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<p>1</p><br>\n" +
                "</body>\n" +
                "</html>", htmlFileEditor.fileContent);
    }

    @Test
    void create() {
        htmlFileEditor.create();
        String path = FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "\\JWPLfile";
        File f = new File(path + 0 + ".html");
        assertTrue(f.exists());
        f.delete();
    }
}