package Java2D;

import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java2D extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Point2D start = new Point2D.Double(0, 95);
	private Point2D end = new Point2D.Double(345, 95);
	//Liste für jeden Typ Grafik
	private List<Line2D.Double> list = new ArrayList<>();
	private List<Rectangle2D.Double> list1 = new ArrayList<>();
	private List<Ellipse2D.Double> list2 = new ArrayList<>();

	
	private class FensterExit implements WindowListener{

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			System.exit(0);
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Automatisch generierter Methodenstub
			
		}

	}
	    

	
	public Java2D() {
		super("Java2D");
		setSize(325, 200);
		addWindowListener(new FensterExit());
		
		list.add(new Line2D.Double(start, end));
		list1.add(new Rectangle2D.Double(20, 47.5, 100, 100));
		list2.add(new Ellipse2D.Double(185, 47.5, 100, 100));
		
		add(new DrawingComponent());
		setVisible(true);

	}
	
	private class DrawingComponent extends JPanel { 
		
		private static final long serialVersionUID = 1L;
	
		@Override
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;
			g2d.setStroke(new BasicStroke(5));
			g2d.setColor(Color.BLUE);
			for (Line2D.Double line : list) {
				g2d.draw(line);
			 }
			for (Rectangle2D.Double rect : list1) {
				g2d.draw(rect);
			 }
			for (Ellipse2D.Double circle : list2) {
				g2d.draw(circle);
			 }
		}
	}

	public static void main(String[] args) {
		// TODO Automatisch generierter Methodenstub
		new Java2D();
	}
}


