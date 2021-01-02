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
	void setReadonly() {
		
	}
	
	void setRequired() {
		
	}
	
	void setType() {
		element.setType("test");
		String str = element.getText();
		assertTrue(str.equals("<input type=test placeholder=\"2\"><br>\n"));
	}

	void defaultType() {
		element.defaultType();
		String str = element.getText();
		assertTrue(str.equals("<input placeholder=\"2\"><br>\n"));
	}
	
	void setPlaceholder() {
		element.setPlaceholder("test");
		String str = element.getText();
		assertTrue(str.equals("<input type=\"1\" placeholder=\test><br>\n"));
	}
	void defaultPlaceholder() {
		element.defaultPlaceholder();
		String str = element.getText();
		assertTrue(str.equals("<input type=\"1\"><br>\n"));
	}
	void getText() {
		String str = element.getText();
		assertTrue(str.equals("<input type=\"1\" placeholder=\"2\"><br>\n"));
	}
}
