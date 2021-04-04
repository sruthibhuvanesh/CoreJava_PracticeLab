import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.println(checkPositive(string));
		sc.close();
	}

	// Checks if a String is positive
	static boolean checkPositive(String string) {
		int ascii = 0;
		int flag = 0;
		char[] stringarray = string.toCharArray();
		for (int i = 0; i < string.length() - 1; i++) {
			ascii = stringarray[i + 1] - stringarray[i];
			if (ascii < 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			return false;
		} else {
			return true;
		}

	}
}
