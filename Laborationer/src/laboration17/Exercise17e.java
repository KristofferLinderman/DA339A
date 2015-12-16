package laboration17;

public class Exercise17e {

	public static void main(String[] args) {
		Exercise17e e17e = new Exercise17e();
		int[] array = { 1, 2, 3, 9, 5, 9 };
		int index;
		index = e17e.member(7, array);
		System.out.println("Pos for 7: " + index);
		index = e17e.member(9, array);
		System.out.println("Pos for 9: " + index);

	}

	private int member(int nbr, int[] array) {
		for (int i = 0 ; i < array.length; i++) {
			if(array[i] == nbr){
				return i;
			}
		}
		return 0-1;
	}
}
