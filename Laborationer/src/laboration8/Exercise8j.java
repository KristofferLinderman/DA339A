package laboration8;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import laboration5.PaintWindow;

public class Exercise8j {
	public static void main(String[] args) {
		Exercise8j e8i = new Exercise8j();
		e8i.letsMakeArt();
	}

	public void letsMakeArt() {
		PaintWindow window = new PaintWindow();
		Random rand = new Random();
		int x1, x2, y1, y2;
		int red, green, blue;
		int lineWidth;

		boolean satisfied = false;

		do {
			for (int i = 0; i < 20; i++) {
				x1 = rand.nextInt(500);
				x2 = rand.nextInt(500);
				y1 = rand.nextInt(500);
				y2 = rand.nextInt(500);

				red = rand.nextInt(256);
				green = rand.nextInt(256);
				blue = rand.nextInt(256);

				lineWidth = rand.nextInt(17) + 4;
				window.line(x1, y1, x2, y2, new Color(red, green, blue),
						lineWidth);
			}
			
			satisfied = JOptionPane
					.showConfirmDialog(null, "Are you satisfied?", "Query",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;
		} while (!satisfied);
	}
}
