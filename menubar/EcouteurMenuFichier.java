package menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import frame.MaFrameIO;

public class EcouteurMenuFichier implements ActionListener{

	private MenuFichier menuFichier;
	private MaFrameIO frameIO;
	
	public EcouteurMenuFichier(MenuFichier menuFichier) {
		this.menuFichier = menuFichier;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.frameIO = this.menuFichier.getMaMenuBar().getMaFrame().getMaFrameIO();
		
		if (((JMenuItem) e.getSource()).getText().compareTo(this.menuFichier.getItemFichierNouveau().getText()) == 0) {
			this.frameIO.nouveau();
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuFichier.getItemFichierOuvrir().getText()) == 0) {
			this.frameIO.ouvrir();
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuFichier.getItemFichierEnregistrer().getText()) == 0) {
			this.frameIO.enregistrer();
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuFichier.getItemFichierEnregistrerSous().getText()) == 0) {
			this.frameIO.enregistrerSous();
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuFichier.getItemFichierImprimer().getText()) == 0) {
			this.frameIO.imprimer();
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuFichier.getItemFichierQuitter().getText()) == 0) {
			this.frameIO.quitter();
		}
		else {
			System.out.println("Erreur ecouteur fichier");
		}
	}	
}
