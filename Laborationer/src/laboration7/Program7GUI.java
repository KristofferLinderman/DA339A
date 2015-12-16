package laboration7;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Program7GUI extends JFrame {
	
	public Program7GUI(){
		super("Laboration 7");
		
		setLayout(new BorderLayout());

		JPanel buttonPanel = new JPanel();

		buttonPanel.add(new Program7a());
		buttonPanel.add(new Program7b());
		buttonPanel.add(new Program7c());
		buttonPanel.add(new Program7d());
		buttonPanel.add(new Program7f());
		buttonPanel.add(new Program7h());
		buttonPanel.add(new Program7i());
		buttonPanel.add(new Program7k());
		buttonPanel.add(new Program7l());
		buttonPanel.add(new Program7m());

		this.add(buttonPanel, BorderLayout.CENTER);
		setVisible(true);
		setSize(250, 850);
	}
	
	public static void main(String[] args) {
		Program7GUI gui = new Program7GUI();
	}

}
