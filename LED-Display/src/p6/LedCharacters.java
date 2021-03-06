package p6;

public enum LedCharacters {
	A(new int[][] {
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	B(new int[][] {
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 0,0 } }),
	C(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),	
	D(new int[][] {
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 0,0 } }),
	E(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 } }),
	F(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 } }),
	G(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	H(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	I(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 } }),
	J(new int[][] {
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	K(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 1, 0,0 },
			{0, 1, 0, 1, 0, 0,0 },
			{0, 1, 1, 0, 0, 0,0 },
			{0, 1, 0, 1, 0, 0,0 },
			{0, 1, 0, 0, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	L(new int[][] {
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 } }),
	M(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 0, 1, 1,0 },
			{0, 1, 0, 1, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	N(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 0, 0, 1,0 },
			{0, 1, 1, 0, 0, 1,0 },
			{0, 1, 0, 1, 0, 1,0 },
			{0, 1, 0, 0, 1, 1,0 },
			{0, 1, 0, 0, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	O(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	P(new int[][] {
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 } }),
	Q(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 1, 1,0 },
			{0, 0, 1, 1, 1, 1,0 } }),
	R(new int[][] {
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	S(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 0, 1, 1, 1, 0,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	T(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	U(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	V(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	W(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 1, 0, 1,0 },
			{0, 1, 1, 0, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	X(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 } }),
	Y(new int[][] {
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	Z(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 } }),
	ZERO(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 1, 1,0 },
			{0, 1, 0, 1, 0, 1,0 },
			{0, 1, 1, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	ONE(new int[][] {
			{0, 0, 1, 1, 0, 0,0 },
			{0, 1, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	TWO(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 } }),
	THREE(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0,1, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 1, 1,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 1, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	FOUR(new int[][] {
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 1, 0,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 1, 0,0 } }),
	FIVE(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	SIX(new int[][] {
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	SEVEN(new int[][] {
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 } }),
	EIGHT(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 } }),
	NINE(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 } }),
	SPACE(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	PLUS(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	MINUS(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	ASTERISK(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 0, 1, 0, 1,0 },
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 1, 0, 1,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	SLASH(new int[][] {               
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 } }),
	EXCLAMATION(new int[][] {
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	QUESTIONMARK(new int[][] {
			{0, 0, 1, 1, 1, 0,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 1, 0, 0, 0, 1,0 },
			{0, 0, 0, 1, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	COMMA(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	DOT(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	EQUALS(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	BACKSLASH(new int[][] {
			{0, 1, 0, 0, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 0, 1,0 } }),
	LPARENTHESIS(new int[][] {
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	RPARENTHESIS(new int[][] {
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 } }),
	LESSERTHAN(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 1, 0, 0, 0, 0,0 },
			{0, 0, 1, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	GREATERTHAN(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 0, 0, 1,0 },
			{0, 0, 0, 0, 1, 0,0 },
			{0, 0, 0, 1, 0, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } }),
	HASHTAG(new int[][] {
			{0, 0, 0, 0, 0, 0,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 1, 1, 1, 1, 1,0 },
			{0, 0, 1, 0, 1, 0,0 },
			{0, 0, 0, 0, 0, 0,0 } });
	

	private int[][] character;

	private LedCharacters(int[][] character) {
		this.character = character;
	}

	public int[][] getCharacter() {
		return character;
	}

}
