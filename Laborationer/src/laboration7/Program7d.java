package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Program7d extends JButton implements ActionListener{
	
	public Program7d(){
		super("Program7d");
		addActionListener(this);
		setPreferredSize(new Dimension(200,75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = JOptionPane.showInputDialog("Write your name");
		
		if(name.length() <= 5){
			JOptionPane.showMessageDialog(null, name + ", ditt namn är kort och fint!");
		} else{
			JOptionPane.showMessageDialog(null, name + ", ditt namn är långt och svårstavat!");
		}
	}

}
