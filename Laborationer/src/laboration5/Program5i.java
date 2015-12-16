package laboration5;

import javax.swing.JOptionPane;

public class Program5i {
	private String name;
	private String firstName;
	private String lastName;
	private String initials;
	private int blank;

	public boolean setName(){
		 name = JOptionPane
				.showInputDialog("Please write your first and last name");
		
		if(name == null || name.isEmpty()){
			return false;
		}
		
		findBlank();
		return true;
	}

	private void findBlank() {
		blank = name.indexOf(' ');
	}

	public String getName() {
		return name;
	}

	public String getFirstName() {
		firstName = name.substring(0, blank);

		return firstName;
	}

	public String getLastName() {
		lastName = name.substring(blank + 1, name.length());

		return lastName;
	}

	public String getInitials() {
		initials = firstName.substring(0, 1);
		initials += lastName.substring(0, 1);

		return initials;
	}

	public static void main(String[] args) {
		Program5i prog = new Program5i();

		if(prog.setName()){
		JOptionPane.showMessageDialog(null, "Ditt namn: " + prog.getName()
				+ "\n" + "Ditt förnamn: " + prog.getFirstName() + "\n"
				+ "Ditt efternamn: " + prog.getLastName() + "\n"
				+ "Dina initialer är: " + prog.getInitials());
		} else {
			JOptionPane.showMessageDialog(null, "Felaktig input", "Input Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
