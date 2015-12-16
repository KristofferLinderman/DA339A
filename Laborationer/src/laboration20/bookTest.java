package laboration20;

public class bookTest {
	public static void main(String[] args) {

		Book media = new Book(837884976, "En fantastisk värld", "Alice Green");
		String res = media.getTitle() + " av " + media.getAuthor() + "\n"
				+ "toString-metoden: " + media.toString();
		javax.swing.JOptionPane.showMessageDialog(null, res);

	}
}
