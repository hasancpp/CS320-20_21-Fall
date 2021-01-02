package HTMLElements;

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
        assertTrue(element.getText().equals("<button type=\"a type has been set\">1</button><br>\n"));
    }

    @Test
    void getText() {
        assertTrue(element.getText().equals("<button type=\"2\">1</button><br>\n"));
    }

    @Test
    void setText() {
        element.setText("a text has been set");
        assertTrue(element.getText().equals("<button type=\"2\">a text has been set</button><br>\n"));
    }
}