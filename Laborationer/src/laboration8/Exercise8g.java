package laboration8;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercise8g {

	public void exer8g() {
		int number, randomValue;
		int sum = 0;
		Random rand = new Random();
		number = Integer
				.parseInt(JOptionPane.showInputDialog("Antal slumptal"));
		System.out.println("Slumptal: ");
		
		for (int i = 1; i <= number; i++) {
			randomValue = rand.nextInt(20) + 5;
			System.out.print(randomValue + " ");
			sum += randomValue;
		}
		System.out.println();
		System.out.println("Sum of all the numbers: " + sum);
	}
	public static void main(String[] args) {
		Exercise8g e8g = new Exercise8g();
		e8g.exer8g();
	}
}
