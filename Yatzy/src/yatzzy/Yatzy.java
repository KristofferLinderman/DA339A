package yatzzy;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Yatzy extends JPanel {
	private SimpleDice dice;
	private JLabel roll;
	private JButton rollDice;
	private JPanel btnPanel;

	public Yatzy() {
		setPreferredSize(new Dimension(600, 600));
		setLayout(new BorderLayout());

		dice = new SimpleDice();
		roll = new JLabel(" ");
		rollDice = new JButton("Roll Dice");
		btnPanel = new JPanel(new BorderLayout());

		add(btnPanel, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		Yatzy yatzy = new Yatzy();
		JFrame frame = new JFrame();
		frame.add(yatzy);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocation(300, 300);
	}

}
