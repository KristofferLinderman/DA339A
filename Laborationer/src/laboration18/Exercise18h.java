package laboration18;

import java.util.Random;

public class Exercise18h {

	private int[] array;

	public Exercise18h() {
		array = new int[10];
		addRandomNumbers();
		printArray();
		sortArray();
		printArray();
		flipArray();
		printArray();
	}

	private void addRandomNumbers() {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 100;
		}
	}

	/**
	 * sorts array with insertion sort
	 */
	private void sortArray() {
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	private void printArray() {
		for (int nbr : array) {
			System.out.print(nbr + " ");
		}
		System.out.println();
	}

	private void flipArray() {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			if (i < array.length - 1 - i) {
				temp = array[i];
				array[i] = array[array.length - 1 - i];
				array[array.length - 1 - i] = temp;
			} else
				break;
		}
	}

	public static void main(String[] args) {
		Exercise18h e = new Exercise18h();
	}
}
