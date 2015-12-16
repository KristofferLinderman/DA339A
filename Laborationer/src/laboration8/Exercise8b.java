package laboration8;

/**
 * Träna while-loop
 * 
 * @author Rolf Axelsson
 */
public class Exercise8b {
	public void exercise8b0() {
		int i = 0;
		while (i < 10) {
			System.out.print('A' + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		Exercise8b e8b = new Exercise8b();
		e8b.exercise8b0();
		System.out.println();
		e8b.exercise8b1();
		System.out.println();
		e8b.exercise8b2();
		System.out.println();
		e8b.exercise8b3();
		System.out.println();
		e8b.exercise8b4();
		System.out.println();
		e8b.exercise8b5();
		System.out.println();
		e8b.exercise8b6();
	}

	private void exercise8b6() {
	       int i = 0;
	        while( i < 5 ) {
	            System.out.print( 30-i*5 + " ");
	            i++;
	        }
	}

	private void exercise8b5() {
	       int i = 0;
	        while( i < 5 ) {
	            System.out.print( i*2 + " ");
	            i++;
	        }
	}

	private void exercise8b4() {
	       int i = 9;
	        while( i >= 0 ) {
	            System.out.print( i + " ");
	            i--;
	        }
	}

	private void exercise8b3() {
		int i = 0;
		while (i < 10) {
			System.out.print(i+1 + " ");
			i++;
		}
	}

	private void exercise8b2() {
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
	}

	private void exercise8b1() {
		int i = 0;
		while (i < 10) {
			System.out.print('h' + " ");
			i++;
		}
	}
}
