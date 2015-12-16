package laboration3;

import java.util.Scanner;

public class FarenheitToCelsius {

	public double convertFtoC(double farenheit){
		
		return (farenheit-32)/1.8;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FarenheitToCelsius f2c = new FarenheitToCelsius();
		
		System.out.println("Write the temperature in Farenheit");
		double farenheit = scan.nextDouble();
		
		System.out.println("That is " + f2c.convertFtoC(farenheit) + " degrees Celsius");
		
	}
}
