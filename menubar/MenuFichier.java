package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuFichier extends JMenu {

	private MaMenuBar menuBar;
	private JMenuItem itemFichierNouveau, itemFichierOuvrir, itemFichierEnregistrer, itemFichierEnregistrerSous, itemFichierImprimer, itemFichierQuitter;
	
	public MenuFichier(MaMenuBar menuBar) {
		super("Fichier");
		
		this.menuBar = menuBar;
		
		EcouteurMenuFichier ecouteur = new EcouteurMenuFichier(this);
		
		this.itemFichierNouveau = new JMenuItem("Nouveau");
		this.itemFichierNouveau.addActionListener(ecouteur);
		this.add(this.itemFichierNouveau);
		
		this.itemFichierOuvrir = new JMenuItem("Ouvrir...");
		this.itemFichierOuvrir.addActionListener(ecouteur);
		this.add(this.itemFichierOuvrir);
		
		this.addSeparator();
		
		this.itemFichierEnregistrer = new JMenuItem("Enregistrer");
		this.itemFichierEnregistrer.addActionListener(ecouteur);
		this.add(this.itemFichierEnregistrer);
		
		this.itemFichierEnregistrerSous = new JMenuItem("Enregistrer sous...");
		this.itemFichierEnregistrerSous.addActionListener(ecouteur);
		this.add(this.itemFichierEnregistrerSous);
		
		this.addSeparator();
		
		this.itemFichierImprimer = new JMenuItem("Imprimer");
		this.itemFichierImprimer.addActionListener(ecouteur);
		this.add(this.itemFichierImprimer);
		
		this.addSeparator();
		
		this.itemFichierQuitter = new JMenuItem("Quitter");
		this.itemFichierQuitter.addActionListener(ecouteur);
		this.add(this.itemFichierQuitter);
	}
	
	public MaMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public JMenuItem getItemFichierNouveau() {
		return this.itemFichierNouveau;
	}
	
	public JMenuItem getItemFichierOuvrir() {
		return this.itemFichierOuvrir;
	}
	
	public JMenuItem getItemFichierEnregistrer() {
		return this.itemFichierEnregistrer;
	}
	
	public JMenuItem getItemFichierEnregistrerSous() {
		return this.itemFichierEnregistrerSous;
	}
	
	public JMenuItem getItemFichierImprimer() {
		return this.itemFichierImprimer;
	}
	
	public JMenuItem getItemFichierQuitter() {
		return this.itemFichierQuitter;
	}
}
