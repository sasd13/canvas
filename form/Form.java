package form;

import java.awt.BasicStroke;
import java.awt.Color;

public abstract class Form {

	private Color color;
	private BasicStroke stroke;
	
	public Form(Color color, BasicStroke stroke) {
		this.color = color;
		this.stroke = stroke;
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
