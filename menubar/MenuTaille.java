package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuTaille extends JMenu {

	private MaMenuBar menuBar;
	private JMenuItem itemTaille1, itemTaille3, itemTaille6, itemTaille9, itemTaille12, itemTaille15;
	
	public MenuTaille(MaMenuBar menuBar) {
		super("Taille");
		
		this.menuBar = menuBar;
		
		EcouteurMenuTaille ecouteur = new EcouteurMenuTaille(this);
		
		this.itemTaille1 = new JMenuItem("1");
		this.itemTaille1.addActionListener(ecouteur);
		this.add(this.itemTaille1);
		
		this.itemTaille3 = new JMenuItem("3");
		this.itemTaille3.addActionListener(ecouteur);
		this.add(this.itemTaille3);
		
		this.itemTaille6 = new JMenuItem("6");
		this.itemTaille6.addActionListener(ecouteur);
		this.add(this.itemTaille6);
		
		this.itemTaille9 = new JMenuItem("9");
		this.itemTaille9.addActionListener(ecouteur);
		this.add(this.itemTaille9);
		
		this.itemTaille12 = new JMenuItem("12");
		this.itemTaille12.addActionListener(ecouteur);
		this.add(this.itemTaille12);	
		
		this.itemTaille15 = new JMenuItem("15");
		this.itemTaille15.addActionListener(ecouteur);
		this.add(this.itemTaille15);
	}
	
	public MaMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public JMenuItem getItemTaille1() {
		return this.itemTaille1;
	}
	
	public JMenuItem getItemTaille3() {
		return this.itemTaille3;
	}
	
	public JMenuItem getItemTaille6() {
		return this.itemTaille6;
	}
	
	public JMenuItem getItemTaille9() {
		return this.itemTaille9;
	}
	
	public JMenuItem getItemTaille12() {
		return this.itemTaille12;
	}
	
	public JMenuItem getItemTaille15() {
		return this.itemTaille15;
	}
}
