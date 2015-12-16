package p5;

public class TestDice {
	private static int[] diceThrows;
	private static StringBuilder results;

	public static void test(Dice dice, int nbrOfThrows) {
		diceThrows = new int[dice.getSides()];
		results = new StringBuilder();

		for (int i = 0; i < nbrOfThrows; i++) {
			diceThrows[dice.throwDice() - 1]++;
		}

		for (int i = 0; i < diceThrows.length; i++) {
			results.append(i + ": \t" + diceThrows[i] + "\n");
		}

		System.out.println(results.toString());
	}

	public static void test(Player player, int nbrOfThrows) {
		if (player instanceof Cheater) {
			diceThrows = new int[((Cheater) player).getDice().getSides()];
			results = new StringBuilder();

			for (int i = 0; i < nbrOfThrows; i++) {
				diceThrows[player.throwDice() - 1]++;
			}

			for (int i = 0; i < diceThrows.length; i++) {
				results.append(i + ": \t" + diceThrows[i] + "\n");
			}

			System.out.println(results.toString());

		} else if (player instanceof OrdinaryPlayer) {
			diceThrows = new int[((OrdinaryPlayer) player).getDice().getSides()];
			results = new StringBuilder();

			for (int i = 0; i < nbrOfThrows; i++) {
				diceThrows[player.throwDice() - 1]++;
			}

			for (int i = 0; i < diceThrows.length; i++) {
				results.append(i + ": \t" + diceThrows[i] + "\n");
			}

			System.out.println(results.toString());
		}

	}

	public static void main(String[] args) {
		TestDice.test(new OrdinaryPlayer("Rut", new SimpleDice(6)), 1000000);
		System.out.println();
		TestDice.test(new Cheater("Fuffe", new SimpleDice(6)), 1000000);
	}
}
