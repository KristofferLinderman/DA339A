package p3;

public class RPSController {
	private RPSPlayer computerPlayer;
	private RPSViewer viewer;
	private RPSUserInput input;

	private int userChoice;
	private int computerChoice;
	private int computerScore;
	private int userScore;

	private final int rock = 0;
	private final int paper = 1;
	private final int scissors = 2;

	public RPSController(RPSPlayer computerPlayer, RPSViewer viewer) {
		this.computerPlayer = computerPlayer;
		this.viewer = viewer;

		computerScore = 0;
		userScore = 0;
	}

	/**
	 * Sets the user input
	 * 
	 * @param input
	 *            - input to be set
	 */
	public void setUserInput(RPSUserInput input) {
		this.input = input;
	}

	/**
	 * Creates a new game and clears the score panel
	 */
	public void newGame() {
		// -1 clears the choice
		viewer.setUserChoice(" ");
		viewer.setComputerChoice(" ");
		viewer.setComputerScore(0);
		viewer.setUserScore(0);
		viewer.setTitle("First to three");

		computerScore = 0;
		userScore = 0;

		input.enableChoice();
	}

	/**
	 * Calculates the winner based on computer choice vs. user choice
	 */
	public void calculateWinner() {
		computerChoice = computerPlayer.newChoice();

		// Both players chooses the same
		if (computerChoice == userChoice) {
			setUserChoice();
			setComputerChoice();
		}// Computer chooses 0 = Rock
		else if (computerChoice == rock) {
			switch (userChoice) {
			case paper:
				userScore += 1;
				viewer.setUserScore(userScore);
				break;
			case scissors:
				computerScore += 1;
				viewer.setComputerScore(computerScore);
				break;
			}
		} // Computer chooses 1 = Paper
		else if (computerChoice == paper) {
			switch (userChoice) {
			case rock:
				computerScore += 1;
				viewer.setComputerScore(computerScore);
				break;
			case scissors:
				userScore += 1;
				viewer.setUserScore(userScore);
				break;
			}
		}// Computer chooses 2 = scissors
		else if (computerChoice == scissors) {
			switch (userChoice) {
			case rock:
				userScore += 1;
				viewer.setUserScore(userScore);
				break;
			case paper:
				computerScore += 1;
				viewer.setComputerScore(computerScore);
				break;
			}
		}
		setUserChoice();
		setComputerChoice();

		// Check if one player has reached 3 points
		if (maxScoreReached()) {
			input.disableChoice();

			if (getWinner() == 1) {
				viewer.setTitle("User is victorious");
			} else if (getWinner() == 0) {
				viewer.setTitle("Computer is victorious");
			}
		}
	}

	private void setUserChoice() {
		if (userChoice == 0) {
			viewer.setUserChoice("Rock");
		} else if (userChoice == 1) {
			viewer.setUserChoice("Paper");
		} else if (userChoice == 2) {
			viewer.setUserChoice("Scissor");
		}
	}


	private void setComputerChoice() {
		if (computerChoice == 0) {
			viewer.setComputerChoice("Rock");
		} else if (computerChoice == 1) {
			viewer.setComputerChoice("Paper");
		} else if (computerChoice == 2) {
			viewer.setComputerChoice("Scissor");
		}
	}

	/**
	 * Ends the game
	 */
	public void endGame() {
		System.exit(0);
	}

	/**
	 * Checks if any player has reached max score of 3
	 * 
	 * @return - true if score is reached else false
	 */
	private boolean maxScoreReached() {
		if (computerScore == 3 || userScore == 3) {
			return true;
		}
		return false;
	}

	/**
	 * returns the winner of the game
	 * 
	 * @return 1 if User has won 0 if computer has won
	 */
	private int getWinner() {
		if (computerScore < userScore) {
			return 1;
		}
		return 0;
	}

	/**
	 * Set the choice the user made 0 = Rock 1 = Paper 2 = Scissor
	 * 
	 * @param choice
	 *            - use choice
	 */
	public void setUserChoice(int choice) {
		userChoice = choice;
		calculateWinner();
	}
}
