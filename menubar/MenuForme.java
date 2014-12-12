package menubar;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuForme extends JMenu {

	private MaMenuBar menuBar;
	private JMenuItem itemFormCircle, /*itemFormImage,*/ itemFormLine, itemFormPolygone, itemFormRectangle;
	
	public MenuForme(MaMenuBar menuBar) {
		super("Forme");
		
		this.menuBar = menuBar;
		
		EcouteurMenuForme ecouteur = new EcouteurMenuForme(this);
		
		this.itemFormCircle = new JMenuItem("Cercle");
		this.itemFormCircle.addActionListener(ecouteur);
		this.add(this.itemFormCircle);
		/*
		this.itemFormImage = new JMenuItem("Image");
		this.itemFormImage.addActionListener(ecouteur);
		this.add(this.itemFormImage);
		*/
		this.itemFormLine = new JMenuItem("Ligne");
		this.itemFormLine.addActionListener(ecouteur);
		this.add(this.itemFormLine);
		
		this.itemFormPolygone = new JMenuItem("Polygone");
		this.itemFormPolygone.addActionListener(ecouteur);
		this.add(this.itemFormPolygone);
		
		this.itemFormRectangle = new JMenuItem("Rectangle");
		this.itemFormRectangle.addActionListener(ecouteur);
		this.add(this.itemFormRectangle);
	}
	
	public MaMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public JMenuItem getItemFormCircle() {
		return this.itemFormCircle;
	}
	/*
	public JMenuItem getItemFormImage() {
		return this.itemFormImage;
	}
	*/
	public JMenuItem getItemFormLine() {
		return this.itemFormLine;
	}
	
	public JMenuItem getItemFormPolygone() {
		return this.itemFormPolygone;
	}
	
	public JMenuItem getItemFormRectangle() {
		return this.itemFormRectangle;
	}
}
