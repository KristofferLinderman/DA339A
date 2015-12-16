package laboration18;

import java.util.*;

public class Exercise18e {
	public void program() {
		Population[] countries = Populations
				.readPopulations("files/befolkning.txt");
		Arrays.sort(countries);
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i].toString());
		}
	}

	public static void main(String[] args) {
		Exercise18e e18d = new Exercise18e();
		e18d.program();
	}
}