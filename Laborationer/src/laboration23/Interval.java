package laboration23;

public class Interval implements WageFilter {
	private double min, max;

	public Interval(double min, double max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public boolean accept(WageEmployee employed) {
		double wage = employed.wage();
		return (wage > min && wage < max);
	}

}
