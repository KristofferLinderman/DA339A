package laboration16;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SurveyPanel extends JPanel {
	private JPanel pnlNorth;
	private JPanel pnlNorthNorth;
	private JPanel pnlNorthCenter;
	private JPanel pnlAge;
	private JPanel pnlHobby;
	private JButton btnSummary;
	private JTextArea taSummary;
	private JLabel lblName;
	private JTextField tfName;
	private JRadioButton rb0_17;
	private JRadioButton rb18_64;
	private JRadioButton rb65;
	private ButtonGroup buttonGroup;
	private JCheckBox cbTrack;
	private JCheckBox cbDance;
	private JCheckBox cbBirds;
	private JCheckBox cbBridge;
	private JCheckBox cbChoir;
	private JCheckBox cbSkiing;

	public SurveyPanel() {
		pnlNorth = new JPanel(new BorderLayout());
		pnlNorthNorth = new JPanel(new BorderLayout());
		pnlNorthCenter = new JPanel(new GridLayout(1, 2));
		pnlAge = new JPanel(new GridLayout(6, 1));
		pnlHobby = new JPanel(new GridLayout(6, 1));

		taSummary = new JTextArea();

		btnSummary = new JButton("Summary");

		tfName = new JTextField();

		lblName = new JLabel("Name: ");

		buttonGroup = new ButtonGroup();

		rb0_17 = new JRadioButton(" 0 - 17");
		rb18_64 = new JRadioButton("18- 64");
		rb65 = new JRadioButton("65 -");

		cbTrack = new JCheckBox("Track anf field");
		cbDance = new JCheckBox("Dance");
		cbBirds = new JCheckBox("Bird watching");
		cbBridge = new JCheckBox("Bridge");
		cbChoir = new JCheckBox("Choir");
		cbSkiing = new JCheckBox("Skiing");

		buttonGroup.add(rb0_17);
		buttonGroup.add(rb18_64);
		buttonGroup.add(rb65);

		setPreferredSize(new Dimension(300, 600));
		setLayout(new BorderLayout());

		pnlNorthNorth.add(lblName, BorderLayout.WEST);
		pnlNorthNorth.add(tfName, BorderLayout.CENTER);

		// Age panel
		pnlNorthCenter.add(pnlAge);
		pnlAge.setBorder(BorderFactory.createTitledBorder("Age"));
		pnlAge.add(rb0_17);
		pnlAge.add(rb18_64);
		pnlAge.add(rb65);
		rb65.setSelected(true);

		pnlNorthCenter.add(pnlHobby);
		pnlHobby.setBorder(BorderFactory.createTitledBorder("Interests"));
		pnlHobby.add(cbTrack);
		pnlHobby.add(cbDance);
		pnlHobby.add(cbBirds);
		pnlHobby.add(cbBridge);
		pnlHobby.add(cbChoir);
		pnlHobby.add(cbSkiing);

		pnlNorth.add(pnlNorthNorth, BorderLayout.NORTH);
		pnlNorth.add(pnlNorthCenter, BorderLayout.CENTER);

		pnlNorth.add(btnSummary, BorderLayout.SOUTH);
		btnSummary.addActionListener(new SummaryListener());

		add(pnlNorth, BorderLayout.NORTH);
		add(taSummary, BorderLayout.CENTER);
	}

	public void summary() {
		String res = tfName.getText() + "\n";

		if (rb0_17.isSelected()) {
			res += "Age: " + "0 - 17 years\n";
		} else if (rb18_64.isSelected()) {
			res += "Age: " + "18 - 64 years\n";
		} else if (rb65.isSelected()) {
			res += "Age: " + "65+ years\n";
		}

		// Adds interests

		res += "Interests: ";
		if (cbTrack.isSelected()) {
			res += " Track and field";
		}
		if (cbDance.isSelected()) {
			res += " Dance";
		}
		if (cbBirds.isSelected()) {
			res += " Bird watching";
		}
		if (cbBridge.isSelected()) {
			res += " Bridge";
		}
		if (cbChoir.isSelected()) {
			res += " Choir";
		}
		if(cbSkiing.isSelected()){
			res+= " Skiing";
		}
		res += "\n";
		// Show the summary in the text area
		taSummary.setText(res);

	}

	private class SummaryListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			summary();
		}
	}

}
