package laboration8;

import javax.swing.ImageIcon;
import laboration5.PaintWindow;

/**
 * Flytta bild i ett PaintWindow-fönster
 * 
 * @author tsroax
 */
public class Exercise8e {

	public void leftRight() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/2.jpg");
		for (int x = 0; x <= 500; x += 1) {
			window.showImage(man, x, 50);
			PaintWindow.pause(10);
		}
	}

	public void rightLeft() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/2.jpg");
		for (int x = 500; x > 0; x -= 1) {
			window.showImage(man, x, 50);
			PaintWindow.pause(10);
		}
	}

	public void upDown() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/2.jpg");
		for (int y = 0; y <= 500; y += 5) {
			window.showImage(man, 200, y);
			PaintWindow.pause(10);
		}
	}

	public void downUp() {
		PaintWindow window = new PaintWindow();
		ImageIcon man = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/2.jpg");
		for (int y = 500; y > 0; y -= 5) {
			window.showImage(man, 200, y);
			PaintWindow.pause(10);
		}
	}

	public static void main(String[] args) {
		Exercise8e e8e = new Exercise8e();
		 e8e.leftRight();
		 e8e.rightLeft();
		 e8e.upDown();
		e8e.downUp();
	}
}
