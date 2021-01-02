package HTMLElements;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class imgElementTest {

	private imgElement element;
	@Test
	
	@BeforeEach
    void setUp() {
        element = new imgElement();
    }
	
	void getText() {
		String str = element.getText();
		assertTrue(str.equals("<img src=\"1\" width=\"2px\" height=\"3px\"><br>\n"));
	}
	
	void setSrc() {
		element.setSrc("test");
		String str = element.getText();
		assertTrue(str.equals("<img src=test width=\"2px\" height=\"3px\"><br>\n"));
		
	}
	
	 void defaultSrc() {
		element.defaultSrc(); 
		String str = element.getText();
		assertTrue(str.equals("<img width=\"2px\" height=\"3px\"><br>\n"));
		 
	 }
	 
	 void setWidth() {
		 element.setWidth("5px");
		 String str = element.getText();
		 assertTrue(str.equals("<img width=5px height=\"3px\"><br>\n"));
		 
	 }
	 void defaultWidth() {
		element.defaultWidth(); 
		String str = element.getText();
		assertTrue(str.equals("<img height=\"3px\"><br>\n"));
		 
	 }
	 
	 
	 void setHeight() {
		 element.setHeight("10px");
		 String str = element.getText();
		 assertTrue(str.equals("<img width=\"2px\" height=10px ><br>\n"));
		 
	 }

	 
	 void defaultHeight() {
		 element.defaultHeight(); 
			String str = element.getText();
			assertTrue(str.equals("<img width=\"2px\"><br>\n"));
		 
	 }
	 
}
