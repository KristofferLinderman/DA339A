package laboration18;

import java.util.*;

public class Exercise18f {
	public void program() {
		Population[] countries = Populations
				.readPopulations("files/befolkning.txt");
		Arrays.sort(countries, new AlphabeticalOrder());
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i].toString());
		}
	}

	public static void main(String[] args) {
		Exercise18f e18e = new Exercise18f();
		e18e.program();
	}
}