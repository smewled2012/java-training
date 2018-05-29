
public class minMax {

	public static void main(String[] args) {
		// read two numbers and return the maximum one.

		int[] array = { 2, 10, 20, 5, 15, 6 };
		int min1 = minimum(array);
		int max1 = maximum(array);
		int avg1 = average(array);

		System.out.println("the minumum number from the list " + min1);
		System.out.println("the average value of the list will be:  " + avg1);
		System.out.println("the maximum value from the list will be:  " + max1);

	}

	public static int minimum(int[] n) {
		int min1 = n[0];
		for (int i = 1; i < n.length; i++) {
			if (n[i] < min1) {
				min1 = n[i];
			}

		}
		return min1;
	}

	public static int average(int[] b) {
		int sum1 = 0;
		for (int j = 0; j < b.length; j++) {
			sum1 += b[j];
		}
		return (sum1 / b.length);
	}

	public static int maximum(int[] m) {
		int max2 = m[0];
		for (int i = 1; i < m.length; i++) {
			if (m[i] > max2) {
				max2 = m[i];
			}

		}
		return max2;
	}
}