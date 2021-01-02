package HTMLElements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ulElementTest {

    private ulElement ulElement;

    @BeforeEach
    void setUp() {
        ulElement = new ulElement();
    }

    @Test
    void addItem() {
        ulElement.addItem("item");
        assertTrue(ulElement.getText().equals("<ul>\n" +
                "<li>item</li>\n" +
                "</ul><br>\n"));
    }

    @Test
    void getText() {
        assertTrue(ulElement.getText().equals("<ul>\n" +
                "</ul><br>\n"));
    }
}