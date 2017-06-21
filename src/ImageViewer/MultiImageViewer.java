package ImageViewer;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
//import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiImageViewer extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width, height;
	//private BufferedImage img = null;
	private BufferedImage img;
	private BufferedImage img2;
	private BufferedImage img3;
	private BufferedImage img4;
	
	private ImageReader reader;
	private ImageReader reader2;
	private ImageReader reader3;
	private ImageReader reader4;
	//private Iterator<ImageReader> iter = ImageIO.getImageReadersByFormatName("jpg");
	private File dir = new File("src/ImageViewer/images/norris01.jpg");
	private File dir2 = new File("src/ImageViewer/images/norris02.jpg");
	private File dir3 = new File("src/ImageViewer/images/norris03.jpg");
	private File dir4 = new File("src/ImageViewer/images/norris04.jpg");
	
	private List<BufferedImage> list = new ArrayList<>();
	
	public MultiImageViewer(int width, int height){
		super("Multi Image Viewer");
		this.width = width;
		this.height = height;
		setSize(640, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		this.setLayout(new GridLayout(2,2));
		this.add(new DrawingComponent());
		setVisible(true);
	}
	
	private class DrawingComponent extends JPanel { 
		
		private static final long serialVersionUID = 1L;
		
		@Override
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;

			
			load(dir);
			this.setLayout(new GridLayout(2,2));
			super.paintComponent(g2d);
			g2d.drawImage(img, 0, 0, width, height, this);
			g2d.drawImage(img2, 0, 0, width, height, this);
			g2d.drawImage(img3, 0, 0, width, height, this);
			g2d.drawImage(img4, 0, 0, width, height, this);
				
		}
	}
	
/*	private class ImageComponent extends JComponent{
		
		private static final long serialVersionUID = 1L;
		public ImageComponent(){
			load(dir);	
		}
	} */
	
	public void load(File dir){
			//reader = (ImageReader) ImageIO.getImageReadersByFormatName("jpg");
			//reader2 = (ImageReader) ImageIO.getImageReadersByFormatName("jpg");
			//reader3 = (ImageReader) ImageIO.getImageReadersByFormatName("jpg");
			//reader4 = (ImageReader) ImageIO.getImageReadersByFormatName("jpg");

			
			try {
				//ImageInputStream imageIn = ImageIO.createImageInputStream(dir);
				//ImageInputStream imageIn2 = ImageIO.createImageInputStream(dir2);
				//ImageInputStream imageIn3 = ImageIO.createImageInputStream(dir3);
				//ImageInputStream imageIn4 = ImageIO.createImageInputStream(dir4);
				//reader.setInput(imageIn);
				//reader2.setInput(imageIn2);
				//reader3.setInput(imageIn3);
				//reader4.setInput(imageIn4);
				
				img = ImageIO.read(ImageIO.createImageInputStream(dir));
				img2 = ImageIO.read(ImageIO.createImageInputStream(dir2));
				img3 = ImageIO.read(ImageIO.createImageInputStream(dir3));
				img4 = ImageIO.read(ImageIO.createImageInputStream(dir4));
					
				list.add(img);
				list.add(img2);
				list.add(img3);
				list.add(img4);
					
					
				
			} catch (IOException e) {
				// TODO Automatisch generierter Erfassungsblock
				e.printStackTrace();
		}
	}
	
	
	/*public void paintComponent(Graphics g){
		super.paint(g);
		for(BufferedImage img : list){
			
		g.drawImage(img, 0, 0, width, height, this);
		
		}
	}*/
	
	public static void main(String[] args){
		// PROBLEM: WIE ALLE IMAGES AUF FRAME DARSTELLEN???
		new MultiImageViewer(640, 320);
	}

		
	
}