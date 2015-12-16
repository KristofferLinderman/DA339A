package laboration24;

/**
 * Klassen Commodity representerar en vara i en butik. *
 * 
 * @version 1.0
 * @author Rolf Axelsson inte Kristoffer
 */
public class Commodity {
	private String name;
	private String category;
	private int quantity;
	private double price;

	/**
	 * Konstruerar och initialiserar en vara med name="", category="", *
	 * quantity=0 och price=0.0.
	 */
	public Commodity() {
		this.name = "";
		this.category = "";
	}

	/**
	 * Konstruerar och initialiserar en vara med angivna värden. * @param name
	 * varans namn
	 * 
	 * @param category
	 *            varans kategori
	 * @param quantity
	 *            antal varor på lagret
	 * @param price
	 *            varans pris
	 */
	public Commodity(String name, String category, int quantity, double price) {
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}

	/**
	 * Returns the name of the item
	 * 
	 * @return - item name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of the item
	 * 
	 * @param name
	 *            - the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the category
	 * 
	 * @return - category
	 */
	public String getCategory() {
		return this.category;
	}

	/**
	 * Sets the category
	 * 
	 * @param category
	 *            - category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * Returns the price of an item
	 * 
	 * @return - the price of an item
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sets the price of an item
	 * 
	 * @param price
	 *            - the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Ändrar antalet varor i lager. Ett positivt värde ökar antalet varor
	 * (inköp) * och ett negativt värde minskar antalet varor (försäljning)
	 * 
	 * @param change
	 *            förändring av antalet varor
	 * @return antal varor i lager efter förändring
	 */
	public int changeQuantity(int change) {
		quantity += change;
		return this.quantity;
	}

	/**
	 * Prints out the information about the item in
	 * "Name, category, nbr in stock, price" order
	 */
	public void info() {
		System.out.println(this.name + ", " + this.category + "\n"
				+ "Antal i lager: " + this.quantity + "\n" + "Pris: "
				+ this.price + " kr");
	}
}
