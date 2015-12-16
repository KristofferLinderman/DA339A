package laboration15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TransportPanel extends JPanel {
	private JLabel question = new JLabel("How do you get to school?");
	private JLabel choice = new JLabel("");

	private JCheckBox car = new JCheckBox("Car");
	private JCheckBox train = new JCheckBox("Train");
	private JCheckBox bus = new JCheckBox("Bus");
	private JCheckBox bike = new JCheckBox("Bike");
	private JCheckBox walk = new JCheckBox("Walk");

	private Dimension small = new Dimension(70, 10);
	private Dimension text = new Dimension(360, 20);
	private Dimension chosenText = new Dimension(400, 20);

	public TransportPanel() {
		setPreferredSize(new Dimension(400, 80));
		setBackground(Color.cyan);

		question.setPreferredSize(text);
		add(question);

		car.setPreferredSize(small);
		add(car);

		train.setPreferredSize(small);
		add(train);

		bus.setPreferredSize(small);
		add(bus);

		bike.setPreferredSize(small);
		add(bike);

		walk.setPreferredSize(small);
		add(walk);

		choice.setPreferredSize(chosenText);
		add(choice);

		TransportListener chosen = new TransportListener();
		car.addItemListener(chosen);
		train.addItemListener(chosen);
		bus.addItemListener(chosen);
		walk.addItemListener(chosen);
		bike.addItemListener(chosen);
	}

	private class TransportListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			String res = "You have chosen: ";
			if (car.isSelected()) {
				res += "Car ";
			}
			if (train.isSelected()) {
				res += "Train ";
			}
			if (bus.isSelected()) {
				res += "Bus ";
			}
			if (bike.isSelected()) {
				res += "Bike ";
			}
			if (walk.isSelected()) {
				res += "Walk";
			}
			choice.setText(res);
		}
	}
	// private class TransportListener implements ItemListener {
	// private StringBuilder selections = new StringBuilder();
	//
	// public TransportChooser() {
	// selections.append("You have chosen: ");
	// choice.setText(selections.toString());
	// }

	// @Override
	// public void itemStateChanged(ItemEvent arg0) {
	// selections.delete(17, selections.length());
	//
	// if (car.isSelected()) {
	// selections.append("Car ");
	// }
	// if (train.isSelected()) {
	// selections.append("Train ");
	// }
	// if (bus.isSelected()) {
	// selections.append("Bus ");
	// }
	// if (bike.isSelected()) {
	// selections.append("Bike ");
	// }
	// if (walk.isSelected()) {
	// selections.append("Walk ");
	// }
	// choice.setText(selections.toString());
	// }
	// }
}
