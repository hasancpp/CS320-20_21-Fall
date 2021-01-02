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
		assertTrue(element.getText().equals("<label for=\"2\">1</label><br>\n"));
	}

	@Test
	void setFor() {
		element.setFor("test");
		String str= element.getText();
		assertTrue(element.getText().equals("<label for=\"test\">1</label><br>\n"));
	}

	@Test
	void defaultFor() {
		element.defaultFor();
		String str= element.getText();
		assertTrue(str.equals("<label>1</label><br>\n"));
	}

}
