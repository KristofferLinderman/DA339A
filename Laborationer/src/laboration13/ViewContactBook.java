package laboration13;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ViewContactBook extends JButton implements ActionListener {
	private ContactBook contactBook;

	public ViewContactBook(ContactBook contactBook) {
		super("View Contacts");
		this.contactBook = contactBook;
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, contactBook.toString());
	}

}
