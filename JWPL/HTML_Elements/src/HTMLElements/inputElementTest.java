package HTMLElements;

import static org.junit.jupiter.api.Assertions.*;

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
		element.setReadonly(true);
		String str = element.getText();
		assertTrue(str.equals("<img width=\"2px\" height=\"3px\" readonly><br>\n"));
		element.setReadonly(false);
		str = element.getText();
		assertTrue(str.equals("<img width=\"2px\" height=\"3px\"><br>\n"));
	}
	
	void setRequired() {
		element.setRequired(true);
		String str = element.getText();
		assertTrue(str.equals("<img width=\"2px\" height=\"3px\" required><br>\n"));
		element.setRequired(false);
		str = element.getText();
		assertTrue(str.equals("<img width=\"2px\" height=\"3px\"><br>\n"));
		
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
