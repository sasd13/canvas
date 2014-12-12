package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuCouleur extends JMenu {

	private MaMenuBar menuBar;
	private JMenuItem itemCouleurNoir, itemCouleurBlanc, itemCouleurBleu, itemCouleurJaune, itemCouleurRouge, itemCouleurVert, itemCouleurRose, itemCouleurOrange;
	
	public MenuCouleur(MaMenuBar menuBar) {
		super("Couleur");
		
		this.menuBar = menuBar;
		
		EcouteurMenuCouleur ecouteur = new EcouteurMenuCouleur(this);
		
		this.itemCouleurNoir = new JMenuItem("Noir");
		this.itemCouleurNoir.addActionListener(ecouteur);
		this.add(this.itemCouleurNoir);
		
		this.itemCouleurBlanc = new JMenuItem("Blanc");
		this.itemCouleurBlanc.addActionListener(ecouteur);
		this.add(this.itemCouleurBlanc);
		
		this.itemCouleurBleu = new JMenuItem("Bleu");
		this.itemCouleurBleu.addActionListener(ecouteur);
		this.add(this.itemCouleurBleu);
		
		this.itemCouleurJaune = new JMenuItem("Jaune");
		this.itemCouleurJaune.addActionListener(ecouteur);
		this.add(this.itemCouleurJaune);
		
		this.itemCouleurRouge = new JMenuItem("Rouge");
		this.itemCouleurRouge.addActionListener(ecouteur);
		this.add(this.itemCouleurRouge);
		
		this.itemCouleurVert = new JMenuItem("Vert");
		this.itemCouleurVert.addActionListener(ecouteur);
		this.add(this.itemCouleurVert);
		
		this.itemCouleurRose = new JMenuItem("Rose");
		this.itemCouleurRose.addActionListener(ecouteur);
		this.add(this.itemCouleurRose);
		
		this.itemCouleurOrange = new JMenuItem("Orange");
		this.itemCouleurOrange.addActionListener(ecouteur);
		this.add(this.itemCouleurOrange);
	}
	
	public MaMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public JMenuItem getItemCouleurNoir() {
		return this.itemCouleurNoir;
	}
	
	public JMenuItem getItemCouleurBlanc() {
		return this.itemCouleurBlanc;
	}
	
	public JMenuItem getItemCouleurBleu() {
		return this.itemCouleurBleu;
	}
	
	public JMenuItem getItemCouleurJaune() {
		return this.itemCouleurJaune;
	}
	
	public JMenuItem getItemCouleurRouge() {
		return this.itemCouleurRouge;
	}
	
	public JMenuItem getItemCouleurVert() {
		return this.itemCouleurVert;
	}
	
	public JMenuItem getItemCouleurRose() {
		return this.itemCouleurRose;
	}
	
	public JMenuItem getItemCouleurOrange() {
		return this.itemCouleurOrange;
	}
}
