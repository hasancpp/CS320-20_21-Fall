package HTMLElementsTests;

import HTMLElements.buttonElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class buttonElementTest {

    private buttonElement element;

    @BeforeEach
    void setUp() {
        element = new buttonElement();
    }
    
    @Test
    void setType() {
        element.setType("a type has been set");
        assertEquals(element.getText(), "<button type=\"a type has been set\">1</button><br>\n");
    }

    @Test
    void getText() {
        assertEquals(element.getText(), "<button type=\"2\">1</button><br>\n");
    }

    @Test
    void setText() {
        element.setText("a text has been set");
        assertEquals(element.getText(), "<button type=\"2\">a text has been set</button><br>\n");
    }
}