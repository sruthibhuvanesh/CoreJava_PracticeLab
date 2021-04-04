import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if (checkNumber(n)) {
			System.out.println(n + " is a power of 2");
		} else {
			System.out.println(n + " is not a power of 2");
		}
	}

	// Checks if the entered number is a power of two or not
	static boolean checkNumber(int n) {
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n == 1) {
			return true;
		} else {
			return false;
		}
	}
}