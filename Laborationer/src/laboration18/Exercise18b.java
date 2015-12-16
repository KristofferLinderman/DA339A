package laboration18;

public class Exercise18b {
	public void printCountries(Population[] array) {
		for (Population country : array) {
			System.out.println(country.getCountry());
		}
		System.out.println();
	}

	public void moreThanHundredMillions(Population[] array) {
		for (Population country : array) {
			if (country.getPopulation() > 100000000) {
				System.out.println(country.getCountry());
			}
		}
		System.out.println();
	}

	public void startsWithM(Population[] array) {
		for (Population country : array) {
			if (country.getCountry().charAt(0) == 'M') {
				System.out.println(country.getCountry());
			}
		}
		System.out.println();
	}

	public void eightToTenMillions(Population[] array) {
		for (Population country : array) {
			if (country.getPopulation() <= 10000000
					&& country.getPopulation() >= 8000000) {
				System.out.println(country.getCountry() + " \t" + country.getPopulation());
			}
		}
		System.out.println();
	}

	public void program() {
		Population[] countries = Populations
				.readPopulations("files/befolkning.txt");
		// Aktivera metoderna en i taget, men först när du kompletterat // med
		// kod.
		printCountries(countries);
		moreThanHundredMillions(countries);
		startsWithM(countries);
		eightToTenMillions(countries);
	}

	public static void main(String[] args) {
		Exercise18b e18b = new Exercise18b();
		e18b.program();
	}
}