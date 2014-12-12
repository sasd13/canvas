package frame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import canvas.Toile;
import form.MyImage;
import frame.MaFrame;

public class MaFrameIO {

	private Toile toile;
	private BufferedImage bi;
	private Graphics2D g2D;
	private File currentFile;
	
	public MaFrameIO(MaFrame frame) {	
		this.toile = frame.getToile();
		
		this.bi = new BufferedImage(this.toile.getWidth(), this.toile.getHeight(), BufferedImage.TYPE_INT_RGB);
		this.g2D = this.bi.createGraphics();
		
		this.currentFile = (new JFileChooser()).getCurrentDirectory();
	}
	
	public void nouveau() {		
		
	}
	
	public void ouvrir() {
		JFileChooser jf = new JFileChooser((new JFileChooser()).getCurrentDirectory());
		int retour = jf.showOpenDialog(null);
		if(retour == JFileChooser.APPROVE_OPTION) {
			try {
				Image img = ImageIO.read(jf.getSelectedFile());
				MyImage myImg = new MyImage(img);
				this.currentFile = jf.getSelectedFile();
				
				this.toile.getDessin().setGraphics2D(this.g2D);
				this.toile.getDessin().getListMyImages().add(myImg);
				this.toile.repaint();
			}
			catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	
	public void enregistrer() {
		if (this.currentFile.compareTo((new JFileChooser()).getCurrentDirectory()) == 0) {
			enregistrerSous();
		}
		else {
			this.toile.getDessin().setGraphics2D(this.g2D);		
			this.toile.getDessin().dessinerToile();
			
			try {
				ImageIO.write(this.bi, "JPEG", this.currentFile);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void enregistrerSous() {
		this.toile.getDessin().setGraphics2D(this.g2D);		
		this.toile.getDessin().dessinerToile();
		
		JFileChooser jf;
		if (this.currentFile.compareTo((new JFileChooser()).getCurrentDirectory()) == 0) {
			jf = new JFileChooser(this.currentFile);
		}
		else {
			jf = new JFileChooser(this.currentFile.getParent());
		}
		
		int retour = jf.showSaveDialog(null);
		if(retour == JFileChooser.APPROVE_OPTION) {
			try {
				ImageIO.write(this.bi, "JPEG", jf.getSelectedFile());
				this.currentFile = jf.getSelectedFile();
			}
			catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
	
	public void imprimer() {
		
	}
	
	public void quitter() {
		
	}
}
