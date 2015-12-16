package laboration10;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JumpingCat {

	public static void main(String[] args) {
		String newPos = "";
		Scanner scan;
		int x;
		int y;

		ImageIcon image = new ImageIcon("Gubbe.jpg");
		MovingImage1 mI = new MovingImage1();
		mI.init(image, 250, 250);

		while (true) {
			newPos = JOptionPane
					.showInputDialog("Write new position, X-pos Y-pos");
			scan = new Scanner(newPos);
			x = scan.nextInt();
			y = scan.nextInt();
			
			mI.setLocation(x, y);

		}

	}
}
