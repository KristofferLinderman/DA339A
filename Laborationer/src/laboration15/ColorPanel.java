package laboration15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ColorPanel extends JPanel {
	private JRadioButton rbRed;
	private JRadioButton rbGreen;
	private JRadioButton rbBlue;
	private JRadioButton rbRandom;
	private JLabel header = new JLabel("Choose color");
	private Dimension small = new Dimension(200, 30);

	public ColorPanel() {
		setPreferredSize(new Dimension(250, 230));

		header.setPreferredSize(small);
		add(header);

		rbRed = new JRadioButton("Red");
		rbRed.setPreferredSize(small);
		add(rbRed);

		rbGreen = new JRadioButton("Green");
		rbGreen.setPreferredSize(small);
		add(rbGreen);

		rbBlue = new JRadioButton("Blue");
		rbBlue.setPreferredSize(small);
		add(rbBlue);

		rbRandom = new JRadioButton("Random");
		rbRandom.setPreferredSize(small);
		add(rbRandom);

		// Making a group enables only one button to be ch	ecked at a time
		ButtonGroup group = new ButtonGroup();

		group.add(rbRed);
		group.add(rbBlue);
		group.add(rbGreen);
		group.add(rbRandom);

		ColorListener listener = new ColorListener();
		rbRed.addActionListener(listener);
		rbGreen.addActionListener(listener);
		rbBlue.addActionListener(listener);
		rbRandom.addActionListener(listener);
	}

	private class ColorListener implements ActionListener {
		private Random rand = new Random();

		public void actionPerformed(ActionEvent e) {
			if (rbRed.isSelected() == true) {
				setBackground(Color.RED);
			} else if (rbGreen.isSelected() == true) {
				setBackground(Color.GREEN);
			} else if (rbBlue.isSelected() == true) {
				setBackground(Color.BLUE);
			} else if (rbRandom.isSelected() == true) {
				Color color = new Color(rand.nextInt(256), rand.nextInt(256),
						rand.nextInt(256));
				setBackground(color);
			}
		}

	}
}
