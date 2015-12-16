package arrays;

public class Integer2dArrays {

	/**
	 * Creates a string from an array of an array
	 * 
	 * @param inputArray
	 *            - array of an array to be in the string
	 * @return String of array
	 */
	public static String toString(int[][] inputArray) {
		StringBuilder arrayString = new StringBuilder("{ ");

		for (int i = 0; i < inputArray.length; i++) {
			arrayString.append(IntegerArrays.toString(inputArray[i]));
		}
		arrayString.append("}");
		return arrayString.toString();
	}

	/**
	 * Calculates the number of elements in an array of arrays
	 * 
	 * @param inputArray
	 *            - array of arrays to find number of elements
	 * @return number of the elements in the array of arrays
	 */
	public static int elements(int[][] inputArray) {
		int nbrOfElements = 0;

		for (int[] rows : inputArray) {
			nbrOfElements += rows.length;
		}
		return nbrOfElements;
	}

	/**
	 * Finds max value in an array of arrays
	 * 
	 * @param inputArray
	 *            - array of arrays to search
	 * @return max value in array of arrays
	 */
	public static int max(int[][] inputArray) {
		int max = Integer.MIN_VALUE;

		for (int[] rows : inputArray) {
			if (IntegerArrays.max(rows) > max) {
				max = IntegerArrays.max(rows);
			}
		}
		return max;
	}

	/**
	 * Finds min value in an array of arrays
	 * 
	 * @param inputArray
	 *            - array of arrays to search
	 * @return min value in array of arrays
	 */
	public static int min(int[][] inputArray) {
		int min = Integer.MAX_VALUE;

		for (int[] rows : inputArray) {
			if (IntegerArrays.min(rows) > min) {
				min = IntegerArrays.max(rows);
			}
		}
		return min;
	}

	/**
	 * Calculate sum of the values in an array of arrays
	 * 
	 * @param inputArray
	 *            - array of arrays to be summarized
	 * @return sum of the values
	 */
	public static int sum(int[][] inputArray) {
		int sum = 0;

		for (int[] rows : inputArray) {
			sum += IntegerArrays.sum(rows);
		}
		return sum;
	}

	/**
	 * Calculates the average of the values in an array of arrays
	 * 
	 * @param inputArray
	 *            - array of arrays to find average
	 * @return average of the array of arrays
	 */
	public static float average(int[][] inputArray) {
		float avg = (float) Integer2dArrays.sum(inputArray)
				/ Integer2dArrays.elements(inputArray);

		return avg;
	}

}
