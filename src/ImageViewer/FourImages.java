package ImageViewer;

import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FourImages extends JFrame {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<BufferedImage> imagelist;
	imagelist = new LinkedList<BufferedImage>();
	private File dir = new File("src/ImageViewer/images/");
	private BufferedImage img;
	private int width, height;
	private ImageReader reader;
	private void scanDir(File dir) {
			if (!dir.isDirectory()) {
				throw new IllegalArgumentException("Not a Directory");
			} else {
				File[] dateiliste = dir.listFiles(new JPGFilter());
				for (File f : dateiliste) {
					ImageIO.add(readImage(f));
					System.out.println("Hallo");
				}
			}
	}

	public void readImage(File dir){
		
		try {
			reader = (ImageReader) ImageIO.getImageReadersByFormatName("jpg");
			ImageInputStream imageIn = ImageIO.createImageInputStream(dir);
			reader.setInput(imageIn);
			img = ImageIO.read(dir);
			imagelist.remove(img);
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
	
	class JPGFilter implements FilenameFilter{

		@Override
		public boolean accept(File dir, String name) {
			if(dir.getName().toLowerCase().endsWith("jpg")){
				return true;
			}
			return false;
		}
		
	}
	
	public FourImages(int width, int height){
		this.width = width;
		this.height = height;
		setSize(640, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		this.setLayout(new GridLayout(2,2));
		scanDir(dir);
		
	}
	
	public static void main(String[] args){
		
		new FourImages(640, 320);
		
	}
	
}
