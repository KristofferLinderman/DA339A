/**
 * 
 */
package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * A GUI which should be used for testing {@link Array7x7}.
 * 
 * @author Elias Schulze
 *
 */
public class TestGUI extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	/**
	 * The array7x7 object that contains the matrix values.
	 */
	Array7x7 matrix;

	/**
	 * A two-dimensional array of labels that is our view of the matrix.
	 */
	JLabel[][] matrixView = new JLabel[7][7];

	/**
	 * This is the gridLayout that contains all the labels that makes up the
	 * matrix.
	 */
	JPanel matrixPanel = new JPanel();

	/**
	 * This panel is placed in the BorderLayout.CENTER of the testGUI main
	 * panel, so that the center of the main borderLayout contains another
	 * borderlayout. This is to make the IO line up with the matrix labels more
	 * nicely.
	 */
	JPanel centerWrap = new JPanel();

	// Sidebar Components
	JPanel sideBar = new JPanel();
	JButton readRow = new JButton("Read row");
	JButton writeRow = new JButton("Write row");
	JTextField rowNumber = new JTextField();
	JButton readColumn = new JButton("Read column");
	JButton writeColumn = new JButton("Write Column");
	JTextField columnNumber = new JTextField();

	/**
	 * These are the textfields that acts as IO for reading and writing rows.
	 */
	JTextField[] rowIOFields = new JTextField[7];

	/**
	 * This panel contains the textfields that acts as IO for rows.
	 */
	JPanel rowIOPanel = new JPanel();

	/**
	 * These are the textfields that acts as IO for reading and writing columns.
	 */
	JTextField[] columnIOFields = new JTextField[7];

	/**
	 * This panel contains the textfields that acts as IO for columns.
	 */
	JPanel columnIOPanel = new JPanel();

	/**
	 * Constructs the GUI.
	 * 
	 * @param matrix
	 *            The {@link Array7x7} object that will be used by this GUI.
	 */
	public TestGUI(Array7x7 matrix) {
		this.matrix = matrix;

		setLayout(new BorderLayout());

		// centerWrap init
		centerWrap.setLayout(new BorderLayout());
		centerWrap.setPreferredSize(new Dimension(200, 200));

		// matrix panels & labels init
		matrixPanel.setLayout(new GridLayout(7, 7));

		// One at a time, initialize the labels in matrixView and add
		// them label to the matrixPanel.
		for (int labelRow = 0; labelRow < matrixView.length; labelRow++) {
			for (int rowCol = 0; rowCol < matrixView[labelRow].length; rowCol++) {
				JLabel labelInit = new JLabel("0");
				matrixView[labelRow][rowCol] = labelInit;
				matrixPanel.add(labelInit);
			}
		}
		centerWrap.add(matrixPanel, BorderLayout.CENTER);

		// Sidebar setup
		sideBar.setLayout(new GridLayout(6, 1));
		sideBar.add(readRow);
		readRow.addActionListener(this);
		sideBar.add(writeRow);
		writeRow.addActionListener(this);
		rowNumber.setHorizontalAlignment(JTextField.CENTER);
		sideBar.add(rowNumber);
		sideBar.add(readColumn);
		readColumn.addActionListener(this);
		sideBar.add(writeColumn);
		writeColumn.addActionListener(this);
		columnNumber.setHorizontalAlignment(JTextField.CENTER);
		sideBar.add(columnNumber);
		add(sideBar, BorderLayout.EAST);

		rowTextFieldsInit();
		centerWrap.add(rowIOPanel, BorderLayout.SOUTH);

		columnTextFieldsInit();
		centerWrap.add(columnIOPanel, BorderLayout.WEST);

		add(centerWrap);
	}

	/**
	 * Initialize rowIOFields.
	 */
	private void rowTextFieldsInit() {
		rowIOPanel.setLayout(new GridLayout(1, 7));
		for (int i = 0; i < rowIOFields.length; i++) {
			JTextField tfRow = new JTextField();
			tfRow.setHorizontalAlignment(JTextField.CENTER);
			rowIOFields[i] = tfRow;
			rowIOPanel.add(tfRow);
		}
	}

	/**
	 * Initialize columnIOFields.
	 */
	private void columnTextFieldsInit() {
		columnIOPanel.setLayout(new GridLayout(7, 1));
		for (int i = 0; i < columnIOFields.length; i++) {
			JTextField tfColumn = new JTextField(3);
			tfColumn.setHorizontalAlignment(JTextField.CENTER);
			columnIOFields[i] = tfColumn;
			columnIOPanel.add(tfColumn);
		}
	}

	/**
	 * Loops through the labels in the {@code matrixView} and sets the current
	 * label to the value of the corresponding index in the {@code matrix}.
	 * Since the {@code matrix} and {@code matrixView} are the same size (7x7),
	 * they map perfectly to each other.
	 */
	public void updateMatrixView() {
		for (int i = 0; i < matrixView.length; i++) {
			for (int k = 0; k < matrixView[i].length; k++) {
				matrixView[i][k]
						.setText(String.valueOf(matrix.getElement(i, k)));
			}
		}
	}

	/**
	 * @return The integers currently in the rowIOFields as an integer array.
	 */
	private int[] getRowIO() {
		int[] outputArray = new int[rowIOFields.length];

		for (int col = 0; col < rowIOFields.length; col++) {
			outputArray[col] = Integer.parseInt(rowIOFields[col].getText());
		}

		return outputArray;
	}

	/**
	 * Sets the rowIOFields to be the same as the specified matrix row.
	 * Essentially copies a row in the matrix into the rowIOFields.
	 * 
	 * @param matrixRow
	 */
	private void setRowIO(int matrixRow) {
		for (int col = 0; col < rowIOFields.length; col++) {
			rowIOFields[col].setText(String.valueOf(matrix.getElement(
					matrixRow, col)));
		}
	}

	/**
	 * @return The integers currently in the columnIOFields as an integer array.
	 */
	private int[] getColumnIO() {
		int[] outputArray = new int[7];

		for (int i = 0; i < columnIOFields.length; i++) {
			outputArray[i] = Integer.parseInt(columnIOFields[i].getText());
		}

		return outputArray;
	}

	/**
	 * Sets the columnIOFields to be the same as the specified matrix column.
	 * Essentially copies a column in the matrix into the columnIOFields.
	 * 
	 * @param matrixRow
	 */
	private void setColumnIO(int column) {
		for (int i = 0; i < columnIOFields.length; i++) {
			columnIOFields[i].setText(String.valueOf(matrix.getElement(i,
					column)));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == writeRow) {
			int row = Integer.parseInt(rowNumber.getText());

			/*
			 * Makes an Array7 object out of whats currently in the row IO. Inte
			 * s�ker p� om detta beh�vs, men setRow() i Array7x7 skulle ta en
			 * Array7 som parameter enligt beskrivningen.
			 */
			Array7 IORow = new Array7(getRowIO());

			matrix.setRow(row, IORow);
			updateMatrixView();
		} else if (e.getSource() == readRow) {
			int row = Integer.parseInt(rowNumber.getText());
			setRowIO(row);
		} else if (e.getSource() == writeColumn) {
			int column = Integer.parseInt(columnNumber.getText());

			// Samma som ovan.
			Array7 IOColumn = new Array7(getColumnIO());

			matrix.setCol(column, IOColumn);
			updateMatrixView();
		} else if (e.getSource() == readColumn) {
			int column = Integer.parseInt(columnNumber.getText());
			setColumnIO(column);
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("TestGUI");
		frame.add(new TestGUI(new Array7x7()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setVisible(true);
	}
}
