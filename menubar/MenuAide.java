package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuAide extends JMenu {

	private MaMenuBar menuBar;
	private JMenuItem itemAideManuel, itemAideTutoriel;
	
	public MenuAide(MaMenuBar menuBar) {
		super("Aide");
		
		this.menuBar = menuBar;
		
		this.itemAideManuel = new JMenuItem("Manuel");
		this.add(this.itemAideManuel);
		
		this.itemAideTutoriel = new JMenuItem("Tutoriel");
		this.add(this.itemAideTutoriel);
	}
	
	public MaMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public JMenuItem getItemAideManuel() {
		return this.itemAideManuel;
	}
	
	public JMenuItem getItemAideTutoriel() {
		return this.itemAideTutoriel;
	}
}
