package p3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class RPSViewer extends JPanel {
	private JLabel computerScore;
	private JLabel computerChoice;
	private JLabel userScore;
	private JLabel userChoice;
	private JLabel mainTitle;

	private Font mainFont;

	private JPanel scorePanel;
	private JPanel userPanel;
	private JPanel computerPanel;

	public RPSViewer() {
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(375, 200));
		setBackground(Color.PINK);

		scorePanel = new JPanel(new BorderLayout());
		userPanel = new JPanel(new BorderLayout());
		computerPanel = new JPanel(new BorderLayout());

		mainFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);

		initiateComputerPanel();
		initiateUserPanel();

		initiateStatusLabel();

		scorePanel.add(computerPanel, BorderLayout.WEST);
		scorePanel.add(userPanel, BorderLayout.EAST);

		// Creates padding around the score panel
		scorePanel.setBorder(new EmptyBorder(40, 60, 30, 60));

		add(mainTitle, BorderLayout.NORTH);
		add(scorePanel, BorderLayout.CENTER);
	}

	/**
	 * creates and assigns font and text to the title/status bar
	 */
	private void initiateStatusLabel() {
		mainTitle = new JLabel("First to three");

		mainTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		mainTitle.setHorizontalAlignment(SwingConstants.CENTER); // Centers the
																	// text
		mainTitle.setBorder(BorderFactory.createSoftBevelBorder(
				BevelBorder.RAISED, Color.LIGHT_GRAY, Color.GRAY));// Centers
																	// bevel to
																	// the title
	}

	/**
	 * Create and initiates the computer panel
	 */
	private void initiateComputerPanel() {

		JLabel computerTitle = new JLabel("Computer");
		computerScore = new JLabel("Score: 0");
		computerChoice = new JLabel(" ");

		computerPanel.add(computerTitle, BorderLayout.NORTH);
		computerPanel.add(computerScore, BorderLayout.CENTER);
		computerPanel.add(computerChoice, BorderLayout.SOUTH);

		computerScore.setFont(mainFont);
		computerChoice.setFont(mainFont);
		computerTitle.setFont(mainFont);

		// Centers the text
		computerTitle.setHorizontalAlignment(SwingConstants.CENTER);
		computerScore.setHorizontalAlignment(SwingConstants.CENTER);
		computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
	}

	/**
	 * Create and initiates the user panel
	 */
	private void initiateUserPanel() {
		JLabel userTitle = new JLabel("User");
		userScore = new JLabel("Score: 0");
		userChoice = new JLabel(" ");

		userPanel.add(userTitle, BorderLayout.NORTH);
		userPanel.add(userScore, BorderLayout.CENTER);
		userPanel.add(userChoice, BorderLayout.SOUTH);

		userScore.setFont(mainFont);
		userChoice.setFont(mainFont);
		userTitle.setFont(mainFont);

		// Centers the text
		userTitle.setHorizontalAlignment(SwingConstants.CENTER);
		userScore.setHorizontalAlignment(SwingConstants.CENTER);
		userChoice.setHorizontalAlignment(SwingConstants.CENTER);
	}

	/**
	 * Set the score of the user
	 * 
	 * @param score
	 *            - user's score
	 */
	public void setUserScore(int score) {
		userScore.setText("Score: " + String.valueOf(score));
	}

	/**
	 * Set what choice the user made.
	 * 
	 * @param choice - the text to be displayed
	 */
	public void setUserChoice(String choice) {
		userChoice.setText(choice);
	}

	/**
	 * Set the score of the computer
	 * 
	 * @param score
	 *            - computer's score
	 */
	public void setComputerScore(int score) {
		computerScore.setText("Score: " + String.valueOf(score));
	}

	/**
	 * Set what choice the computer made.
	 * 
	 * @param choice - text to be set
	 */
	public void setComputerChoice(String choice) {
		computerChoice.setText(choice);

	}

	/**
	 * Change the title of the viewer
	 * 
	 * @param title
	 *            - String to be shown
	 */
	public void setTitle(String title) {
		mainTitle.setText(title);
	}
}
