package laboration8;

/**
 * Träna for-loop 
 * @author Rolf Axelsson
 */
public class Exercise8a {
    public void exercise8a0() {
        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( 'A' + " ");
        }
    }

    public static void main(String[] args) {
        Exercise8a e8a = new Exercise8a();
        e8a.exercise8a0();
        System.out.println();
        e8a.exercise8a1();
        System.out.println();
        e8a.exercise8a2();
        System.out.println();
        e8a.exercise8a3();
        System.out.println();
        e8a.exercise8a4();
        System.out.println();
        e8a.exercise8a5();
        System.out.println();
        e8a.exercise8a6();
    }

	private void exercise8a6() {
		int nbr = 30;
	    for( int i = 0 ; i < 5 ; i++ ) {
            System.out.print( nbr + " ");
            nbr -= 5;
        }	
	}

	private void exercise8a5() {
	    for( int i = 0 ; i < 5 ; i++ ) {
            System.out.print( i*2 + " ");
        }			
	}

	private void exercise8a4() {
	    for( int i = 9 ; i >=0 ; i-- ) {
            System.out.print( i + " ");
        }			
	}

	private void exercise8a3() {
	    for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( i+1 + " ");
        }			
	}

	private void exercise8a2() {
        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( i + " ");
        }		
	}

	private void exercise8a1() {
        for( int i = 0 ; i < 10 ; i++ ) {
            System.out.print( 'h' + " ");
        }
	}
}
