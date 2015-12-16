package laboration10;

import javax.swing.ImageIcon;

public class MovingImage2 {
	private ImageIcon image;
	private int x;
	private int y;
	private PaintWindow window; // Initiering av
								// instansvariabel

	/**
	 * Metoden för över parametrarnas värde i motsvarande instansvariabler. *
	 * Sedan anropas metoden show så att bilden visar sig i fönstret.
	 */
	public void init(ImageIcon image, int x, int y, PaintWindow window) {
		this.image = image;
		this.x = x;
		this.y = y;
		this.window = window;
		show();
	}

	/**
	 * Metoden för över parametrarnas värde i motsvarande instansvariabler. *
	 * Sedan anropas metoden show så att bilden visar sig i fönstret.
	 */
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
		show();
	}

	/**
	 * Metoden ser till att bilden blir synlig
	 */
	public void show() {
		window.showImage(image, x, y);
	}

	/**
	 * Metoden ser till att bilden ej syns längre
	 */
	public void hide() {
		window.hideImage(image);
	}
}