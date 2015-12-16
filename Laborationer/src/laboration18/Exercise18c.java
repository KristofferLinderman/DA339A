package laboration18;

public class Exercise18c {
	private int counter;

	public int lessThanOneMillion(Population[] array) {
		counter = 0;
		for (Population country : array) {
			if (country.getPopulation() < 1000000) {
				counter++;
			}
		}
		return counter;
	}

	public int startsWithK(Population[] array) {
		counter = 0;
		for (Population country : array) {
			if (country.getCountry().charAt(0) == 'K') {
				counter++;
			}
		}
		return counter;
	}

	public Population[] getTenToTwelveMillions(Population[] array) {
		counter = 0;
		for (Population country : array) {
			if (country.getPopulation() <= 12000000
					&& country.getPopulation() >= 10000000) {
				counter++;
			}
		}
		Population[] bigCountries = new Population[counter];
		int index = 0;

		for (Population country : array) {
			if (country.getPopulation() <= 12000000
					&& country.getPopulation() >= 10000000) {
				bigCountries[index] = country;
				index++;
			}
		}
		return bigCountries;
	}

	public Population[] getStartsWithK(Population[] array) {
		counter = 0;
		for (Population country : array) {
			if (country.getCountry().charAt(0) == 'K') {
				counter++;
			}
		}

		Population[] kCountries = new Population[counter];
		int index = 0;

		for (Population country : array) {
			if (country.getCountry().charAt(0) == 'K') {
				kCountries[index] = country;
				index++;
			}
		}
		return kCountries;
	}

	public void program() {
		Population[] countries = Populations
				.readPopulations("files/befolkning.txt");
		Population[] res;
		// Aktivera testerna en i taget, men först när du kompletterat //
		// metoderna med kod.
		// test lessThanOneMillion
		int n = lessThanOneMillion(countries);
		System.out.println(n + " länder har mindre än 1 miljon invånare");

		// startsWithK
		n = startsWithK(countries);
		System.out.println(n + " länder börjar på bokstaven 'K'");

		// test getTenToTwelveMillions
		res = getTenToTwelveMillions(countries);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i].toString());
		}

		// test getStartsWithK
		res = getStartsWithK(countries);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i].toString());
		}
	}

	public static void main(String[] args) {
		Exercise18c e18c = new Exercise18c();
		e18c.program();
	}
}