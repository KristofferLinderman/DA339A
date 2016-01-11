package p6;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 
 * @author Johan & Erik
 *
 */
public class Array7x7 {
	private int[][] a7x7;

	public Array7x7() {
		a7x7 = new int[7][7];
	}

	public Array7x7(int[][] inputMatrix) {

		a7x7 = new int[7][7];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				a7x7[i][j] = inputMatrix[i][j];
			}
		}
	}

	/**
	 * The value in the array at row and col get the value of the variable value
	 * 
	 * @param row
	 * @param col
	 * @param value
	 */

	public void setElement(int row, int col, int value) {
		a7x7[row][col] = value;
	}

	/**
	 * Returns the value at row & col
	 * 
	 * @param row
	 * @param col
	 * @return
	 */

	public int getElement(int row, int col) {
		return a7x7[row][col];
	}

	/**
	 * The value at row gets the same value as array theRow
	 * 
	 * @param row
	 * @param theRow
	 */

	public void setRow(int row, Array7 theRow) {
		for (int i = 0; i < 7; i++) {
			a7x7[row][i] = theRow.getElement(i);
		}
	}

	/**
	 * Returns the values of row in an Array7
	 * 
	 * @param row
	 * @return
	 */

	public Array7 getRow(int row) {
		Array7 temp = new Array7();
		for (int i = 0; i < 7; i++) {
			temp.setElement(i, a7x7[row][i]);
		}
		return temp;
	}

	/**
	 * The value at col gets the same value as array theCol
	 * 
	 * @param col
	 * @param theCol
	 */

	public void setCol(int col, Array7 theCol) {
		for (int i = 0; i < 7; i++) {
			a7x7[i][col] = theCol.getElement(i);
		}
	}

	/**
	 * Returns the value of col in an Array7
	 * 
	 * @param col
	 * @return
	 */

	public Array7 getCol(int col) {
		Array7 temp = new Array7();
		for (int i = 0; i < 7; i++) {
			temp.setElement(i, a7x7[i][col]);
		}
		return temp;
	}

	/**
	 * 
	 * @param inputCol
	 * @return
	 * @author Kristoffer Linderman and Pierre Lejdbring
	 */
	public Array7 moveLeft(Array7 inputCol) {

		Array7 res = this.getCol(0);

		for (int i = 0; i < a7x7[1].length - 1; i++) {
			this.setCol(i, this.getCol(i + 1));
		}

		this.setCol(a7x7[1].length - 1, inputCol);

		return res;
	}

	/**
	 * 
	 * @param inputCol
	 * @return
	 * @author Kristoffer Linderman and Pierre Lejdbring
	 */
	public Array7 moveRight(Array7 inputCol) {

		Array7 res = this.getCol(a7x7[1].length - 1);

		for (int i = a7x7[1].length - 1; i > 0; i--) {
			this.setCol(i, this.getCol(i - 1));
		}

		this.setCol(0, inputCol);

		return res;
	}

	/**
	 * Returns the Matrix of the Array7x7
	 * 
	 * @return the matrix
	 * @author Kristoffer Linderman and Pierre Lejdbring
	 */
	public int[][] getMatrix() {
		return a7x7;
	}

	public void print() {
		for (int row[] : a7x7) {
			for (int elem : row) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
