package canvas;

import javax.swing.*;

import form.FormSelect;
import frame.MaFrame;

import java.awt.*;

@SuppressWarnings("serial")
public class Toile extends JPanel {
	
	private Dessin dessin;
	private FormSelect formSelected;
	private Color color;
	private BasicStroke stroke;
	
	public Toile(MaFrame frame, Dimension dim) {
		if (dim.getWidth() < 50 && dim.getHeight() < 50) {
			this.setPreferredSize(new Dimension(300, 300));
		}
		else this.setPreferredSize(dim);
		this.setBackground(Color.WHITE);
		
		this.dessin = new Dessin(this);
		
		this.formSelected = FormSelect.MyLine;
		
		this.color = Color.RED;
		this.stroke = new BasicStroke(3);
		
		EcouteurDessin ecouteur = new EcouteurDessin(this);
		this.addMouseListener(ecouteur);
		this.addMouseMotionListener(ecouteur);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2D = (Graphics2D) g;
		this.dessin.setGraphics2D(g2D);		
		this.dessin.dessinerToile();
	}
	
	public int getWidth() {
		return this.getPreferredSize().width;
	}
	
	public int getHeight() {
		return this.getPreferredSize().height;
	}
	
	public Dessin getDessin() {
		return this.dessin;
	}
	
	public FormSelect getFormSelected() {
		return this.formSelected;
	}
	
	public void setFormSelected(FormSelect formSelect) {
		this.formSelected = formSelect;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public BasicStroke getStroke() {
		return this.stroke;
	}
	
	public void setStroke(BasicStroke stroke) {
		this.stroke = stroke;
	}
}
