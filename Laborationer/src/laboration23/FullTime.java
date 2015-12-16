package laboration23;

public class FullTime extends WageEmployee {
    private double wage;
    
    public FullTime( long id, double wage ) {
        super( id ); // Anropa konstruktorn WageEmployee( long )
        this.wage = wage;
    }
    
    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public double wage() {
        return this.wage;
    }
}
