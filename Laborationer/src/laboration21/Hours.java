package laboration21;

public class Hours extends Wage {

	private double hourlyWage;
	private double hours;

	public Hours(long id, double hourlyWage) {
		super(id);
		this.hourlyWage = hourlyWage;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double wage() {
		return hourlyWage * hours;
	}

	public static void main(String[] args) {
		Hours employee = new Hours(17233534, 95.0);
		employee.setHours(128);
		System.out.println(employee.toString());
		System.out.println("Anställd med id " + employee.getId()
				+ " har arbetat " + employee.getHours()
				+ " timmar till lönen " + employee.getHourlyWage() + " kr");
		employee.setHourlyWage(98.50);
		System.out.println("Lön denna månad: " + employee.wage() + " kr");
	}

}
