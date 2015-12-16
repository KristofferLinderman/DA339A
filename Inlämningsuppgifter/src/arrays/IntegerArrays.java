package arrays;

public class IntegerArrays {

	/**
	 * Creates a string from an array
	 * 
	 * @param inputArray
	 *            - array to be in the string
	 * @return String of array
	 */
	public static String toString(int[] inputArray) {
		StringBuilder arrayString = new StringBuilder("{");

		for (int i = 0; i < inputArray.length; i++) {
			if (i == inputArray.length - 1) {
				arrayString.append(inputArray[i]);
			} else {
				arrayString.append(inputArray[i] + ",");
			}
		}
		arrayString.append("} ");
		return arrayString.toString();

	}

	/**
	 * Finds max value in array
	 * 
	 * @param inputArray
	 *            - array to search
	 * @return max value in array
	 */
	public static int max(int[] inputArray) {
		int max = Integer.MIN_VALUE;

		for (int element : inputArray) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}

	/**
	 * Finds min value in array
	 * 
	 * @param inputArray
	 *            - array to search
	 * @return min value in array
	 */
	public static int min(int[] inputArray) {
		int min = Integer.MAX_VALUE;

		for (int element : inputArray) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	/**
	 * Calculate sum of the values in an array
	 * 
	 * @param inputArray
	 *            - array to be summarized
	 * @return sum of the values
	 */
	public static int sum(int[] inputArray) {
		int sum = 0;

		for (int element : inputArray) {
			sum += element;
		}

		return sum;
	}

	/**
	 * Calculates the average of the values in an array
	 * 
	 * @param inputArray
	 *            - array to find average
	 * @return average of the array
	 */
	public static float average(int[] inputArray) {
		float sum = IntegerArrays.sum(inputArray);
		float avg = sum / inputArray.length;

		return avg;
	}

	/**
	 * Calculates the difference between max and min value in an array
	 * 
	 * @param inputArray
	 *            - array to find range in
	 * @return range of array
	 */
	public static int range(int[] inputArray) {
		return IntegerArrays.max(inputArray) - IntegerArrays.min(inputArray);
	}

	/**
	 * Creates an copy of original array
	 * 
	 * @param inputArray
	 *            - array to be copied
	 * @return copied array
	 */
	public static int[] copy(int[] inputArray) {
		int[] copyArray = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			copyArray[i] = inputArray[i];
		}

		return copyArray;
	}

	/**
	 * Sorts the array in ascending order using insertion sort
	 * 
	 * @param inputArray
	 *            - Array to be sorted
	 */
	public static void sortAsc(int[] inputArray) {
		int temp;

		for (int i = 1; i < inputArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (inputArray[j] < inputArray[j - 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j - 1];
					inputArray[j - 1] = temp;
				}
			}
		}
	}

	/**
	 * Sorts the array in descending order using insertion sort and then
	 * flipping
	 * 
	 * @param inputArray
	 *            - Array to be sorted
	 */
	public static void sortDescCheat(int[] inputArray) {
		IntegerArrays.sortAsc(inputArray);
		IntegerArrays.flipArray(inputArray);
	}

	/**
	 * Sort array Descending using selection sort
	 * 
	 * @param inputArray
	 */
	public static void sortDesc(int[] inputArray) {
		int temp;
		int swapIndex;

		for (int index = 0; index < inputArray.length - 1; index++) {
			swapIndex = index;
			for (int i = index + 1; i < inputArray.length; i++) {
				if (inputArray[i] > inputArray[swapIndex]) {
					swapIndex = i;
				}
			}
			temp = inputArray[swapIndex];
			inputArray[swapIndex] = inputArray[index];
			inputArray[index] = temp;

		}
	}

	/**
	 * Flip the array so first value is last and the last value is first
	 * 
	 * @param inputArray
	 */
	public static void flipArray(int[] inputArray) {
		int temp;
		int inputSize = inputArray.length;
		for (int i = 0; i < inputSize / 2; i++) {
			temp = inputArray[i];
			inputArray[i] = inputArray[inputSize - 1 - i];
			inputArray[inputSize - 1 - i] = temp;
		}
	}

	/**
	 * Returns the median of an array
	 * 
	 * @param inputArray
	 *            - array of values
	 * @return Median of the array
	 */
	public static double getMedian(int[] inputArray) {
		int[] copyArray = IntegerArrays.copy(inputArray);
		IntegerArrays.sortAsc(copyArray);
		double median = 0;

		if (copyArray.length % 2 != 0) {
			median = copyArray[copyArray.length / 2];
		} else {
			double first = copyArray[copyArray.length / 2];
			double second = copyArray[copyArray.length / 2 - 1];
			median = (first + second) / 2;
		}

		return median;
	}
}
