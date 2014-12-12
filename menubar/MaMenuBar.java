package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import frame.MaFrame;

@SuppressWarnings("serial")
public class MaMenuBar extends JMenuBar {

	private MaFrame frame;
	private MenuFichier menuFichier;
	private MenuEdition menuEdition;
	private MenuForme menuForme;
	private MenuTaille menuTaille;
	private MenuCouleur menuCouleur;
	private MenuAide menuAide;
	
	
	public MaMenuBar(MaFrame frame) {
		super();
		
		this.frame = frame;	
		
		this.menuFichier = new MenuFichier(this);
		this.add(this.menuFichier);
		
		this.menuEdition = new MenuEdition(this);
		this.add(this.menuEdition);
		
		this.menuForme = new MenuForme(this);
		this.add(this.menuForme);
		
		this.menuTaille = new MenuTaille(this);
		this.add(this.menuTaille);
		
		this.menuCouleur = new MenuCouleur(this);
		this.add(this.menuCouleur);
		
		this.menuAide = new MenuAide(this);
		this.add(this.menuAide);
	}
	
	public MaFrame getMaFrame() {
		return this.frame;
	}
	
	public MenuFichier getMenuFichier() {
		return this.menuFichier;
	}
	
	public JMenu getMenuEdition() {
		return this.menuEdition;
	}
	
	public JMenu getMenuAide() {
		return this.menuAide;
	}
}
