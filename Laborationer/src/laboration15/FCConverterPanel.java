package laboration15;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FCConverterPanel extends JPanel implements ActionListener {

	private JLabel degree = new JLabel("Grader");
	private JLabel result = new JLabel("Resultat");
	private JLabel resDegree = new JLabel(" ");

	private JTextField tfInput = new JTextField();

	private JButton btnCToF = new JButton("To Farenheit");
	private JButton btnFToC = new JButton("To Celsius");
	private JButton btnExit = new JButton("Exit");

	private Dimension small = new Dimension(100, 20);
	private Dimension big = new Dimension(200, 20);

	public FCConverterPanel() {
		setPreferredSize(new Dimension(275, 150));
		degree.setPreferredSize(small);
		add(degree);

		tfInput.setPreferredSize(small);
		add(tfInput);

		result.setPreferredSize(small);
		add(result);

		resDegree.setPreferredSize(small);
		add(resDegree);

		btnFToC.setPreferredSize(small);
		add(btnFToC);

		btnCToF.setPreferredSize(small);
		add(btnCToF);
		
		btnExit.setPreferredSize(big);
		add(btnExit);
		
		btnFToC.addActionListener(this);
		btnCToF.addActionListener(this);
		btnExit.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double input;
		double res;
		String result;
		input = Double.parseDouble(tfInput.getText());

		if (e.getSource() == btnCToF) {
			res = ((input - 32) / 1.8);
			result = String.format("%1.1f", res);
			resDegree.setText(result);

		} else if (e.getSource() == btnFToC) {
			res = 32 + 1.8 * input;
			result = String.format("%1.1f", res);
			resDegree.setText(result);
		} else if (e.getSource() == btnExit) {
			System.exit(0);
		}
	}
}
