package HTMLElementsTests;

import static org.junit.jupiter.api.Assertions.*;

import HTMLElements.inputElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class inputElementTest {
	private inputElement element;

	
	@BeforeEach
    void setUp() {
        element = new inputElement();
    }
	
	@Test
	void setReadonlytrue() {
		element.setReadonly(true);
		String str = element.getText();
		assertEquals(str, "<input type=\"1\" placeholder=\"2\" readonly><br>\n");

	}

	@Test
	void setReadonlyfalse() {
		element.setReadonly(false);
		String str = element.getText();
		assertEquals(str, "<input type=\"1\" placeholder=\"2\"><br>\n");
	}

	@Test
	void setRequiredTrue() {
		element.setRequired(true);
		String str = element.getText();
		assertEquals(str, "<input type=\"1\" placeholder=\"2\" required><br>\n");
	}

	@Test
	void setRequiredFalse() {
		element.setRequired(false);
		assertEquals(element.getText(), "<input type=\"1\" placeholder=\"2\"><br>\n");
	}

	@Test
	void setType() {
		element.setType("test");
		String str = element.getText();
		assertEquals(str, "<input type=\"test\" placeholder=\"2\"><br>\n");
	}

	@Test
	void defaultType() {
		element.defaultType();
		String str = element.getText();
		assertEquals(str, "<input placeholder=\"2\"><br>\n");
	}

	@Test
	void setPlaceholder() {
		element.setPlaceholder("test");
		String str = element.getText();
		assertEquals(str, "<input type=\"1\" placeholder=\"test\"><br>\n");
	}

	@Test
	void defaultPlaceholder() {
		element.defaultPlaceholder();
		String str = element.getText();
		assertEquals(str, "<input type=\"1\"><br>\n");
	}

	@Test
	void getText() {
		String str = element.getText();
		assertEquals(str, "<input type=\"1\" placeholder=\"2\"><br>\n");
	}
}
