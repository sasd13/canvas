package frame;

import java.awt.*;

import javax.swing.*;

import canvas.Toile;
import menubar.MaMenuBar;

@SuppressWarnings("serial")
public class MaFrame extends JFrame {

	private JMenuBar menuBar; 
	private Toile toile;
	private MaFrameIO frameIO;
	
	public MaFrame(String name) {
		super(name);
		
		this.menuBar = new MaMenuBar(this);
		this.setJMenuBar(menuBar);	
		
		this.toile = new Toile(this, new Dimension(600, 600));
		this.add(this.toile, BorderLayout.CENTER);
		
		this.frameIO = new MaFrameIO(this);	
	}
	
	public JMenuBar getMaMenuBar() {
		return this.menuBar;
	}
	
	public Toile getToile() {
		return this.toile;
	}
	
	public MaFrameIO getMaFrameIO() {
		return this.frameIO;
	}
}
