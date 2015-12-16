package laboration7;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7a extends JButton implements ActionListener {

	public Program7a() {
		super("Program7a");
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int nbr = Integer.parseInt(JOptionPane.showInputDialog("Write a whole number"));
		
		if(nbr > 100){
			JOptionPane.showMessageDialog(null, "Talet är större än 100");
		}
		
	}

}
