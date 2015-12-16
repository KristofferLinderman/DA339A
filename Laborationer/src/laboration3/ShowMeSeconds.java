package laboration3;

import java.util.Scanner;

public class ShowMeSeconds {
	
	/**
	 * Converts h/m/s into only seconds.
	 * @param h - number of hours
	 * @param min - number of minutes
	 * @param sec - number of seconds
	 * @return total amount of second
	 */
	public int inSeconds(int h, int min, int sec){
		
		
		return h*3600 + min*60 + sec;
	}

	public static void main(String[] args) {
		ShowMeSeconds sec = new ShowMeSeconds();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write the time in format hour minute second");
		int h = scan.nextInt();
		int m = scan.nextInt();
		int s = scan.nextInt();
		
		System.out.println("That is: " + sec.inSeconds(h, m, s) + " amount of seconds.");
	}
}
