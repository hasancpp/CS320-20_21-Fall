package ButtonListeners;

import GraphicalUserInterface.Frame;
import GraphicalUserInterface.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class upButtonListener implements ActionListener {

	 private final String id;
	 private final int index;
	   
	 public upButtonListener(String id, int index) {
	        this.id = id;
	        this.index = index;
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Frame.swapUp(Panel.panels.get(Panel.elementIndices.get(id)).get(index));
        
        
	}

}
