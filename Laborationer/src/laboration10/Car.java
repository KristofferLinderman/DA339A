package laboration10;

import javax.swing.JOptionPane;

public class Car {
	private String brand;
	private String model;
	private int horsepower;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setHorsepower(int hp) {
		this.horsepower = hp;
	}
	
	public void info(){
		JOptionPane.showMessageDialog(null, "Brand: " + brand + "\nModel: " + model + "\nHorsepower:" + horsepower);
	}

}
