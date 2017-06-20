package ImageViewer;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultiImageViewer extends JFrame{
	
	private int width, height;
	private static BufferedImage img = null;
	private ImageReader reader;
	private Iterator<ImageReader> iter = ImageIO.getImageReadersBySuffix("jpg");
	private File dir = new File("src/ImageViewer/images/");
	private ImageIcon ii = new ImageIcon();
	private static JPanel panel;
	
	public MultiImageViewer(int width, int height){
		
		this.width = width;
		this.height = height;
		load(dir);
	}
	
	public void load(File dir){
		if(dir.isDirectory()){
			reader = iter.next();
			try {
				ImageInputStream imageIn = ImageIO.createImageInputStream(dir);
				reader.setInput(imageIn);
				while(iter.hasNext()){
					img = ImageIO.read(imageIn);
					// WAS MUSS NOCH HIER REIN???
					iter.next();
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
		g.drawImage(img, 0, 0, width, height, this);
	}
	
	public static void main(String[] args){
		// PROBLEM: WIE ALLE IMAGES AUF FRAME DARSTELLEN???
		JFrame window = new JFrame("ImageViewer");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 320);
		new MultiImageViewer(640, 320);
		window.setVisible(true);
		window.setResizable(false);
	}

		
	
}