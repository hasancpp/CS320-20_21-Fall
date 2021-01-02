package HTMLElements;


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
        assertTrue(element.getText().equals("<a href=\"www.google.com\">2</a><br>\n"));
    }

    @org.junit.jupiter.api.Test
    void setText() {
        element.setText("click here");
        assertTrue(element.getText().equals("<a href=\"1\">click here</a><br>\n"));
    }

    @org.junit.jupiter.api.Test
    void getText() {
        assertTrue(element.getText().equals("<a href=\"1\">2</a><br>\n"));
    }
}