package laboration5;
import javax.swing.JOptionPane;

	/**
	 * Programmet ger exempel på några metoder i klassen String
	 * @author Rolf Axelsson
	 */
	public class Program5a {
	    public void nameInfo1() {
	        String name, upperCase, lowerCase, res="";
	        int count;
	        char firstLetter;

	        name = JOptionPane.showInputDialog("Mata in ditt förnamn");
	        count = name.length();  // length() => antal tecken i String-objektet
	        upperCase = name.toUpperCase();  // toUpperCase => nytt String-objekt
	        lowerCase = name.toLowerCase();  // toLowerCase => nytt String-objekt
	        firstLetter = name.charAt(0);  // charAt(index) => returnerar tecken i visst index

	        res += "Du heter " + name + "\n";
	        res += "Ditt namn innehåller " + count + " bokstäver. \n";
	        res += "Ditt namn med stora bokstäver: " + upperCase + "\n";
	        res += "Ditt namn med små bokstäver: " + lowerCase + "\n";
	        res += "Första bokstaven i ditt namn är " + firstLetter;
	        JOptionPane.showMessageDialog(null, res);
	    }
	

	    public static void main(String[] args) {
	        Program5a sp = new Program5a();
	        sp.nameInfo1();
	    }
	}


