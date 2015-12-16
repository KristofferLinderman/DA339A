package laboration10;

import javax.swing.JOptionPane;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();

		car.setBrand(JOptionPane
				.showInputDialog("Please write the brand of your car"));
		car.setModel(JOptionPane
				.showInputDialog("Please write the model of your car"));
		car.setHorsepower(Integer.parseInt(JOptionPane
				.showInputDialog("Please write the amount of horsepower in your car")));
		car.info();
		
	}
}
