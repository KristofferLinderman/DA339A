package laboration18;

public class Exercise18a {

	public void program() {
		Population[] countries = Populations
				.readPopulations("files/befolkning.txt");
		int counter = 0;

		// Solution to task 0
		// for (int i = 0; i < countries.length; i++) {
		// System.out.println(countries[i].getCountry() + ", "
		// + countries[i].getPopulation());
		// }

		// Solution to task 1
		// for (Population country : countries) {
		// System.out.println(country.getCountry());
		// }

		// Solution to task 2
		// for (Population country : countries) {
		// if (country.getPopulation() > 100000000) {
		// System.out.println(country.getCountry());
		// }
		// }

		// Solution to task 3
		// for (Population country : countries) {
		// if (country.getCountry().charAt(0) == 'M') {
		// System.out.println(country.getCountry());
		// }
		// }

		// Solution to task 4
		// for (Population country : countries) {
		// if (country.getPopulation() <= 10000000
		// && country.getPopulation() >= 8000000) {
		// System.out.println(country.getCountry());
		// }
		// }

		// Solution to task 5
		// for (Population country : countries) {
		// if (country.getPopulation() < 1000000) {
		// counter ++;
		// }
		// }
		// System.out.println(counter +
		// " countries have a population of lees than one million.");

		// Solution to task 6
		// for (Population country : countries) {
		// if (country.getCountry().charAt(0) == 'K') {
		// counter ++;
		// }
		// }
		// System.out.println(counter + " countries start with the letter K");

		// Solution to task 7
		// for (Population country : countries) {
		// if (country.getPopulation() <= 12000000
		// && country.getPopulation() >= 10000000) {
		// counter++;
		// }
		// }
		// Population[] bigCountries = new Population[counter];
		// int index = 0;
		//
		// for (Population country : countries) {
		// if (country.getPopulation() <= 12000000
		// && country.getPopulation() >= 10000000) {
		// bigCountries[index] = country;
		// index++;
		// }
		// }
		//
		// for (Population country : bigCountries) {
		// System.out.println(country.getCountry());
		// }
		
		//Solution to task 8
		for (Population country : countries) {
			if (country.getCountry().charAt(0) == 'K') {
				counter++;
			}
		}
		
		Population[] kCountries = new Population[counter];
		int index = 0;

		for (Population country : countries) {
			if (country.getCountry().charAt(0) == 'K') {
				kCountries[index] = country;
				index++;
			}
		}

		for (Population country : kCountries) {
			System.out.println(country.getCountry());
		}
	}

	public static void main(String[] args) {
		Exercise18a e18a = new Exercise18a();
		e18a.program();
	}
}