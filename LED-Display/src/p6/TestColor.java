package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A GUI for testing {@link Array7x7} and the moveLeft/moveRight method.
 * 
 * @author Kristoffer Linderman and Pierre Lejdbring
 *
 */
public class TestColor extends JPanel {

	private JPanel btnPanel;
	private JButton pushLeft, pushRight;
	private ColorDisplay colorDisplay;
	private Array7x7 a7x7;
	private final Dimension buttonSize = new Dimension(100, 50);
	private final Dimension screenSize = new Dimension(800, 600);

	/**
	 * Constructor that creates a JPanel consisting of inner panels.
	 * 
	 */
	public TestColor() {
		setLayout(new BorderLayout());
		setPreferredSize(screenSize);

		a7x7 = new Array7x7(LedCharacters.A.getCharacter());

		initaiatePanels();
		addButtons();

		colorDisplay.setDisplay(a7x7.getMatrix());

		add(colorDisplay, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
	}

	/**
	 * Initiates all of the panels.
	 */
	private void initaiatePanels() {
		colorDisplay = new ColorDisplay(Color.BLACK, Color.RED);
		btnPanel = new JPanel(new FlowLayout());
	}

	/**
	 * Adds two buttons and set their size and assigns listeners.
	 */
	private void addButtons() {
		ButtonListener listener = new ButtonListener();

		pushLeft = new JButton("Left");
		pushRight = new JButton("Right");

		pushLeft.setPreferredSize(buttonSize);
		pushRight.setPreferredSize(buttonSize);

		pushLeft.addActionListener(listener);
		pushRight.addActionListener(listener);

		btnPanel.add(pushLeft);
		btnPanel.add(pushRight);
	}

	/**
	 * A class that extends ActionListeners and shifts the Array7x7 left and
	 * right based on input.
	 * 
	 * @author Kristoffer Linderman and Pierre Lejdbring.
	 *
	 */
	private class ButtonListener implements ActionListener {

		@Override
		/**
		 * Pushes the Array7x7 right of left depending on button pressed.
		 * The column that gets pushed out is shown in the left/right TextFields
		 */
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == pushLeft) {

				int[] tempColor = { Color.BLUE, Color.RED, Color.BLUE,
						Color.RED, Color.RED, Color.RED, Color.RED };

				Array7 a7 = new Array7(tempColor);
				a7x7.moveLeft(a7);
				colorDisplay.setDisplay(a7x7.getMatrix());
				colorDisplay.updateDisplay();

			} else if (e.getSource() == pushRight) {

				int[] tempColor2 = { Color.RED, Color.RED, Color.RED,
						Color.RED, Color.RED, Color.RED, Color.BLACK };

				Array7 a7 = new Array7(tempColor2);
				a7x7.moveRight(a7);
				colorDisplay.setDisplay(a7x7.getMatrix());
				colorDisplay.updateDisplay();
			}
		}

	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		TestColor pusher = new TestColor();
		frame.add(pusher);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.pack();
	}

}
