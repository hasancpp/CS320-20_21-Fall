package HTMLElements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pElementTest {

    private pElement pElement;

    @BeforeEach
    void setUp() {
        pElement = new pElement();
    }

    @Test
    void getText() {
        assertTrue(pElement.getText().equals("<p>1</p><br>\n"));
    }

    @Test
    void setText() {
        pElement.setText("text");
        assertTrue(pElement.getText().equals("<p>text</p><br>\n"));
    }
}