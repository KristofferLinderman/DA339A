package laboration18;

public class Exercise18d {
	public void increase(double[][] arr, double nbr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += nbr;
			}
		}
	}

	public int greaterThan(long[][] arr, long nbr) {
		int nbrsGreater = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > nbr) {
					nbrsGreater++;
				}
			}
		}
		return nbrsGreater;
	}

	public int sumInterval(int[][] arr, int min, int max) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= min && arr[i][j] <= max) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	public double max(double[][] arr) {
		double max = Double.MIN_VALUE;

		for (double rows[] : arr) {
			for (double element : rows) {
				if (element > max) {
					max = element;
				}
			}
		}

		return max;
	}

	public double min(double[][] arr) {
		double min = Double.MAX_VALUE;

		for (double rows[] : arr) {
			for (double element : rows) {
				if (element < min) {
					min = element;
				}
			}
		}

		return min;
	}

	private void print(double[][] array, int width, int decimals) {
		for (double[] arr : array) {
			for (double elem : arr) {
				System.out.printf("%" + width + "." + decimals + "f", elem);
			}
			System.out.println();
		}
	}

	public void exercise18d1() {
		double[][] array1 = { { 2.3, 6.1 }, { 3.3, 8.6 }, { 5.4, 5.2 } };
		double[][] array2 = { { 2.3, 6.1, 7.0, 3.5 }, { 3.3, 8.6 },
				{ 5.4, 5.5, 5.2 } };
		increase(array1, 1.2);
		increase(array2, -1);
		print(array1, 5, 1);
		System.out.println();
		print(array2, 5, 1);
	}

	public void exercise18d2() {
		long[][] array1 = { { 2, 6 }, { 3, 8 }, { 5, 3 } };
		long[][] array2 = { { 2, 6, 7, 3 }, { 3, 8 }, { 5, 5, 4, 7 } };
		int count1 = greaterThan(array1, 4);
		int count2 = greaterThan(array2, 4);
		System.out.println("Greater than 4: array1=" + count1 + ", array2="
				+ count2);
	}

	public void exercise18d3() {
		int[][] array1 = { { 2, 6 }, { 3, 8 }, { 5, 3 } };
		int[][] array2 = { { 2, 6, 7, 3 }, { 3, 8 }, { 5, 5, 4, 7 } };
		int sum1 = sumInterval(array1, 3, 4);
		int sum2 = sumInterval(array2, 3, 7);
		System.out.println("sum1=" + sum1 + ", sum2=" + sum2);
	}

	public void exercise18d4() {
		double[][] array1 = { { 2.3, 6.1 }, { 3.3, 10.8 }, { 5.4, 5.2 } };
		double[][] array2 = { { 2.3, 6.1, -7.0, 3.5 }, { 3.3, 8.6 },
				{ 5.4, 5.5, -5.2 } };
		double max1 = max(array1);
		double max2 = max(array2);
		System.out.println("max1=" + max1 + ", max2=" + max2);
	}

	public void exercise18d5() {
		double[][] array1 = { { 2.3, -6.1 }, { 3.3, 10.8 }, { -5.4, 5.2 } };
		double[][] array2 = { { 2.3, 6.1, -7.0, 3.5 }, { 3.3, 8.6 },
				{ 5.4, 5.5, -5.2 } };
		double min1 = min(array1);
		double min2 = min(array2);
		System.out.println("min1=" + min1 + ", min2=" + min2);
	}

	public static void main(String[] args) {
		Exercise18d e18d = new Exercise18d();
		e18d.exercise18d1();
		e18d.exercise18d2();
		e18d.exercise18d3();
		e18d.exercise18d4();
		e18d.exercise18d5();
	}
}
