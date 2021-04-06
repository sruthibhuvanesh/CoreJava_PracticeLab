import java.util.Scanner;

public class Exercise40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		System.out.println(getSum(number));
		sc.close();

	}

	// Get the sum of digits on either sides of the decimal points in a double number
	static String getSum(double number) {
		String doubleValue = String.valueOf(number);
		String values[] = doubleValue.split("[.]");

		int leftValue = Integer.parseInt(values[0]);
		int rightValue = Integer.parseInt(values[1]);

		int sum1 = 0, sum2 = 0, r, n1, n2;
		n1 = leftValue;
		while (n1 != 0) {
			r = n1 % 10;
			sum1 = sum1 + r;
			n1 = n1 / 10;
		}

		n2 = rightValue;
		while (n2 != 0) {
			r = n2 % 10;
			sum2 = sum2 + r;
			n2 = n2 / 10;
		}

		String sumString = sum1 + ":" + sum2;
		return sumString;
	}
}
