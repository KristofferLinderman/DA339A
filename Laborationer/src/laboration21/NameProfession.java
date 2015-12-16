package laboration21;

import java.awt.*;

import javax.swing.*;

public class NameProfession extends JPanel { 

	private JPanel input;
	private JPanel info;
	private JLabel name;
	private JLabel profession;
	private JTextField nameInput;
	private JTextField professionInput;

	public NameProfession() {
		setLayout(new BorderLayout());

		initiateVariables();
		
		input.add(nameInput, BorderLayout.NORTH);
		input.add(professionInput, BorderLayout.SOUTH);

		info.add(name, BorderLayout.NORTH);
		info.add(profession, BorderLayout.SOUTH);

		add(input, BorderLayout.EAST);
		add(info, BorderLayout.WEST);

	}
	
	private void initiateVariables(){
		input = new JPanel(new BorderLayout());
		info = new JPanel(new BorderLayout());
		
		input.setPreferredSize(new Dimension(300,50));
		info.setPreferredSize(new Dimension(75,50));
		
		name = new JLabel("Name");
		profession = new JLabel("Profession:");
		
		nameInput = new JTextField("Your name");
		professionInput = new JTextField("Your profession");
	}

	public String getName() {
		return nameInput.getText();
	}

	public String getProfession() {
		return professionInput.getText();
	}
}