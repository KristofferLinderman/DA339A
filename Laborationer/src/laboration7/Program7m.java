package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7m extends JButton implements ActionListener {

	public Program7m() {
		super("Program7m");
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		boolean additional;
		ArrayList<Double> numbers = new ArrayList<>();

		numbers.add(Double.parseDouble(JOptionPane
				.showInputDialog("Write the number you like to add to the list of numbers to compare")));
		additional = JOptionPane.showConfirmDialog(null,
				"Do you wish to add additional numbers?", "Got more?",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

		while (additional) {
			numbers.add(Double.parseDouble(JOptionPane
					.showInputDialog("Write the number you like to add to the list of numbers to compare")));
			additional = JOptionPane.showConfirmDialog(null,
					"Do you wish to add additional numbers?", "Got more?",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
		}
		
		Collections.sort(numbers);
		
		JOptionPane.showMessageDialog(null, "The list of numbers is now sorted \n" + numbers.toString());
		

	}

}
