package HTMLElementsTests;

import static org.junit.jupiter.api.Assertions.*;

import HTMLElements.labelElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class labelElementTest {

	private labelElement element;
	
	@BeforeEach
    void setUp() {
        element = new labelElement();
    }

    @Test
	void getText() {
		assertEquals(element.getText(), "<label for=\"2\">1</label><br>\n");
	}

	@Test
	void setFor() {
		element.setFor("test");
		assertEquals(element.getText(), "<label for=\"test\">1</label><br>\n");
	}

	@Test
	void defaultFor() {
		element.defaultFor();
		String str= element.getText();
		assertEquals(str, "<label>1</label><br>\n");
	}

}
