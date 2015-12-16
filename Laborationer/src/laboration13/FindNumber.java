package laboration13;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FindNumber extends JButton implements ActionListener{
	private ContactBook contactBook;
	
	public FindNumber(ContactBook contactBook) {
		super("Find Number");
		this.contactBook = contactBook;
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = JOptionPane.showInputDialog("Entere the name of the Contact");
		JOptionPane.showMessageDialog(null, contactBook.findContactNumbers(name).toString());
	}

}
