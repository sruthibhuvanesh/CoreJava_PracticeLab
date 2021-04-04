import java.util.*;

public class Exercise36 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getPrimeSum(n));
		sc.close();
	}

	// Get the sum of first n prime numbers
	static int getPrimeSum(int n) {
		int i = 1, j, sum = 0;
		while (n != 0) {
			int count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				sum = sum + i;
				n--;
			}
			i++;
		}
		return sum;
	}
}