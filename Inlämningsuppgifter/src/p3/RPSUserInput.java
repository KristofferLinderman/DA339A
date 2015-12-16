package p3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class RPSUserInput extends JPanel {
	private JPanel selectionPanel;

	private JButton rock;
	private JButton paper;
	private JButton scissors;
	private JButton newGame;
	private JButton exit;

	private Dimension selectionButtonSize;

	private RPSController controller;

	private ButtonListener buttonListener;

	private final int rockValue = 0;
	private final int paperValue = 1;
	private final int scissorValue = 2;

	public RPSUserInput(RPSController controller) {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(375, 110));
		// Sends this UserInput as the UserInput in the controller.
		controller.setUserInput(this);

		this.controller = controller;
		selectionPanel = new JPanel(new BorderLayout());
		buttonListener = new ButtonListener();

		selectionButtonSize = new Dimension(125, 30);

		// User's three choice buttons
		initiateChoiceButtons();
		addButtonsToPanel();

		// New game and Exit button
		newGame = new JButton("New Game");
		newGame.addActionListener(buttonListener);

		exit = new JButton("Exit");
		exit.addActionListener(buttonListener);

		add(selectionPanel, BorderLayout.NORTH);
		add(newGame, BorderLayout.CENTER);
		add(exit, BorderLayout.SOUTH);

	}

	/**
	 * Adds the three choice buttons to the panel and set border title
	 */
	private void addButtonsToPanel() {
		selectionPanel.add(rock, BorderLayout.WEST);
		selectionPanel.add(paper, BorderLayout.CENTER);
		selectionPanel.add(scissors, BorderLayout.EAST);

		// Adds a border with given text
		selectionPanel.setBorder(BorderFactory
				.createTitledBorder("Choose wisely. . ."));
	}

	/**
	 * Assigns value to the three choice buttons and adds ActionListeners
	 */
	private void initiateChoiceButtons() {
		rock = new JButton("Rock");
		rock.setPreferredSize(selectionButtonSize);
		paper = new JButton("Paper");
		paper.setPreferredSize(selectionButtonSize);
		scissors = new JButton("Scissors");
		scissors.setPreferredSize(selectionButtonSize);

		addButtonListener();
	}

	/**
	 * Disables the three choice buttons
	 */
	public void disableChoice() {
		// Disable the buttons, dimming them
		rock.setEnabled(false);
		paper.setEnabled(false);
		scissors.setEnabled(false);
	}

	/**
	 * Enables the three choice buttons
	 */
	public void enableChoice() {
		// Enable the buttons, lighting them up
		rock.setEnabled(true);
		paper.setEnabled(true);
		scissors.setEnabled(true);
	}

	/**
	 * Assigns ActionListeners to the buttons
	 */
	private void addButtonListener() {
		rock.addActionListener(buttonListener);
		paper.addActionListener(buttonListener);
		scissors.addActionListener(buttonListener);
	}

	/**
	 * 
	 * @author Kristoffer
	 *
	 *         A listener for the buttons in RPS game
	 */
	private class ButtonListener implements ActionListener {
		@Override
		/**
		 * Check what button was pressed and does appropriate action
		 */
		public void actionPerformed(ActionEvent buttonPressed) {
			if (buttonPressed.getSource() == rock) {
				controller.setUserChoice(rockValue);
			} else if (buttonPressed.getSource() == paper) {
				controller.setUserChoice(paperValue);
			} else if (buttonPressed.getSource() == scissors) {
				controller.setUserChoice(scissorValue);
			} else if (buttonPressed.getSource() == newGame) {
				controller.newGame();
			} else if (buttonPressed.getSource() == exit) {
				controller.endGame();
			}
		}
	}
}
