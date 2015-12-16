package p5;

public interface Dice {
    /*
     * Throws a dice and returns the value
     * @returns Value of the dice thrown
     **/
    public int throwDice();
    
    /*
     * Returnerar antalet sidor som tärningen har
     * @returns Antalet sidor på tärningen
     **/
    public int getSides();
}
