import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		int aray[];
		aray = new int[20];

		aray[0] = 0;
		aray[1] = 1;
		for (k = 2; k <= n + 1; k++) {
			aray[k] = aray[k - 1] + aray[k - 2];
		}

		int arr[] = new int[aray.length];
		for (int i = 0; i < n; i++) {
			arr[i] = aray[i];
			
		}

		System.out.println(sumFactorial(arr, n));
		sc.close();
	}

	// Calculate sum
	static int factorial(int n1) {
		int f = 1;
		for (int i = 1; i <= n1; i++) {
			f *= i;
		}
		return f;
	}

	static int sumFactorial(int[] arr, int n1) {

		int s = 0;
		for (int i = 0; i < n1; i++) {
			s += factorial(arr[i]);
		}
		return s;
	}
}
