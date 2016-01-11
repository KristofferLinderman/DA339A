package p6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A GUI for testing {@link Array7x7} and the moveLeft/moveRight method.
 * 
 * @author Kristoffer Linderman and Pierre Lejdbring
 *
 */
@SuppressWarnings("serial")
public class Ikarus extends JPanel {

	private JPanel btnPanel;
	private JButton pushLeft, pushRight, setText;
	private ColorDisplay colorDisplay;
	private int background, foreground;
	private Array7x7 a7x7, nextA7x7;
	private HashMap<String, int[][]> charHash;
	private String input;
	private Array7x7[] array7x7buffer;
	private final Dimension buttonSize = new Dimension(100, 50);
	private final Dimension screenSize = new Dimension(800, 800);
	private int index = 0;
	private int stringIndex = 2;
	private Timer timer;

	/**
	 * Constructor that creates a JPanel consisting of inner panels.
	 * 
	 */
	public Ikarus() {
		setLayout(new BorderLayout());
		setPreferredSize(screenSize);

		background = Color.BLACK;
		foreground = Color.RED;

		input = new String("ABC");
		charHash = new HashMap<>();
		timer = new Timer();

		initaiatePanels();
		addButtons();
		addCharsToHash();
		readFromInput();

		for (Array7x7 arr : array7x7buffer) {
			arr.print();
		}

		int[][] temp = charHash.get(String.valueOf(input.charAt(0)));
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(temp[i][j]);
			}
			System.out.println("");
		}

		System.out.println(array7x7buffer[0].toString());
		System.out.println(array7x7buffer[1].toString());
		System.out.println(array7x7buffer[2].toString());

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
		setText = new JButton("Set Text");

		pushLeft.setPreferredSize(buttonSize);
		pushRight.setPreferredSize(buttonSize);
		setText.setPreferredSize(buttonSize);

		pushLeft.addActionListener(listener);
		pushRight.addActionListener(listener);
		setText.addActionListener(listener);

		btnPanel.add(pushLeft);
		btnPanel.add(pushRight);
		btnPanel.add(setText);
	}

	/**
	 * Adds all of the characters in LedCharacters to the HashMap charHash
	 */
	private void addCharsToHash() {
		for (LedCharacters character : LedCharacters.values()) {
			charHash.put(character.name(), character.getCharacter());
		}
	}

	/**
	 * Reads the characters in the input into an array with buffered Arra7x7
	 * objects.
	 */
	private void readFromInput() {
		if (input.length() > 2) {

			array7x7buffer = new Array7x7[input.length()];
			input.toUpperCase();
			String temp;

			for (int i = 0; i < array7x7buffer.length; i++) {
				temp = String.valueOf(input.charAt(i));
				array7x7buffer[i] = new Array7x7(convertBinary(charHash.get(temp)));
			}

			nextA7x7 = array7x7buffer[1];
		}

		a7x7 = new Array7x7(convertBinary(charHash.get(String.valueOf(input.charAt(0)))));
		;
	}

	/**
	 * Converts a matrix of 0,1 to a matrix with colors.
	 * 
	 * @param color
	 *            the matrix to convert into color values
	 * @return the matrix with color elements
	 */
	private int[][] convertBinary(int[][] color) {
		int[][] res = new int[7][7];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (color[i][j] == 0) {
					res[i][j] = background;
				} else {
					res[i][j] = foreground;
				}
			}
		}
		return res;
	}

	/**
	 * Set the color of the background
	 * 
	 * @param color
	 *            of the background
	 */
	public void setBackgroundColor(int color) {
		background = color;
	}

	/**
	 * Set the color of the foreground
	 * 
	 * @param color
	 *            of the foreground
	 */
	public void setForegroundColor(int color) {
		foreground = color;
	}

	public class ToDo extends TimerTask {
		public void run() {
			Array7 a7 = nextA7x7.getCol(index);
			a7x7.moveLeft(a7);
			colorDisplay.setDisplay(a7x7.getMatrix());
			colorDisplay.updateDisplay();

			if (index == 6) {
				if (stringIndex == input.length()) {
					stringIndex = 0;
				}

				index = 0;
				nextA7x7 = array7x7buffer[stringIndex];

				stringIndex++;
			}

			index++;
		}
	}

	/**
	 * A class that extends ActionListeners and shifts the Array7x7 left and
	 * right based on input.
	 * 
	 * @author Kristoffer Linderman.
	 *
	 */
	private class ButtonListener implements ActionListener {

		@Override
		/**
		 * Pushes the Array7x7 right of left depending on button pressed. The
		 * column that gets pushed out is shown in the left/right TextFields
		 */
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == pushLeft) {

				Array7 a7 = nextA7x7.getCol(index);
				a7x7.moveLeft(a7);
				colorDisplay.setDisplay(a7x7.getMatrix());
				colorDisplay.updateDisplay();

				if (index == 6) {
					if (stringIndex == input.length()) {
						stringIndex = 0;
					}

					index = 0;
					nextA7x7 = array7x7buffer[stringIndex];

					stringIndex++;
				}

				index++;
			} else if (e.getSource() == pushRight) {
			} else if (e.getSource() == setText) {
				input = JOptionPane.showInputDialog("Enter message to display");
				readFromInput();
				timer.schedule(new ToDo(), 100,500);
			}
		}
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		Ikarus pusher = new Ikarus();
		frame.add(pusher);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.pack();
	}
}
