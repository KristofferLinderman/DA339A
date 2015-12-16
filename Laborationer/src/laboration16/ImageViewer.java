package laboration16;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ImageViewer extends JPanel {
	private JLabel lblTitle;
	private JLabel lblImage;

	public ImageViewer() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(700, 480));

		lblTitle = new JLabel("");
		lblImage = new JLabel("");

		add(lblTitle, BorderLayout.NORTH);
		add(lblImage, BorderLayout.CENTER);
	}

	public void noImage() {
		lblImage.setIcon(null);
		lblImage.setText("NO PICTURE CHOOSEN");
		lblTitle.setText("");
	}

	public void showImage(String fileName) {
		lblImage.setText("");
		lblImage.setIcon(new ImageIcon(fileName));
		lblTitle.setText(fileName);
	}

	public static void main(String args[]) {
		ImageViewer viewer = new ImageViewer();
		// viewer.noImage();
		viewer.showImage("pictures/lugi.gif");
		JOptionPane.showMessageDialog(null, viewer);
	}
}
