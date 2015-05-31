package form;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;

public class MyPolygone extends Form {

	private Polygon polygon;
	
	public MyPolygone(Polygon polygon, Color color, BasicStroke stroke) {
		super(color, stroke);
		
		this.polygon = polygon;
	}
	
	public Polygon getPolygon() {
		return this.polygon;
	}
	
	public void setPolygone(Polygon polygon) {
		this.polygon = polygon;
	}
}
