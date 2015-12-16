package laboration15;

import javax.swing.JFrame;

public class FCConverter {
	public void start() {
		JFrame frame = new JFrame("Degree converter");
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.add(new FCConverterPanel());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FCConverter app = new FCConverter();
		app.start();
	}
}