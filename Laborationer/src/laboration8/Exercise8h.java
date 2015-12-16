package laboration8;

import javax.swing.JOptionPane;

public class Exercise8h {
	public static void main(String[] args) {
		Exercise8h e8h = new Exercise8h();
		e8h.leapYear();
	}

	public void leapYear() {

		int year = Integer.parseInt(JOptionPane
				.showInputDialog("Write your year"));

		while (year >= 0) {
			if (year < 1582) {
				JOptionPane
						.showMessageDialog(null,
								"This year is prior to the start of the Gregorian Calendar");
			} else if (year % 4 == 0) {

				if ((year % 100 == 0) && (year % 400 != 0)) {
					JOptionPane.showMessageDialog(null, year
							+ " was NOT a leap year!");
				} else {
					JOptionPane.showMessageDialog(null, year
							+ " was a leap year!");
				}
			} else {
				JOptionPane.showMessageDialog(null, year
						+ " was NOT a leap year!");
			}
			year = Integer.parseInt(JOptionPane
					.showInputDialog("Write your year"));
		}
	}
}
