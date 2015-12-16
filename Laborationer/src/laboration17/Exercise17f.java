package laboration17;

import javax.swing.JOptionPane;

public class Exercise17f {


	public Exercise17f() {
		int [] array =  {2,4,6,8,10,12,14,16,18,20};
		
//		int [] array = new int[10];
//		
//		for (int i = 0; i < 10; i++) {
//			array[i] = Integer.parseInt((JOptionPane
//					.showInputDialog("Write number " + (i+1))));
//		}
		
		printNumbers(array);
		printEverySecond(array);
		Exercise17d.reverse(array);

	}
	
	private void printNumbers(int[] array){
		for(int number : array){
			System.out.print(number + " ");
		}
		System.out.println();
	}
	
	private void printEverySecond(int[] array){
		for (int i = 0; i < 10; i+=2) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Exercise17f prog = new Exercise17f();
		
	}
}
