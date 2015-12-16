package p1;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise1 {

	/**
	 * Metoden beräknar totala biljettpriset och det genomsnittliga
	 * biljettpriset för ett antal vuxna, barn och pensionärer.
	 */
	public void exercise1a() {
		// Asks for number of adults, children and elderly to calc. cost
		int adult = Integer.parseInt(JOptionPane
				.showInputDialog("Antalet vuxna"));
		int children = Integer.parseInt(JOptionPane
				.showInputDialog("Antalet barn"));
		int elderly = Integer.parseInt(JOptionPane
				.showInputDialog("Antalet  pensionärer"));

		// Calculates total price according to current price list
		int price = adult * 110 + children * 60 + elderly * 80;
		// Calculates average price per attending
		int avg = price / (adult + children + elderly);

		JOptionPane.showMessageDialog(null, "Totala priset är: " + price
				+ " kr\nGenomsnittspriset är: " + avg + " kr");

	}

	/**
	 * Writes the odd numbers between 0-100
	 */
	public void exercise1b() {

		for (int i = 0; i <= 100; i++) {
			// If the modulus isn't 0 the number is an odd number
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

	}
	

	/**
	 * Informs if the number is positive, negative or equals zero.
	 */
	public void exercise1c() {
		int nbr;

		// A loop that runs four times and asks for a number and replies with
		// negative,positive or zero depending of input.
		
		for (int i = 0; i < 4; i++) {
			nbr = Integer.parseInt(JOptionPane
					.showInputDialog("Mata in ett tal"));
			if (nbr < 0) {
				System.out.println("Talet: " + nbr + " är negativt");
			} else if (nbr > 0) {
				System.out.println("Talet: " + nbr + " är positiv");
			} else {
				System.out.println("Talet: " + nbr + " är 0");
			}
		}
	}

	/**
	 * Writes out numbers, with an interval of 7, between values declared by the
	 * user.
	 */
	public void exercise1d() {
		// Declares and initiates values by asking user for input.
		int min = Integer.parseInt(JOptionPane
				.showInputDialog("Ange minsta värdet."));
		int max = Integer.parseInt(JOptionPane
				.showInputDialog("Ange största värdet."));

		// For loop between user declared min and max with a 7 value increment
		for (int i = min; i <= max; i += 7) {
			// if i < max-6 then it is NOT the last number and should have a ','
			// after the number
			if (i < max - 6) {
				System.out.print(i + ", ");
			} else {
				System.out.println(i);
			}
		}
	}

	/**
	 * Creates a PaintWindow with a picture bouncing left to right within the
	 * window.
	 */
	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/Inlämningsuppgifter/src/p1/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		// deltaX and deltaY
		int dx = -3;
		int dy = 0;
		// Start position in for the image
		int x = 250;
		int y = rand.nextInt(height - 100); // Bildens höjd är 100

		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret
		// stängs
		while (true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(5); // pausa exekveringen i 20 ms innan nästa
									// förflyttning
			x += dx;
			y += dy;

			// Checks if x-pos is out of the bounds of the window
			// Using width - 100 takes the size of the image in consideration
			if (x < 0) {
				dx = -dx;
			} else if (x > width - 100) {
				dx = -dx;
			}
		}
	}

	/**
	 * Creates a PaintWindow with a picture bouncing randomly around within the
	 * window.
	 */
	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/Inlämningsuppgifter/src/p1/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();

		// Delta X and Y are given a random number between -3(inclusive) and 3
		// (inclusive)
		int dx = rand.nextInt(7) - 3;
		int dy = rand.nextInt(7) - 3;

		// Start position is randomly generated within the window
		int x = rand.nextInt(width - 100);
		int y = rand.nextInt(height - 100); // Bildens höjd är 100

		// oändlig loop, raderna 36-42 upprepas tills PaintWindow-fönstret
		// stängs
		while (true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa
									// förflyttning
			x += dx;
			y += dy;

			// Checks if x-pos is out of the bounds of the window
			// Using width - 100 takes the size of the image in consideration
			if (x < 0) {
				dx = -dx;
			} else if (x > width - 100) {
				dx = -dx;
			}

			// Checks if y-pos is out of the bounds of the window
			// Using height - 100 takes the size of the image in consideration
			if (y < 0) {
				dy = -dy;
			} else if (y > height - 100) {
				dy = -dy;
			}
		}
	}
}
