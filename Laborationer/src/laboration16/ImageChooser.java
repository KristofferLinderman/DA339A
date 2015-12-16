package laboration16;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ImageChooser extends JPanel {

	private JPanel radioButtonPanel;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private JRadioButton radioButton4;
	private JRadioButton radioButton5;
	private JButton delete;
	private Controller controller;
	private ButtonGroup radioGroup;

	public ImageChooser(Controller controller) {
		this.controller = controller;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(200, 150));

		radioButtonPanel = new JPanel(new GridLayout(5, 1));

		radioButton1 = new JRadioButton("London");
		radioButton2 = new JRadioButton("Lugi");
		radioButton3 = new JRadioButton("Movie");
		radioButton4 = new JRadioButton("Tandem");
		radioButton5 = new JRadioButton("Program");

		delete = new JButton("Delete");

		radioGroup = new ButtonGroup();

		radioGroup.add(radioButton1);
		radioGroup.add(radioButton2);
		radioGroup.add(radioButton3);
		radioGroup.add(radioButton4);
		radioGroup.add(radioButton5);

		radioButtonPanel.add(radioButton1);
		radioButtonPanel.add(radioButton2);
		radioButtonPanel.add(radioButton3);
		radioButtonPanel.add(radioButton4);
		radioButtonPanel.add(radioButton5);

		add(radioButtonPanel, BorderLayout.NORTH);
		add(delete, BorderLayout.CENTER);

		addListeners();
	}

	public void addListeners() {
		ImageListener imageListener = new ImageListener();
		radioButton1.addActionListener(imageListener);
		radioButton2.addActionListener(imageListener);
		radioButton3.addActionListener(imageListener);
		radioButton4.addActionListener(imageListener);
		radioButton5.addActionListener(imageListener);

		EraseListener eraseListener = new EraseListener();
		delete.addActionListener(eraseListener);
	}

	private class EraseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			controller.eraseImage();
		}
	}

	private class ImageListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (radioButton1.isSelected()
					&& controller.newImage("pictures/london06.jpg")) {
			} else if (radioButton2.isSelected()
					&& controller.newImage("pictures/lugi.gif")) {
			} else if (radioButton3.isSelected()
					&& controller.newImage("pictures/filmlogga.jpg")) {
			} else if (radioButton4.isSelected()
					&& controller.newImage("pictures/tandem1.jpg")) {
			} else if (radioButton5.isSelected()
					&& controller.newImage("pictures/program.bmp")) {
			} else {
				controller.eraseImage();
			}
		}
	}

}
