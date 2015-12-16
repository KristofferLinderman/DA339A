package laboration21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestNameProfession extends JPanel implements ActionListener {
	private JButton update = new JButton("Uppdatera textytan");
	private JTextArea textarea = new JTextArea();
	private NameProfession nameProfession = new NameProfession();
	private StringBuilder output;

	public TestNameProfession() {
		setLayout(new BorderLayout());
		textarea.setPreferredSize(new Dimension(300, 100));
		textarea.setEditable(false);
		update.addActionListener(this);
		output = new StringBuilder();
		add(nameProfession, BorderLayout.NORTH);
		add(textarea, BorderLayout.CENTER);
		add(update, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		output.append(("Name: " + nameProfession.getName() + "\n"
				+ "Profession: " + nameProfession.getProfession()) + "\n");
		textarea.setText(output.toString());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(new TestNameProfession());
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}