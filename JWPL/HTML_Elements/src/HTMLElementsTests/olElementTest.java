package HTMLElementsTests;

import HTMLElements.olElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class olElementTest {

    private HTMLElements.olElement olElement;

    @BeforeEach
    void setUp() {
        olElement = new olElement();
    }

    @Test
    void addItem() {
        olElement.addItem("item");
        assertEquals("<ol>\n" +
                "<li>item</li>\n" +
                "</ol><br>\n", olElement.getText());
    }

    @Test
    void getText() {
        assertEquals("<ol>\n" +
                "</ol><br>\n", olElement.getText());
    }
}