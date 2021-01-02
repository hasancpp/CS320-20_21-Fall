package HTMLElementsTests;

import HTMLElements.h1Element;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class h1ElementTest {

    private h1Element element;

    @BeforeEach
    void setUp() {
        element = new h1Element();
    }

    @Test
    void getText() {
        assertEquals(element.getText(), "<h1>2</h1><br>\n");
    }

    @Test
    void setText() {
        element.setText("a text has been set");
        assertEquals(element.getText(), "<h1>a text has been set</h1><br>\n");
    }
}