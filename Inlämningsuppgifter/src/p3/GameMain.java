package p3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameMain {

	public static void main(String[] args) {
		RPSPlayer player = new RPSPlayer();
		RPSViewer viewer = new RPSViewer();
		RPSController controller = new RPSController(player, viewer);
		RPSUserInput userInput = new RPSUserInput(controller);

		JFrame frame1 = new JFrame("Score Board");
		frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame1.add(viewer);
		frame1.pack();
		frame1.setVisible(true);
		frame1.setResizable(true);
		frame1.setLocation(150, 100);
		
		JFrame frame2 = new JFrame("Input Panel");
		frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame2.add(userInput);
		frame2.pack();
		frame2.setVisible(true);
		frame2.setResizable(true);
		frame2.setLocation(150, 330);
	}
}
