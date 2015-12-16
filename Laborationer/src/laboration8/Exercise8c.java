package laboration8;

/**
 * Träna do-while-loop
 * @author Rolf Axelsson
 */
public class Exercise8c {
    public void exercise8c0() {
        int i = 0;
        do {
            System.out.print( 'A' + " ");
            i++;
        } while( i < 10 );
    }
    
    public static void main(String[] args) {
        Exercise8c e8c = new Exercise8c();
        e8c.exercise8c0();
        System.out.println();
        e8c.exercise8c1();
        System.out.println();
        e8c.exercise8c2();
        System.out.println();
        e8c.exercise8c3();
        System.out.println();
        e8c.exercise8c4();
        System.out.println();
        e8c.exercise8c5();
        System.out.println();
        e8c.exercise8c6();
    }

	private void exercise8c6() {
	      int i = 0;
	        do {
	            System.out.print( 30-i*5 + " ");
	            i++;
	        } while( i < 5 );		
	}

	private void exercise8c5() {
	      int i = 0;
	        do {
	            System.out.print( i*2 + " ");
	            i++;
	        } while( i < 5 );
	}

	private void exercise8c4() {
	      int i = 9;
	        do {
	            System.out.print( i + " ");
	            i--;
	        } while( i >= 0 );		
	}

	private void exercise8c3() {
	      int i = 0;
	        do {
	            System.out.print( i+1 + " ");
	            i++;
	        } while( i < 10 );		
	}

	private void exercise8c2() {
	      int i = 0;
	        do {
	            System.out.print( i + " ");
	            i++;
	        } while( i < 10 );		
	}

	private void exercise8c1() {
	      int i = 0;
	        do {
	            System.out.print( 'h' + " ");
	            i++;
	        } while( i < 10 );		
	}
}
