package laboration15;

import javax.swing.JFrame;

public class Color {
	public void start() {
		JFrame frame = new JFrame("Color picker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ColorPanel());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Color app = new Color();
		app.start();
	}
}