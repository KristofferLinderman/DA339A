package p6;

import java.util.Arrays;

/**
 * 
 * @author Johan & Erik
 *
 */
public class Array7 {
	private int[] a7;

	/**
	 * Creates an empty array
	 */

	public Array7() {
		a7 = new int[7];
	}

	/**
	 * Cerates a new Array7 based on given array.
	 * @param inputArray array to be used in creation.
	 */
	public Array7(int[] inputArray) {
		a7 = new int[7];
		
		for(int i = 0; i < 7; i++){
			a7[i] = inputArray[i];
		}
	}

	/**
	 * The element in the array gets the value of the variable value in the
	 * position pos
	 * 
	 * @param pos
	 * @param value
	 */

	public void setElement(int pos, int value) {
		a7[pos] = value;
	}

	/**
	 * Returns the element at position pos
	 * 
	 * @param pos
	 * @return
	 */

	public int getElement(int pos) {
		return a7[pos];
	}
}
