package GraphicalUserInterfaceTests;

import GraphicalUserInterface.Button;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void initializeButton() {
        Button.initializeButton();
        HashMap<String, JButton> hashMap = Button.getButtonHashMap();
        assertAll(() -> assertEquals(hashMap.get("imgElement").getText(), "image element"),
                () -> assertEquals(hashMap.get("inputElement").getText(), "input element"),
                () -> assertEquals(hashMap.get("labelElement").getText(), "label element"),
                () -> assertEquals(hashMap.get("buttonElement").getText(), "button element"),
                () -> assertEquals(hashMap.get("aElement").getText(), "anchor element"),
                () -> assertEquals(hashMap.get("pElement").getText(), "paragraph element"),
                () -> assertEquals(hashMap.get("h1Element").getText(), "header1 element"),
                () -> assertEquals(hashMap.get("ulElement").getText(), "unordered list element"),
                () -> assertEquals(hashMap.get("olElement").getText(), "ordered list element"));
    }
}