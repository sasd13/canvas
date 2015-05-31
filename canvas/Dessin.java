package canvas;

import java.awt.Graphics2D;
import java.util.ArrayList;

import form.*;

public class Dessin {

	private Toile toile;
	private Graphics2D g2D;
	
	private ArrayList<MyCircle> listMyCircles;
	private ArrayList<MyImage> listMyImages;
	private ArrayList<MyLine> listMyLines;
	private ArrayList<MyPolygone> listMyPolygones;
	private ArrayList<MyRectangle> listMyRectangles;
	
	public Dessin(Toile toile) {
		this.toile = toile;
		this.g2D = null;
		
		this.resetListsForms();
	}
	
	public void setGraphics2D(Graphics2D g2D) {
		this.g2D = g2D;
	}
	
	public void resetListsForms() {
		this.listMyCircles = new ArrayList<MyCircle>();
		this.listMyImages = new ArrayList<MyImage>();
		this.listMyLines = new ArrayList<MyLine>();
		this.listMyPolygones = new ArrayList<MyPolygone>();
		this.listMyRectangles = new ArrayList<MyRectangle>();
	}
	
	public void dessinerToile() {
		if (!this.getListMyCircles().isEmpty()) this.dessinerCircles();
		if (!this.getListMyImages().isEmpty()) this.dessinerImages();
		if (!this.getListMyLines().isEmpty()) this.dessinerLines();
		if (!this.getListMyPolygones().isEmpty()) this.dessinerPolygones();
		if (!this.getListMyRectangles().isEmpty()) this.dessinerRectangles();
	}
	
	private void dessinerCircles() {
		MyCircle myC2D;
		
		for(int i=0; i<this.listMyCircles.size(); i++) {
			myC2D = this.listMyCircles.get(i);
			this.g2D.setColor(myC2D.getColor());
			this.g2D.setStroke(myC2D.getStroke());
			this.g2D.drawOval(myC2D.getPoint().x, myC2D.getPoint().y, myC2D.getWidth(), myC2D.getHeight());
		}
	}
	
	private void dessinerImages() {
		MyImage myImg;
		
		for(int i=0; i<this.listMyImages.size(); i++) {
			myImg = this.listMyImages.get(i);
			this.g2D.drawImage(myImg.getImage(), 0, 0, this.toile);
		}
	}
	
	private void dessinerLines() {
		MyLine myL2D;
		
		for(int i=0; i<this.listMyLines.size(); i++) {
			myL2D = this.listMyLines.get(i);
			this.g2D.setColor(myL2D.getColor());
			this.g2D.setStroke(myL2D.getStroke());
			this.g2D.draw(myL2D.getl2D());
		}
	}
	
	private void dessinerPolygones() {
		MyPolygone myP2D;
		
		for(int i=0; i<this.listMyPolygones.size(); i++) {
			myP2D = this.listMyPolygones.get(i);
			this.g2D.setColor(myP2D.getColor());
			this.g2D.setStroke(myP2D.getStroke());
			this.g2D.drawPolygon(myP2D.getPolygon());
		}
	}
	
	private void dessinerRectangles() {
		MyRectangle myR2D;
		
		for(int i=0; i<this.listMyRectangles.size(); i++) {
			myR2D = this.listMyRectangles.get(i);
			this.g2D.setColor(myR2D.getColor());
			this.g2D.setStroke(myR2D.getStroke());
			this.g2D.drawRect(myR2D.getPoint().x, myR2D.getPoint().y, myR2D.getWidth(), myR2D.getHeight());
		}
	}
	
	public ArrayList<MyCircle> getListMyCircles() {
		return this.listMyCircles;
	}
	
	public void setListMyCircles(ArrayList<MyCircle> listMyCircles) {
		this.listMyCircles = listMyCircles;
	}
	
	public ArrayList<MyImage> getListMyImages() {
		return this.listMyImages;
	}
	
	public void setListMyImages(ArrayList<MyImage> listMyImages) {
		this.listMyImages = listMyImages;
	}
	
	public ArrayList<MyLine> getListMyLines() {
		return this.listMyLines;
	}
	
	public void setListMyLines(ArrayList<MyLine> listMyLines) {
		this.listMyLines = listMyLines;
	}
	
	public ArrayList<MyPolygone> getListMyPolygones() {
		return this.listMyPolygones;
	}
	
	public void setListMyPolygones(ArrayList<MyPolygone> listMyPolygones) {
		this.listMyPolygones = listMyPolygones;
	}
	
	public ArrayList<MyRectangle> getListMyRectangles() {
		return this.listMyRectangles;
	}
	
	public void setListMyRectangles(ArrayList<MyRectangle> listMyRectangles) {
		this.listMyRectangles = listMyRectangles;
	}
}
