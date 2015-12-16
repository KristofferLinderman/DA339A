package laboration17;

public class Exercise17a {

	public void action() {
		double[] numbers = { 23.2, 14.7, 17.0, -5.9, -11.1, 26.3, 8.3, 7.6 };
		// double[] numbers = { -1, 2, 5, 8, 11, 14, 10, 6, 2, -4 };

		int counter;
		double sum;
		String res;

		// number of elements
		// System.out.println(numbers.length);

		// Sum of numbers
		// sum = 0;
		// for (int i = 0; i < numbers.length; i++) {
		// sum += numbers[i];
		// }
		// System.out.println(sum);

		// Bigger than 8, and how many
		// counter = 0;
		// for (int i = 0; i < numbers.length; i++) {
		// if (numbers[i] > 8) {
		// System.out.print(numbers[i] + " ");
		// counter++;
		// }
		// }
		// System.out.println();
		// System.out.println(counter);

		// negative numbers and their sum
		// sum = 0;
		// for (int i = 0; i < numbers.length; i++) {
		// if (numbers[i] < 0) {
		// sum += numbers[i];
		// System.out.print(numbers[i ]+ " ");
		// }
		// }
		// System.out.println();
		// System.out.println(sum);

		// Print backwards
		// for (int i = numbers.length - 1; i > -1; i--) {
		// System.out.print(numbers[i] + " ");
		// }

		// Every third number from the end
		// counter = 0;
		// for (int i = numbers.length - 1; i >= 0; i--) {
		// counter++;
		// if (counter == 3) {
		// counter = 0;
		// System.out.print(numbers[i] + " ");
		// }
		// }

		// For each loop
		// for (double numb : numbers){
		// System.out.print(numb + " ");
		// }
		
		//For-each higher than 8
		counter = 0;
		for(double numb : numbers){
			if(numb > 8){
				counter++;
			}
		}
		System.out.println(counter);

	}

	public static void main(String[] args) {
		Exercise17a e17a = new Exercise17a();
		e17a.action();
	}
}
