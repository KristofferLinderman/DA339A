package laboration13;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AddButton extends JButton implements ActionListener {
	private ContactBook contactBook;

	public AddButton(ContactBook contactBook) {
		super("Add Contact");
		this.contactBook = contactBook;
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name = JOptionPane.showInputDialog("Enter contact name");
		String home = JOptionPane.showInputDialog("Enter contact home number");
		String work = JOptionPane.showInputDialog("Enter contact work number");
		String mobile = JOptionPane.showInputDialog("Enter contact mobile number");
		
		if(contactBook.addContact(new Contact(name,home,work,mobile))){
			JOptionPane.showMessageDialog(null, "Contact added");
		} else{
			JOptionPane.showMessageDialog(null, "Contact couldn't be added, might already exist?");
		}
	}

}
