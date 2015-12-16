package laboration20;

public class mediaTest {

	public static void main(String[] args) {

		Media media = new Media(837884976, "En fantastisk värld");
		String res = media.getTitle() + " är ett '"
				+ media.getClass().getName() + "'-objekt" + "\n"
				+ "toString-metoden: " + media.toString();
		javax.swing.JOptionPane.showMessageDialog(null, res);

	}
}
