package laboration3;

public class Program3h {

	public void country() {
		System.out.println("Land: Sverige");
	}

	public void residents() {
		System.out.println("Ca 9 miljoner invånare");
	}

	public void bigCities() {
		System.out.println("Tre stora städer:");
		System.out.println("Stockholm");
		System.out.println("Göteborg");
		System.out.println("Malmö");
	}

	public static void main(String[] args) {
		Program3h prog = new Program3h();

		prog.message();
	}

	/**
	 * Prints out basic info about Sweden.
	 */
	private void message() {
		System.out.println("Land: Sverige");
		System.out.println("Ca 9 miljoner invånare");
		System.out.println("Tre stora städer:");
		System.out.println("Stockholm");
		System.out.println("Göteborg");
		System.out.println("Malmö");
		
	}
}
