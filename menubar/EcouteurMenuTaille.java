package menubar;

import java.awt.BasicStroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import canvas.Toile;

public class EcouteurMenuTaille implements ActionListener{

	private MenuTaille menuTaille;
	private Toile toile;
	
	public EcouteurMenuTaille(MenuTaille menuTaille) {
		this.menuTaille = menuTaille;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.toile = this.menuTaille.getMaMenuBar().getMaFrame().getToile();
		
		if (((JMenuItem) e.getSource()).getText().compareTo(this.menuTaille.getItemTaille1().getText()) == 0) {
			this.toile.setStroke(new BasicStroke(1));
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuTaille.getItemTaille3().getText()) == 0) {
			this.toile.setStroke(new BasicStroke(3));
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuTaille.getItemTaille6().getText()) == 0) {
			this.toile.setStroke(new BasicStroke(6));
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuTaille.getItemTaille9().getText()) == 0) {
			this.toile.setStroke(new BasicStroke(9));
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuTaille.getItemTaille12().getText()) == 0) {
			this.toile.setStroke(new BasicStroke(12));
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuTaille.getItemTaille15().getText()) == 0) {
			this.toile.setStroke(new BasicStroke(15));
		}
		else {
			System.out.println("Erreur ecouteur taille");
		}
	}	
}
