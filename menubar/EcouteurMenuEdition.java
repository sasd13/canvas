package menubar;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurMenuEdition implements ActionListener {

	private MenuEdition menuEdition;
	
	public EcouteurMenuEdition(MenuEdition menuEdition) {
		this.menuEdition = menuEdition;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuEdition.getItemEditionAnnuler().getName()) == 0) {
			
		}
		else if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuEdition.getItemEditionRetablir().getName()) == 0) {
			
		}
		else if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuEdition.getItemEditionCouper().getName()) == 0) {
			
		}
		else if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuEdition.getItemEditionCopier().getName()) == 0) {
			
		}
		else if (((MenuItem) e.getSource()).getLabel().compareTo(this.menuEdition.getItemEditionColler().getName()) == 0) {
			
		}
		else {
			System.out.println("Erreur ecouteur edition");
		}
	}

}
