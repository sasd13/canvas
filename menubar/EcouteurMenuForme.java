package menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import canvas.Toile;
import form.FormSelect;

public class EcouteurMenuForme implements ActionListener{

	private MenuForme menuForme;
	private Toile toile;
	
	public EcouteurMenuForme(MenuForme menuForme) {
		this.menuForme = menuForme;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.toile = this.menuForme.getMaMenuBar().getMaFrame().getToile();
		
		if (((JMenuItem) e.getSource()).getText().compareTo(this.menuForme.getItemFormCircle().getText()) == 0) {
			this.toile.setFormSelected(FormSelect.MyCircle);
		}
		/*
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuForme.getItemFormImage().getText()) == 0) {
			this.toile.setFormSelected(FormSelect.MyImage);
		}
		*/
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuForme.getItemFormLine().getText()) == 0) {
			this.toile.setFormSelected(FormSelect.MyLine);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuForme.getItemFormPolygone().getText()) == 0) {
			this.toile.setFormSelected(FormSelect.MyPolygone);
		}
		else if (((JMenuItem) e.getSource()).getText().compareTo(this.menuForme.getItemFormRectangle().getText()) == 0) {
			this.toile.setFormSelected(FormSelect.MyRectangle);
		}
		else {
			System.out.println("Erreur ecouteur forme");
		}
	}	
}
