package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuEdition extends JMenu {

	private MaMenuBar menuBar;
	private JMenuItem itemEditionAnnuler, itemEditionRetablir, itemEditionCouper, itemEditionCopier, itemEditionColler;
	
	public MenuEdition(MaMenuBar menuBar) {
		super("Edition");
		
		this.menuBar = menuBar;
		
		EcouteurMenuEdition ecouteur = new EcouteurMenuEdition(this);
		
		this.itemEditionAnnuler = new JMenuItem("Annuler");
		this.itemEditionAnnuler.addActionListener(ecouteur);
		this.add(this.itemEditionAnnuler);
		
		this.itemEditionRetablir = new JMenuItem("Retablir");
		this.itemEditionRetablir.addActionListener(ecouteur);
		this.add(this.itemEditionRetablir);
		
		this.addSeparator();
		
		this.itemEditionCouper = new JMenuItem("Couper");
		this.itemEditionCouper.addActionListener(ecouteur);
		this.add(this.itemEditionCouper);
		
		this.itemEditionCopier = new JMenuItem("Copier");
		this.itemEditionCopier.addActionListener(ecouteur);
		this.add(this.itemEditionCopier);
		
		this.itemEditionColler = new JMenuItem("Coller");
		this.itemEditionColler.addActionListener(ecouteur);
		this.add(this.itemEditionColler);
	}
	
	public MaMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public JMenuItem getItemEditionAnnuler() {
		return this.itemEditionAnnuler;
	}
	
	public JMenuItem getItemEditionRetablir() {
		return this.itemEditionRetablir;
	}
	
	public JMenuItem getItemEditionCouper() {
		return this.itemEditionCouper;
	}
	
	public JMenuItem getItemEditionCopier() {
		return this.itemEditionCopier;
	}
	
	public JMenuItem getItemEditionColler() {
		return this.itemEditionColler;
	}
}
