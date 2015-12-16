package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7f extends JButton implements ActionListener {
	
	public Program7f(){
		super("Program7f");
		addActionListener(this);
		setPreferredSize(new Dimension(200,75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int nbr1 = Integer.parseInt(JOptionPane.showInputDialog("Write your first number"));
		int nbr2 = Integer.parseInt(JOptionPane.showInputDialog("Write your second number"));
		
		JOptionPane.showMessageDialog(null, "The biggest number was: " + Math.max(nbr1, nbr2));
	}
	

}
