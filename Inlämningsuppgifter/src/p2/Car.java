package p2;

import javax.swing.ImageIcon;

public class Car {

	private ImageIcon image;
	private int x;
	private int y;

	public Car(ImageIcon imageIcon) {
		this.image = imageIcon;
	}

	/**
	 * 
	 * @return image of the car.
	 */
	public ImageIcon getImage() {
		return image;
	}

	/**
	 * 
	 * @return Car's position on X-axis
	 */
	public int getX() {
		return x;
	}

	/**
	 * 
	 * @return Car's position on X-axis
	 */
	public int getY() {
		return y;
	}

	/**
	 * Move car to new position
	 * 
	 * @param newX
	 *            - new position on X-axis
	 * @param newY
	 *            - new position on Y-axis
	 */
	public void moveTo(int newX, int newY) {
		x = newX;
		y = newY;
	}

}
