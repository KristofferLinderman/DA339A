package laboration23;

public class Between17000And21000 implements WageFilter {

	@Override
	public boolean accept(WageEmployee employed) {
		double wage = employed.wage();
		return (wage < 21000 && wage > 17000);
	}

}
