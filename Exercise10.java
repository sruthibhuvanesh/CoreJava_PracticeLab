import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.println(modifyNumber(number1));
		sc.close();
	}

	// Accepts a number and modify it as per the requirement
	static int modifyNumber(int number1) {

		int difference = 0, result = 0;
		String modify = String.valueOf(number1);
		int len = modify.length();
		int[] storeDifference = new int[len];
		for (int i = 0; i < len; i++) {
			int n = Character.getNumericValue(modify.charAt(i));

			if (i == modify.length() - 1) {
				difference = Character.getNumericValue(modify.charAt(i));
			} else {
				int n1 = Character.getNumericValue(modify.charAt(i + 1));
				difference = n - n1;
				if (difference < 0) {
					difference = difference * (-1);
				}
			}
			storeDifference[i] = difference;
		}
		StringBuffer sb = new StringBuffer();

		for (int num : storeDifference) {
			sb.append(num);
		}

		result = Integer.parseInt(sb.toString());
		return result;
	}
}
