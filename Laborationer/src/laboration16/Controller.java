package laboration16;

import java.awt.Color;

import javax.swing.JOptionPane;

public class Controller {
	private ImageViewer viewer;
	private LabelPanel labelPanel;

	public Controller(ImageViewer viewer) {
		this.viewer = viewer;
	}

	public Controller(LabelPanel labelPanel) {
		this.labelPanel = labelPanel;
	}

	public void newColor(Color color) {
		labelPanel.setColor(color);
	}

	public boolean newImage(String filename) {
		int lastDot = filename.lastIndexOf('.');
		String suffix = filename.substring(lastDot + 1);
		suffix = suffix.toLowerCase(); // alla tecken små bokstäver

		if (suffix.equals("jpg") || suffix.equals("gif")
				|| suffix.equals("png")) {
			viewer.showImage(filename);
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Felaktig filtyp: " + suffix);
			return false;
		}
	}

	public void eraseImage() {
		viewer.noImage();
	}

	public static void main(String[] args) {
		ImageViewer viewer = new ImageViewer();
		Controller cont = new Controller(viewer);
		cont.newImage("pictures/filmlogga.jpg");
		JOptionPane.showMessageDialog(null, viewer);
		// cont.newImage( "M:/bilder/karta.bmp" ); // ej tillåten filtyp //
		// cont.eraseImage();
	}
}
