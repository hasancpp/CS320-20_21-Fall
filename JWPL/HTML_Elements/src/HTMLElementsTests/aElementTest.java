package HTMLElementsTests;


import HTMLElements.aElement;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class aElementTest {

    private aElement element;

    @BeforeEach
    void setUp() {
        element = new aElement();
    }

    @org.junit.jupiter.api.Test
    void setHref() {
        element.setHref("www.google.com");
        assertEquals(element.getText(), "<a href=\"www.google.com\">2</a><br>\n");
    }

    @org.junit.jupiter.api.Test
    void setText() {
        element.setText("click here");
        assertEquals(element.getText(), "<a href=\"1\">click here</a><br>\n");
    }

    @org.junit.jupiter.api.Test
    void getText() {
        assertEquals(element.getText(), "<a href=\"1\">2</a><br>\n");
    }
}