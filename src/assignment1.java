import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter some value :");
		int n = input.nextInt();

		int sum = suming(n);

		System.out.println("the sum of the values will be " + sum);
	}

	public static int suming(int n) {
		int sum1 = 0;
		for (int i = 1; i < n; i++) {
			sum1 = sum1 + i;
		}
		return sum1;
	}
}
