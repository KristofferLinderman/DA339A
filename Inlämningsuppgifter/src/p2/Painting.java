package p2;

public class Painting {
	private String title;
	private String painter;
	private int year;

	/**
	 * Creates a new painting object
	 * 
	 * @param title - title of the painting
	 * @param painter - painter of the painting
	 * @param year - year when the painting was painted
	 */
	public Painting(String title, String painter, int year) {
		this.title = title;
		this.painter = painter;
		this.year = year;
	}

	/**
	 * 
	 * @return title of the painting
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @return painter of the painting
	 */
	public String getPainter() {
		return painter;
	}

	/**
	 * 
	 * @return year when the painting was painted
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return info from object in 'title of painter, year' format
	 */
	public String toString() {
		return title + " av " + painter + ", " + year;
	}

}
