package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7l extends JButton implements ActionListener {

	public Program7l() {
		super("Program7l");
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean correct = false;
		double a = 0;
		double b = 0;

		while (!correct) {
			String equation = JOptionPane
					.showInputDialog("Write the value for a and b");
			Scanner scan = new Scanner(equation);
			a = scan.nextDouble();
			b = scan.nextDouble();
			correct = (JOptionPane.showConfirmDialog(null, "Is " + a + "x + "
					+ b + " = 0 \nthe correct equation?", "Confirmation",
					JOptionPane.YES_NO_OPTION)) == JOptionPane.YES_OPTION;
		}
		
		if(a == 0){
			JOptionPane.showMessageDialog(null, "Invalid equation if there are zero x");
		} else {
			JOptionPane.showMessageDialog(null, "Solution: x = " + (-b/a));
		}
	}

}
