package menubar;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurMenuAide implements ActionListener {

	private MenuAide menuAide;
	
	public EcouteurMenuAide(MenuAide menuAide) {
		this.menuAide = menuAide;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuAide.getItemAideManuel().getName()) == 0) {
			
		}
		else if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuAide.getItemAideTutoriel().getName()) == 0) {
			
		}
		else {
			System.out.println("Erreur ecouteur aide");
		}
	}

}
