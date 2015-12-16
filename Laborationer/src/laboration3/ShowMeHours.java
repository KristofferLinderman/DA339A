package laboration3;

import java.util.Scanner;

public class ShowMeHours {
	
	/**
	 * Converts seconds into hours/minutes/second.

	 * @param sec - number of seconds
	 * @return time in hh/mm/ss format
	 */
	public void inHours(int sec){
		
		int hours = sec / 3600;
		int min = (sec % 3600) / 60;
		int seconds = sec - hours*3600 - min*60;
		
		System.out.println("That is equal to " + hours + " hours " + min + " minutes and " + seconds + " seconds");
	}

	public static void main(String[] args) {
		ShowMeHours sec = new ShowMeHours();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write the amount of seconds");
		int s = scan.nextInt();
		
		sec.inHours(s);
	}
}
