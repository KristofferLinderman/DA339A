package laboration13;

import java.awt.BorderLayout;

import javax.swing.*;

public class ContactBookGUI extends JFrame {

	public ContactBookGUI(ContactBook contactBook){
		super("Contact Book");
		setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		
		buttonPanel.add(new AddButton(contactBook));
		buttonPanel.add(new ViewContactBook(contactBook));
		buttonPanel.add(new FindNumber(contactBook));
		
		add(buttonPanel,BorderLayout.CENTER);
		setVisible(true);
		setSize(500,600);
		setResizable(false);
		
	}
	
	public static void main(String[] args) {
		ContactBook contactBook = new ContactBook();
		ContactBookGUI gui = new ContactBookGUI(contactBook);
	}
	
}
