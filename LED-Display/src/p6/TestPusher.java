package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A GUI for testing {@link Array7x7} and the moveLeft/moveRight method.
 * 
 * @author Kristoffer Linderman and Pierre Lejdbring
 *
 */
public class TestPusher extends JPanel {

	private JPanel leftGrid, rightGrid, btnPanel, matrixPanel;
	private JButton pushLeft, pushRight;
	private JLabel[][] matrix;
	private JTextField[] leftTextField, rightTextField;
	private Array7x7 a7x7;
	final private Dimension buttonSize = new Dimension(100, 50);
	final private Dimension screenSize = new Dimension(800, 600);

	/**
	 * Cunstructor that creates a JPanel consisting of inner panels.
	 * 
	 */
	public TestPusher() {
		setLayout(new BorderLayout());
		setPreferredSize(screenSize);

		a7x7 = new Array7x7();
		leftTextField = new JTextField[7];
		rightTextField = new JTextField[7];

		initaiatePanels();
		createMatrix();
		addTextFields();
		addButtons();
		setsize();

		add(leftGrid, BorderLayout.WEST);
		add(rightGrid, BorderLayout.EAST);
		add(matrixPanel, BorderLayout.CENTER);
		add(btnPanel, BorderLayout.SOUTH);
	}

	/**
	 * Initiates all of the panels.
	 */
	private void initaiatePanels() {
		leftGrid = new JPanel(new GridLayout(7, 1));
		rightGrid = new JPanel(new GridLayout(7, 1));
		matrixPanel = new JPanel(new GridLayout(7, 7));
		matrix = new JLabel[7][7];
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
	 * Sets the size of the left/right JPanels
	 */
	private void setsize() {
		leftGrid.setPreferredSize(new Dimension(100, 600));
		rightGrid.setPreferredSize(new Dimension(100, 600));
	}

	/**
	 * Adds JTexFields in both the left/right TextField array and in the
	 * left/right JPanels.
	 */
	private void addTextFields() {
		for (int i = 0; i < 7; i++) {
			leftTextField[i] = new JTextField();
			leftGrid.add(leftTextField[i]);
		}
		for (int i = 0; i < 7; i++) {
			rightTextField[i] = new JTextField();
			rightGrid.add(rightTextField[i]);
		}
	}

	/**
	 * Creates new JLabels in matrix and adds them to matrixPanel
	 */
	private void createMatrix() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				matrix[i][j] = new JLabel("0");
				matrixPanel.add(matrix[i][j]);
			}
		}
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
				shiftLeft();
				updateView();
			} else if (e.getSource() == pushRight) {
				shiftRight();
				updateView();
			}
		}

		/**
		 * Updates the matrix to show the modified {@link Array7x7}
		 */
		private void updateView() {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					matrix[i][j].setText(String.valueOf(a7x7.getElement(i, j)));
				}
			}
		}

		/**
		 * Shifts the data in the right JTextField panel in to the main
		 * {@link Array7x7} and displays the column that got pushed out. Then
		 * clears the right JTextField panel
		 */
		private void shiftLeft() {
			Array7 a7Right = new Array7();

			for (int i = 0; i < 7; i++) {
				int value = Integer.parseInt((rightTextField[i].getText()));
				a7Right.setElement(i, value);
			}

			Array7 a7Left = a7x7.moveLeft(a7Right);

			for (int i = 0; i < 7; i++) {
				leftTextField[i].setText("" + a7Left.getElement(i));
			}

			clearSidePanel(rightTextField, rightGrid);
		}

		/**
		 * Shifts the data in the left JTextField panel in to the main
		 * {@link Array7x7} and displays the column that got pushed out. Then
		 * clears the left JTextField panel
		 */
		private void shiftRight() {
			Array7 a7Left = new Array7();

			for (int i = 0; i < 7; i++) {
				int value = Integer.parseInt((leftTextField[i].getText()));
				a7Left.setElement(i, value);
			}

			Array7 a7Right = a7x7.moveRight(a7Left);

			for (int i = 0; i < 7; i++) {
				rightTextField[i].setText("" + a7Right.getElement(i));
			}

			clearSidePanel(leftTextField, leftGrid);
		}

		/**
		 * Clears the specified JTextField and JPanel
		 * 
		 * @param sideText
		 *            JTextField to be cleared
		 * @param sidePanel
		 *            the JPanel to be cleared
		 */
		private void clearSidePanel(JTextField[] sideText, JPanel sidePanel) {
			for (int i = 0; i < 7; i++) {
				sideText[i].setText("");
				sidePanel.add(sideText[i]);
			}
		}

	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		TestPusher pusher = new TestPusher();
		frame.add(pusher);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.pack();
	}

}
