package HTMLElementsTests;

import HTMLElements.ulElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ulElementTest {

    private HTMLElements.ulElement ulElement;

    @BeforeEach
    void setUp() {
        ulElement = new ulElement();
    }

    @Test
    void addItem() {
        ulElement.addItem("item");
        assertEquals("<ul>\n" +
                "<li>item</li>\n" +
                "</ul><br>\n", ulElement.getText());
    }

    @Test
    void getText() {
        assertEquals("<ul>\n" +
                "</ul><br>\n", ulElement.getText());
    }
}