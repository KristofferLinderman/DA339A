package laboration10;

public class Employee {
	private String name;
	private String employer;
	private int wage;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public void info() {
		System.out.println("Namn: " + name);
		System.out.println("Arbetar hos: " + employer);
		System.out.println("Lön: " + wage);
	}

}
