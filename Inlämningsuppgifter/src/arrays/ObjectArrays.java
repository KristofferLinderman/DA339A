package arrays;

public class ObjectArrays {

	/**
	 * Create a string form an array of objects
	 * 
	 * @param inputArray
	 *            - array to be in the string
	 * @return String of array
	 */
	public static String toString(Object[] array) {
		StringBuilder arrayString = new StringBuilder();
		arrayString.append("{ ");

		for (Object obj : array) {
			arrayString.append(obj.toString() + ",");
		}
		arrayString.deleteCharAt(arrayString.length() - 1);
		arrayString.append("}");
		return arrayString.toString();
	}

	/**
	 * Finds the index of specified object
	 * 
	 * @param array
	 *            - array to search
	 * @param object
	 *            - object to search for
	 * @return index of object or -1 if object doesn't exists
	 */
	public static int indexOf(Object[] array, Object object) {

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(object)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Search if the array contains specified object
	 * 
	 * @param array
	 *            - the array to search
	 * @param object
	 *            - object to find
	 * @return true if array contains object else false
	 */
	public static boolean member(Object[] array, Object object) {

		if (ObjectArrays.indexOf(array, object) >= 0) {
			return true;
		}
		return false;
	}

	/**
	 * Finds the max value of object using CompareTo
	 * 
	 * @param array
	 *            array to find max
	 * @return object with max value
	 */
	public static Object max(Object[] array) {

		Object max = array[0];
		Comparable<Object> comp;

		for (int i = 0; i < array.length; i++) {
			comp = (Comparable<Object>) array[i];

			if (comp.compareTo(max) > 0) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * Finds the min value of object using CompareTo
	 * 
	 * @param array
	 *            array to find min
	 * @return object with min value
	 */
	public static Object min(Object[] array) {

		Object min = array[0];
		Comparable<Object> comp;

		for (int i = 0; i < array.length; i++) {
			comp = (Comparable<Object>) array[i];

			if (comp.compareTo(min) < 0) {
				min = array[i];
			}
		}
		return min;
	}
}
