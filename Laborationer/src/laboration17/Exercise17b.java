package laboration17;

public class Exercise17b {
	public void greaterThan8(double[] array) {
		for (double numb : array) {
			if (numb > 8) {
				System.out.print(numb + " ");
			}
		}
		System.out.println();
	}

	public void negativeNumbers(double[] array) {
		for (double numb : array) {
			if (numb < 0) {
				System.out.print(numb + " ");
			}
		}
		System.out.println();
	}

	public void reverse(double[] array) {
		System.out.print("Reverse:");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void everyThirdReverse(double[] array) {
		System.out.print("Every third number, reverse: ");
		for (int i = array.length - 1; i >= 0; i -= 3) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void action() {
		double[] numbers = { 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };
		// double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4 };

		greaterThan8(numbers);
		negativeNumbers(numbers);
		reverse(numbers);
		everyThirdReverse(numbers);
	}

	public static void main(String[] args) {
		Exercise17b e17b = new Exercise17b();
		e17b.action();
	}
}