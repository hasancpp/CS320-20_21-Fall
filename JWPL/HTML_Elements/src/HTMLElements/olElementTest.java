package HTMLElements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class olElementTest {

    private olElement olElement;

    @BeforeEach
    void setUp() {
        olElement = new olElement();
    }

    @Test
    void addItem() {
        olElement.addItem("item");
        assertTrue(olElement.getText().equals("<ol>\n" +
                "<li>item</li>\n" +
                "</ol><br>\n"));
    }

    @Test
    void getText() {
        assertTrue(olElement.getText().equals("<ol>\n" +
                "</ol><br>\n"));
    }
}