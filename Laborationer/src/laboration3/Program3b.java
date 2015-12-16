package laboration3;

import javax.swing.JOptionPane;

public class Program3b {
    public void info() {
    	
    	String name = JOptionPane.showInputDialog(null,"Skriv ditt namn");
    	int nbr = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv hur många program du skrivit"));
    	
    	System.out.println("￼￼￼￼￼Hej, mitt namn är " + name + ".");
    	System.out.println("Jag har skrivit " + nbr +" program i Java");
    	System.out.println("Det är kul med Java!");
    }

    public static void main( String[] args ) {
        Program3b p3 = new Program3b();
        p3.info();
    }
}