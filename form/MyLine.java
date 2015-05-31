package form;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Line2D;

public class MyLine extends Form {
	
	private Line2D l2D;
	
	public MyLine(Line2D l2D, Color color, BasicStroke stroke) {
		super(color, stroke);
		
		this.l2D = l2D;
	}
	
	public Line2D getl2D() {
		return this.l2D;
	}
	
	public void setl2D(Line2D l2D) {
		this.l2D = l2D;
	}
}
