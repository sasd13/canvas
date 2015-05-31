package form;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;

public class MyCircle extends Form {

	private Point p;
	private int width, height;
	
	public MyCircle(Point p, int width, int height, Color color, BasicStroke stroke) {
		super(color, stroke);
		
		this.p = p;
		this.width = width;
		this.height = height;
	}
	
	public Point getPoint() {
		return this.p;
	}
	
	public void setPoint(Point p) {
		this.p = p;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
