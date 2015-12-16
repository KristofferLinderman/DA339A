package laboration16;

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
	private Controller controller;
	private LabelPanel labelPanel;

	public ColorPanel() {
		setPreferredSize(new Dimension(250, 230));

		header.setPreferredSize(small);
		add(header);

		setRadioButtons();

		// Making a group enables only one button to be checked at a time
		makeButtonGroup();

		addColorListener();
	}

	public ColorPanel(Controller controller) {
		setPreferredSize(new Dimension(250, 230));
		this.controller = controller;

		header.setPreferredSize(small);
		add(header);

		setRadioButtons();

		// Making a group enables only one button to be checked at a time
		makeButtonGroup();

		addControllerColorListener();
	}

	public ColorPanel(LabelPanel labelPanel) {
		setPreferredSize(new Dimension(250, 230));
		this.labelPanel = labelPanel;

		header.setPreferredSize(small);
		add(header);

		setRadioButtons();

		// Making a group enables only one button to be checked at a time
		makeButtonGroup();

		addLabelColorListener();
	}

	private void makeButtonGroup() {
		ButtonGroup group = new ButtonGroup();

		group.add(rbRed);
		group.add(rbBlue);
		group.add(rbGreen);
		group.add(rbRandom);
	}

	public void setRadioButtons() {
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
	}

	private void addColorListener() {
		ColorListener listener = new ColorListener();
		rbRed.addActionListener(listener);
		rbGreen.addActionListener(listener);
		rbBlue.addActionListener(listener);
		rbRandom.addActionListener(listener);
	}

	private void addControllerColorListener() {
		ControllerColorListener listener = new ControllerColorListener();
		rbRed.addActionListener(listener);
		rbGreen.addActionListener(listener);
		rbBlue.addActionListener(listener);
		rbRandom.addActionListener(listener);
	}

	private void addLabelColorListener() {
		LabelColorListener listener = new LabelColorListener();
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

	private class ControllerColorListener implements ActionListener {
		private Random rand = new Random();

		public void actionPerformed(ActionEvent e) {
			if (rbRed.isSelected() == true) {
				controller.newColor(Color.RED);
				setBackground(Color.RED);
			} else if (rbGreen.isSelected() == true) {
				controller.newColor(Color.GREEN);
				setBackground(Color.GREEN);
			} else if (rbBlue.isSelected() == true) {
				controller.newColor(Color.BLUE);
				setBackground(Color.BLUE);
			} else if (rbRandom.isSelected() == true) {
				Color color = new Color(rand.nextInt(256), rand.nextInt(256),
						rand.nextInt(256));
				controller.newColor(color);
				setBackground(color);
			}
		}

	}

	private class LabelColorListener implements ActionListener {
		private Random rand = new Random();

		public void actionPerformed(ActionEvent e) {
			if (rbRed.isSelected() == true) {
				labelPanel.setColor(Color.RED);
				setBackground(Color.RED);
			} else if (rbGreen.isSelected() == true) {
				labelPanel.setColor(Color.GREEN);
				setBackground(Color.GREEN);
			} else if (rbBlue.isSelected() == true) {
				labelPanel.setColor(Color.BLUE);
				setBackground(Color.BLUE);
			} else if (rbRandom.isSelected() == true) {
				Color color = new Color(rand.nextInt(256), rand.nextInt(256),
						rand.nextInt(256));
				labelPanel.setColor(color);
				setBackground(color);
			}
		}

	}
}
