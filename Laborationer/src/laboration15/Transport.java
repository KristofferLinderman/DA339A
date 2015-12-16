package laboration15;

import javax.swing.JFrame;

public class Transport {
	public void start() {
		JFrame frame = new JFrame("Transport");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new TransportPanel());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Transport app = new Transport();
		app.start();
	}
}