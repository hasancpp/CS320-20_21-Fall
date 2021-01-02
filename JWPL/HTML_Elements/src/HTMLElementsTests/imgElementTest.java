package HTMLElementsTests;

import static org.junit.jupiter.api.Assertions.*;

import HTMLElements.imgElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class imgElementTest {

	private imgElement element;
	
	@BeforeEach
    void setUp() {
        element = new imgElement();
    }

	@Test
	void getText() {
		String str = element.getText();
		assertTrue(str.equals("<img src=\"1\" width=\"2px\" height=\"3px\"><br>\n"));
	}

	@Test
	void setSrc() {
		element.setSrc("test");
		String str = element.getText();
		assertTrue(str.equals("<img src=\"test\" width=\"2px\" height=\"3px\"><br>\n"));
		
	}

	@Test
	void defaultSrc() {
		element.defaultSrc(); 
		String str = element.getText();
		assertTrue(str.equals("<img width=\"2px\" height=\"3px\"><br>\n"));
		 
	 }

	 @Test
	 void setWidth() {
		 element.setWidth("5");
		 String str = element.getText();
		 assertTrue(str.equals("<img src=\"1\" width=\"5px\" height=\"3px\"><br>\n"));
		 
	 }

	 @Test
	 void defaultWidth() {
		element.defaultWidth(); 
		String str = element.getText();
		assertTrue(str.equals("<img src=\"1\" height=\"3px\"><br>\n"));
		 
	 }
	 
	 @Test
	 void setHeight() {
		 element.setHeight("10");
		 String str = element.getText();
		 assertTrue(str.equals("<img src=\"1\" width=\"2px\" height=\"10px\"><br>\n"));
		 
	 }

	 @Test
	 void defaultHeight() {
		 element.defaultHeight(); 
			String str = element.getText();
			assertTrue(str.equals("<img src=\"1\" width=\"2px\"><br>\n"));
		 
	 }
	 
}
