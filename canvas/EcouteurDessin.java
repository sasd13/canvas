package canvas;

import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import form.*;

public class EcouteurDessin implements MouseListener, MouseMotionListener {
	
	private Toile toile;
	private Point mousePositionOnPress;
	private int x, y;
	private int[] tabX, tabY;
	
	private ArrayList<MyCircle> listMyCircles;
	private ArrayList<MyLine> listMyLines;
	private ArrayList<MyPolygone> listMyPolygones;
	private ArrayList<MyRectangle> listMyRectangles;
	
	public EcouteurDessin(Toile toile) {
		this.toile = toile;
		
		tabX = new int[8];
		tabY = new int[8];
		
		this.listMyCircles = toile.getDessin().getListMyCircles();
		this.listMyLines = toile.getDessin().getListMyLines();
		this.listMyPolygones = toile.getDessin().getListMyPolygones();
		this.listMyRectangles = toile.getDessin().getListMyRectangles();
	}
	
	public void mousePressed(MouseEvent arg0) {
		this.mousePositionOnPress = arg0.getPoint();
		
		switch (this.toile.getFormSelected()) {
			case MyCircle:
				this.listMyCircles.add(new MyCircle(this.mousePositionOnPress, 0, 0, this.toile.getColor(), this.toile.getStroke()));
				break;
			case MyLine : 
				this.listMyLines.add(new MyLine(new Line2D.Double(this.mousePositionOnPress, this.mousePositionOnPress), this.toile.getColor(), this.toile.getStroke()));
				break;
			case MyPolygone:
				x = this.mousePositionOnPress.x;
				y = this.mousePositionOnPress.y;
				
				tabX[0] = x;
				tabX[1] = x + 10;
				tabX[2] = x + 30;
				tabX[3] = x + 40;
				tabX[4] = x + 40;
				tabX[5] = x + 30;
				tabX[6] = x + 10;
				tabX[7] = x;
				
				tabY[0] = y + 10;
				tabY[1] = y;
				tabY[2] = y;
				tabY[3] = y + 10;
				tabY[4] = y + 30;
				tabY[5] = y + 40;
				tabY[6] = y + 40;
				tabY[7] = y + 30;
				
				Polygon polygon = new Polygon(tabX, tabY, 8);
				this.listMyPolygones.add(new MyPolygone(polygon, this.toile.getColor(), this.toile.getStroke()));
				break;
			case MyRectangle:
				this.listMyRectangles.add(new MyRectangle(this.mousePositionOnPress, 0, 0, this.toile.getColor(), this.toile.getStroke()));
				break;
			default: case MyImage:
				break;
		}
		
		this.toile.repaint();
	}

	public void mouseDragged(MouseEvent arg0) {
		Point mousePositionNow = arg0.getPoint();
		
		switch (this.toile.getFormSelected()) {
			case MyCircle:
				this.listMyCircles.get(this.listMyCircles.size()-1).setWidth(mousePositionNow.x - this.mousePositionOnPress.x);
				this.listMyCircles.get(this.listMyCircles.size()-1).setHeight(mousePositionNow.y - this.mousePositionOnPress.y);
				break;
			case MyLine : 
				this.listMyLines.get(this.listMyLines.size()-1).setl2D(new Line2D.Double(this.mousePositionOnPress, mousePositionNow));
				break;
			case MyRectangle:
				this.listMyRectangles.get(this.listMyRectangles.size()-1).setWidth(mousePositionNow.x - this.mousePositionOnPress.x);
				this.listMyRectangles.get(this.listMyRectangles.size()-1).setHeight(mousePositionNow.y - this.mousePositionOnPress.y);
				break;
			default: case MyImage: case MyPolygone:
				break;
		}
		
		this.toile.repaint();
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
