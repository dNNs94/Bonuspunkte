package ImageViewer;

import java.awt.*;

import javax.swing.*;


public class ImageViewer extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	private int width, height;
	
	public ImageViewer(String data, int width, int height){
		
		this.width = width;
		this.height = height;
		load(data);
	}
	
	public void load(String data){
		Toolkit tk = getToolkit();
		img = tk.getImage(data);
	}
	public void paintComponent(Graphics g){
		g.drawImage(img,  0,  0, width,  height, this);
	}
	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		JFrame window = new JFrame("ImageViewer");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(640, 320);
		window.setLayout(new BorderLayout());
		
		ImageViewer i = new ImageViewer("src/images/norris01.jpg", 640, 320);
		window.getContentPane().add(i, BorderLayout.CENTER);
		window.setVisible(true);
	}

}
