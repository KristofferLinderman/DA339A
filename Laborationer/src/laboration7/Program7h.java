package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7h extends JButton implements ActionListener {
	
	public Program7h(){
		super("Program7h");
		addActionListener(this);
		setPreferredSize(new Dimension(200,75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Write your first number"));
		int nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Write your second number"));
		int nbr3 = Integer.parseInt(JOptionPane.showInputDialog("Write your third number"));
		
		JOptionPane.showMessageDialog(null, "The biggest number was: " + Math.max(Math.max(nbr1, nbr2),nbr3));
	}
	

}
