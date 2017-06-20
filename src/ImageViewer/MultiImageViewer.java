package ImageViewer;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiImageViewer extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width, height;
	private BufferedImage img = null;
	private ImageReader reader;
	private Iterator<ImageReader> iter = ImageIO.getImageReadersBySuffix("jpg");
	private File dir = new File("src/ImageViewer/images/norris01.jpg");
	private List<BufferedImage> list = new ArrayList<>();
	
	public MultiImageViewer(int width, int height){
		super("Multi Image Viewer");
		this.width = width;
		this.height = height;
		setSize(640, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new GridLayout(2,2));
		ImageComponent comp = new ImageComponent();
		setVisible(true);
		add(comp);
		add(comp);
		add(comp);
		add(comp);
		setVisible(true);
		
	}
	
	private class ImageComponent extends JComponent{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ImageComponent(){
			load(dir);	
		}
	}
	
	public void load(File dir){
		if(dir.isDirectory()){
			reader = iter.next();
			try {
				ImageInputStream imageIn = ImageIO.createImageInputStream(dir);
				reader.setInput(imageIn);
				while(iter.hasNext()){
					img = ImageIO.read(imageIn);
					list.add(img);
				}
			} catch (IOException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
			}
		}
	}
	
	public void sort(){
		//WIE UND WO LAYOUT GESTALTEN???
		this.getContentPane().setLayout(new GridLayout(2,2));
		
	}
	
	public void paintComponent(Graphics g){
		super.paint(g);
		for(BufferedImage img : list){
			
		g.drawImage(img, 0, 0, width, height, this);
		
		}
	}
	
	public static void main(String[] args){
		// PROBLEM: WIE ALLE IMAGES AUF FRAME DARSTELLEN???
		new MultiImageViewer(640, 320);
	}

		
	
}