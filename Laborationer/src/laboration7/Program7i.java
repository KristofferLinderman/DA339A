package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7i extends JButton implements ActionListener {

	public Program7i() {
		super("Program7i");
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int year = Integer.parseInt(JOptionPane
				.showInputDialog("Write your year"));

		if (year < 1582) {
			JOptionPane.showMessageDialog(null,
					"This year is prior to the start of the Gregorian Calendar");
		} else if (year % 4 == 0) {

			if ((year % 100 == 0) && (year % 400 != 0)) {
				JOptionPane.showMessageDialog(null, year
						+ " was NOT a leap year!");
			} else {
				JOptionPane.showMessageDialog(null, year + " was a leap year!");
			}
		} else {
			JOptionPane.showMessageDialog(null, year + " was NOT a leap year!");
		}
	}
}
