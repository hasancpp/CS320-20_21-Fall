package HTMLElementsTests;

import HTMLElements.pElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pElementTest {

    private HTMLElements.pElement pElement;

    @BeforeEach
    void setUp() {
        pElement = new pElement();
    }

    @Test
    void getText() {
        assertEquals(pElement.getText(), "<p>1</p><br>\n");
    }

    @Test
    void setText() {
        pElement.setText("text");
        assertEquals(pElement.getText(), "<p>text</p><br>\n");
    }
}