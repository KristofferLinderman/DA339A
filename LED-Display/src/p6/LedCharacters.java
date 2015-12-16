package p6;

public enum LedCharacters {
	A(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	B(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	C(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } }),	
	D(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	E(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	F(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } });
								

	private int[][] character;

	private LedCharacters(int[][] character) {
		this.character = character;
	}

	public int[][] getCharacter() {
		return character;
	}

}
