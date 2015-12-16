package laboration17;

public class Exercise17d {

	public static void reverse(int[] array) {

		for (int i = array.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		Exercise17d e17d = new Exercise17d();
		
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1000, 100, 10, 1 };
		
		System.out.print("Array 1 baklänges: ");
		Exercise17d.reverse(arr1);
		System.out.println();
		
		System.out.print("Array 2 baklänges: ");
		Exercise17d.reverse(arr2);
		System.out.println();
	}
}
