/*
 * Lab1Exercise1.java
 * Skapad den 2 september 2014
 */
import javax.swing.JOptionPane;

/**
 * Programmet skriver ut "Ett java-program" med hj�lp av ett dialogf�nster.
 * 
 * @author Rolf axelsson
 * @version 1.0
 */
public class Lab1Exercise1 {

	/*
	 * Metoden visar texten "Ett java-program" i ett dialogf�nster.
	 */
	public void message() {
		//Metoden visar ett par meddelanden med hjälp av dialogfönster.
		
		// Ett dialogfönster öppnas med meddelandet "Ett java-program skrivet av mig"
		JOptionPane.showMessageDialog(null, "Ett Java-program skrivet av mig.");
		// Ett dialogfönster öppnas med meddelandet "När du klickar ..."
		JOptionPane.showMessageDialog( null, "När du klickar på OK så avslutas programmet" );    
    	}

	/*
	 * Instruktionerna i main-metoden utf�rs d� programmet exekveras.
	 * main-metoden har endast tv� instruktioner. - den f�rsta instruktionen
	 * skapar ett objekt av typen Lab2Exercise1 - den andra instruktionen
	 * anropar metoden message i det nyss skapade objektet
	 */
	public static void main(String[] args) {
		Lab1Exercise1 prog = new Lab1Exercise1();
		prog.message();
	}
}
