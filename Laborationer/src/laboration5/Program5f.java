package laboration5;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Program5f {

	public void demo1() {
		PaintWindow window = new PaintWindow();
		ImageIcon image1 = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/1.jpg");
		ImageIcon image2 = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/2.jpg");
		ImageIcon image3 = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/3.png");
		ImageIcon image4 = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/4.jpg");
		ImageIcon image5 = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/5.jpg");
		ImageIcon image6 = new ImageIcon(
				"/Users/Kristoffer/Documents/Programering/Prog. Fördjupning/DA339ALaborationer/src/laboration5/6.jpg");

		window.showImage(image1, 0, 0);
		window.showImage(image2, 200, 0);
		window.showImage(image5, 400, 0);
		window.showImage(image3, 0, 200);
		window.showImage(image4, 200, 200);
		window.showImage(image6, 400, 200);
	}

	public static void main(String[] args) {
		Program5f prog = new Program5f();
		prog.demo1();
	}
}
