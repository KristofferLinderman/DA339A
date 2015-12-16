package laboration18;

import java.util.*;
import java.text.*;

public class AlphabeticalOrder implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		
		Population country1 = (Population) obj1;
		Population country2 = (Population) obj2;
		
		String name1 = country1.getCountry();
		String name2 = country2.getCountry();
		
		Collator coll = Collator.getInstance();
		
		return coll.compare(name1, name2);

	}

}