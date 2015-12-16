package laboration5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Program5b {
	public void date() {

		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(calendar.getTime());
		JOptionPane.showMessageDialog(null,
				"Dagens datum: " + format.format(calendar.getTime()));

	}

	public void time() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat time = new SimpleDateFormat("HH:mm");
		JOptionPane.showMessageDialog(null,
				"Klockan är: " + time.format(calendar.getTime()));
	}

	public void dateAndTime() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		JOptionPane.showMessageDialog(
				null,
				"Dagens datum: "
						+ format.format(calendar.getTime()) + "\n"
								+ "Klockan är: "
								+ time.format(calendar.getTime()));
	}

	public static void main(String[] args) {
		Program5b prog = new Program5b();
		prog.dateAndTime();
	}
}
