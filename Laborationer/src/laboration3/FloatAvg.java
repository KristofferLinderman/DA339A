package laboration3;

import javax.swing.*;

public class FloatAvg {

	public void floatAvg() {

		double nbr1 = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Number 1 please"));
		double nbr2 = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Number 2 please"));
		
		System.out.println("Number 1: " + nbr1 + "\t Number 2: " + nbr2);
		System.out.println(nbr1+nbr2);
		System.out.println(nbr1-nbr2);
		System.out.println(nbr1*nbr2);
	}
	
	public static void main(String[] args) {
		FloatAvg avg = new FloatAvg();
		avg.floatAvg();
	}
}
