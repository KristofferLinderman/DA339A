package laboration16;

import javax.swing.JFrame;

public class ManyColors {
	public void start() {
		JFrame frame = new JFrame("Color picker");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ColorPanel());
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(50, 100);
	}

	public static void main(String[] args) {
		ManyColors app = new ManyColors();
		app.start();
	}
}