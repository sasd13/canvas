package menubar;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import canvas.Toile;

public class EcouteurMenuCouleur implements ActionListener {

	private MenuCouleur menuCouleur;
	private Toile toile;
	
	public EcouteurMenuCouleur(MenuCouleur menuCouleur) {
		this.menuCouleur = menuCouleur;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.toile = this.menuCouleur.getMaMenuBar().getMaFrame().getToile();
		
		if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurNoir().getText()) == 0) {
			this.toile.setColor(Color.BLACK);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurBlanc().getText()) == 0) {
			this.toile.setColor(Color.WHITE);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurBleu().getText()) == 0) {
			this.toile.setColor(Color.BLUE);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurJaune().getText()) == 0) {
			this.toile.setColor(Color.YELLOW);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurRouge().getText()) == 0) {
			this.toile.setColor(Color.RED);
		}		
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurVert().getText()) == 0) {
			this.toile.setColor(Color.GREEN);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurRose().getText()) == 0) {
			this.toile.setColor(Color.PINK);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuCouleur.getItemCouleurOrange().getText()) == 0) {
			this.toile.setColor(Color.ORANGE);
		}		
		else {
			System.out.println("Erreur ecouteur couleur");
		}
	}

}
