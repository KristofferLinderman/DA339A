package laboration7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Program7n {

	public void quadraticSolver(double a, double b, double c) {
		double x1;
		double x2;
		double res[] = new double[2];

		// If the x^2 element oesn't exist regular equation
		if (a == 0) {
			if(b == 0){
				JOptionPane.showMessageDialog(null, "Invalid equation");
				return;
			} else {
				JOptionPane.showMessageDialog(null, "Solution x = " + -b/a);
				return;
			}
		}
		
		//If there are any real roots for the equation
		if((b*b) - (4*a*c) < 0){
			JOptionPane.showMessageDialog(null, "No real roots");
			return;
		}
		
		// = 0 shows that only one root exists
		if((b*b) - (4*a*c) == 0){
			JOptionPane.showMessageDialog(null, "Only one root = " + -b/(a*2));
			return;
		}
		//calculating two real roots
		if((b*b) - (4*a*c) > 0){
			
			x1 = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
			x2 = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
			
			JOptionPane.showMessageDialog(null, "Two roots = \nX1 = " + x1 + "\nX2= " + x2);
		}
		

	}
	
	public static void main(String[] args) {
		
		double a, b, c;
		
		Program7n prog = new Program7n();
		
		String equation = JOptionPane
				.showInputDialog("Quadratic format: a x^2 + bx + c = 0 \nWrite the value for a, b and c");
		Scanner scan = new Scanner(equation);
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		JOptionPane.showConfirmDialog(null, "Is " + a + "x^2 + "
				+ b + "x + " + c + " = 0 \nthe correct equation?", "Confirmation",
				JOptionPane.YES_NO_OPTION) ;
	
		prog.quadraticSolver(a, b, c);
		scan.close();
	}

}
