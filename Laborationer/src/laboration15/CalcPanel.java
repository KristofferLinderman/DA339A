package laboration15;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcPanel extends JPanel implements ActionListener {
	private JLabel lblNbr1 = new JLabel("Tal 1");
	private JLabel lblNbr2 = new JLabel("Tal 2");
	private JLabel lblResult = new JLabel("Result");
	private Font fontLabels = new Font("SansSerif", Font.PLAIN, 18);

	private JTextField tfNbr1 = new JTextField();
	private JTextField tfNbr2 = new JTextField();

	private JButton btnAdd = new JButton("+");
	private JButton btnSubtract = new JButton("-");
	private Font fontButtons = new Font("SansSerif", Font.PLAIN, 24);

	public CalcPanel() {
		setPreferredSize(new Dimension(250, 105));
		lblNbr1.setPreferredSize(new Dimension(100, 20));
		lblNbr1.setFont(fontLabels);
		add(lblNbr1);

		tfNbr1.setPreferredSize(new Dimension(100, 20));
		add(tfNbr1);

		lblNbr2.setPreferredSize(new Dimension(100, 20));
		lblNbr2.setFont(fontLabels);
		add(lblNbr2);

		tfNbr2.setPreferredSize(new Dimension(100, 20));
		add(tfNbr2);

		btnAdd.setPreferredSize(new Dimension(100, 20));
		btnAdd.setFont(fontButtons);
		add(btnAdd);

		btnSubtract.setPreferredSize(new Dimension(100, 20));
		btnSubtract.setFont(fontButtons);
		add(btnSubtract);

		lblResult.setPreferredSize(new Dimension(200, 20));
		lblResult.setFont(fontLabels);
		add(lblResult);

		btnAdd.addActionListener(this);
		btnSubtract.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double nbr1, nbr2;
		String nbr1Str, nbr2Str, res;
		nbr1Str = tfNbr1.getText();
		nbr2Str = tfNbr2.getText();
		nbr1 = Double.parseDouble(nbr1Str);
		nbr2 = Double.parseDouble(nbr2Str);
		if (e.getSource() == btnAdd) {
			res = nbr1Str + " + " + nbr2Str + " = " + (nbr1 + nbr2);
			lblResult.setText(res);
		} else if(e.getSource() == btnSubtract){
			res = nbr1Str + " - " + nbr2Str + " = " + (nbr1 - nbr2);
			lblResult.setText(res);
		}
	}

}
