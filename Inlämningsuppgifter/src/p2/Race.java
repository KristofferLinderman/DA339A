package p2;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class Race {
	private PaintWindow window;
	private Car car1;
	private Car car2;
	
	private int finishLine;
	private int realFinishLine;
	
	private Text textBlueCar;
	private Text textRedCar;
	private Text blueCar;
	private Text redCar;
	private Font progressFont;

	/**
	 * Assigns value to window, car1 and car2. Sets finish line to 500 and
	 * realFinishline to 500 - width of car icon.
	 * 
	 * @param window
	 *            - window to create a race in
	 * @param car1
	 *            - first car to race
	 * @param car2
	 *            - second car to race
	 */
	public Race(PaintWindow window, Car car1, Car car2) {
		this.window = window;
		this.car1 = car1;
		this.car2 = car2;
		finishLine = 500;
		
		// when the cars comes to the finish line
		realFinishLine = 500 - car1.getImage().getIconWidth();
	}

	/**
	 * Creates a race track and starts a race. Winner and distance left to
	 * finish line is printed in window
	 */
	public void action() {
		Text winner;

		Random rand = new Random();
		Font winnerFont = new Font(Font.SANS_SERIF, Font.BOLD, 25);
		progressFont = new Font(Font.MONOSPACED, Font.ITALIC, 30);

		initiateTrack();

		// executes as long as no car has made it to the finish line
		while (car1.getX() < realFinishLine && car2.getX() < realFinishLine) {

			// Moves car randomly (0-3) ahead
			car1.moveTo(car1.getX() + rand.nextInt(4), 150);
			car2.moveTo(car2.getX() + rand.nextInt(4), 230);

			window.showImage(car1.getImage(), car1.getX(), car1.getY());
			window.showImage(car2.getImage(), car2.getX(), car2.getY());
			
			//hide previous progress text
			window.hideImage(blueCar);
			window.hideImage(redCar);
			
			// creates new text objects to show progress
			blueCar = new Text(String.valueOf(realFinishLine - car1.getX()),
					progressFont, Color.BLACK, Color.BLUE);
			redCar = new Text(String.valueOf(realFinishLine - car2.getX()),
					progressFont, Color.BLACK, Color.RED);
			
			window.showImage(blueCar, 0, 0);
			window.showImage(redCar, 0, 30);

			PaintWindow.pause(10);
		}

		// Calculates the winner
		if (car1.getX() < car2.getX()) {
			winner = new Text("Red car won!", winnerFont);
		} else {
			winner = new Text("Blue car won!", winnerFont);
		}

		window.showImage(winner, 220, 100);

	}

	/**
	 * Initiates a track with green background and two gray tracks Places cars
	 * on track
	 */
	private void initiateTrack() {
		car1.moveTo(10, 150);
		car2.moveTo(10, 230);
		
		blueCar = new Text(String.valueOf(realFinishLine - car1.getX()),
				progressFont, Color.BLACK, Color.BLUE);
		redCar = new Text(String.valueOf(realFinishLine - car2.getX()),
				progressFont, Color.BLACK, Color.RED);

		// Show cars
		window.showImage(car1.getImage(), car1.getX(), car1.getY());
		window.showImage(car2.getImage(), car2.getX(), car2.getY());

		// Main background
		window.fillRect(0, 0, 600, 400, Color.GREEN);

		// tracks
		window.fillRect(5, 135, 570, 60, Color.GRAY);
		window.fillRect(5, 215, 570, 60, Color.GRAY);

		// finish line
		window.fillRect(finishLine, 100, 5, 200, Color.BLACK);

	}

}
