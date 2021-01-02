package GraphicalUserInterfaceTests;

import GraphicalUserInterface.Frame;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FrameTest {

    @Test
    void editButton() {
        JButton button = new JButton();
        Frame.editButton(button);
        assertAll(() -> assertEquals("java.awt.Color[r=131,g=155,b=151]", button.getBackground().toString()),
                () -> assertEquals("java.awt.Color[r=207,g=211,b=206]", button.getForeground().toString()),
                () -> assertEquals("java.awt.Font[family=Dialog,name=Roboto,style=bold,size=12]", button.getFont().toString()),
                () -> assertFalse(button.isFocusPainted()),
                () -> assertFalse(button.isFocusable()),
                () -> assertTrue(button.isRolloverEnabled()),
                () -> assertFalse(button.isBorderPainted())
                );
        }

    @Test
    void setPanelColor() {
        JPanel panel = new JPanel();
        Frame.setPanelColor(panel);
        assertEquals("java.awt.Color[r=198,g=180,b=151]", panel.getBackground().toString());
    }
}