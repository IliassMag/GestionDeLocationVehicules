package Vue;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar {
	
	public JMenu LV,LC;
	public MenuBar() {
	
		LV=new JMenu("Ajouter V�hicule");    
		LC=new JMenu("Ajouter client");    
		add(LV); add(LC);
		
	}
	
	
}

