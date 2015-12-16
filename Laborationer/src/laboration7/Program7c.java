package laboration7;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Program7c extends JButton implements ActionListener {
	
	public Program7c(){
		super("Program7c");
		addActionListener(this);
		setPreferredSize(new Dimension(200, 75));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int age = Integer.parseInt(JOptionPane.showInputDialog("Write you age"));
		
		if(age > 17){
			JOptionPane.showMessageDialog(null, "Du är vuxen");
		} else if( age >= 0){
			JOptionPane.showMessageDialog(null, "Du är ett barn");
		}		
	}

}
