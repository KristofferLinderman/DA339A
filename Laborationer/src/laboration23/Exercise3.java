package laboration23;

import java.awt.*;
import java.awt.geom.*; // Behövs vid anrop till draw/fill

import javax.swing.*; // Behövs om du ska använda bilder

import java.awt.image.*;// Behövs om du ska använda bilder
import java.util.Random;

public class Exercise3 implements Icon {

	private Graphics2D g2;
	private int x,y;

	public void paintIcon(Component c, Graphics g, int x, int y) {
		g2 = (Graphics2D) g;
		this.x=x;
		this.y=y;
		// g2.fillRect(150, 100, 50, 50);
		// g2.fillRect(350, 100, 50, 50);
		// g2.fillRect(250, 250, 25, 25);
		// g2.drawArc(100, 400, 300, 300, 45, 30);

		// randomArt();
		gradient();
	}

	private void randomArt() {
		Random rand = new Random();

		for (int i = 0; i < 20; i++) {
			g2.setPaint(new Color(rand.nextInt(256), rand.nextInt(256), rand
					.nextInt(256)));
			g2.setStroke(new BasicStroke(rand.nextInt(20) + 10));
			g2.draw(new Line2D.Double(rand.nextInt(getIconWidth()), rand
					.nextInt(getIconHeight()), rand.nextInt(getIconWidth()),
					rand.nextInt(getIconHeight())));
		}
	}

	private void gradient() {
		Paint paint = new GradientPaint(25, 25, Color.CYAN, 275, 275,
				Color.MAGENTA, true);
		g2.setPaint(paint);
		g2.fill(new Rectangle2D.Double(0, 0, 275, 275));
		
		Paint paint1 = new GradientPaint(300, 25, Color.MAGENTA, 575, 275,
				Color.CYAN, true);
		g2.setPaint(paint);
		g2.fill(new Rectangle2D.Double(0, 0, 275, 275));
		
		Paint paint2 = new GradientPaint(25, 325, Color.MAGENTA, 25, 575,
				Color.CYAN, true);
		g2.setPaint(paint);
		g2.fill(new Rectangle2D.Double(0, 0, 275, 275));
		
		Paint paint3 = new GradientPaint(325, 325, Color.CYAN, 575, 575,
				Color.MAGENTA, true);
		g2.setPaint(paint);
		g2.fill(new Rectangle2D.Double(25, 25, 275, 275));
//		g2.fill(new Rectangle2D.Double(300, 25, 575, 275));
//		g2.fill(new Rectangle2D.Double(25, 325, 35, 575));
		g2.fill(new Rectangle2D.Double(325, 325, 575, 575));
	}

	public int getIconWidth() {
		return 600; // Ersätt AAA med bildens bredd
	}

	public int getIconHeight() {
		return 600; // Ersätt AAA med bildens höjd
	}

	public static void main(String[] args) {
		IconWindow.showIcon(new Exercise3());
	}
}