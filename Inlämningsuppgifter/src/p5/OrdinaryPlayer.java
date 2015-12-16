package p5;

/**
 * OrdinaryPlayer is a Player that rolls a dice and has a name without cheating
 * 
 * @author Kristoffer
 *
 */
public class OrdinaryPlayer extends Player {
	private Dice dice;

	/**
	 * Creates a OrdinaryPlayer with specified name
	 * 
	 * @param name
	 *            name of player
	 */
	public OrdinaryPlayer(String name) {
		super(name);
		dice = new SimpleDice(6);
	}

	/**
	 * * Creates a OrdinaryPlayer with a specified name and dice
	 * 
	 * @param name
	 *            name of player
	 * @param dice
	 *            dice of the player
	 */
	public OrdinaryPlayer(String name, Dice dice) {
		super(name);
		this.dice = dice;
	}

	/**
	 * Set the players dice to a specified dice
	 * 
	 * @param dice
	 *            the dice to bet set
	 */
	public void setDice(Dice dice) {
		this.dice = dice;
	}

	/**
	 * Returns the players dice
	 * 
	 * @return the players dice
	 */
	public Dice getDice() {
		return dice;
	}

	@Override
	/**
	 * Throws a dice and returns the value
	 * @returns Value of the dice thrown
	 **/
	public int throwDice() {
		return dice.throwDice();
	}

}
