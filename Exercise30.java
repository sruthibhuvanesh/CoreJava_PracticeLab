import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		System.out.println(validateCode(code));
		sc.close();
	}

	// Validate the entered code as per the given validation rules
	static boolean validateCode(String code) {
		int flag = 0;
		int uppercase_count = 0;
		int lower_count = 0;
		int digit_count = 0;
		if ((code.length() == 6) && (code.startsWith("COD"))) {
			char[] ch = code.toCharArray();
			for (int i = 0; i < code.length(); i++) {

				if (Character.isUpperCase(ch[0])) {
					flag = 1;

				} else {
					flag = 0;
					break;
				}
				if (Character.isDigit(ch[i])) {
					flag = 1;
					digit_count = digit_count + 1;

				}
				if (Character.isLetterOrDigit(ch[i])) {
					flag = 1;

				} else {
					flag = 0;
					break;
				}

				if (Character.isAlphabetic(ch[i])) {
					if (Character.isUpperCase(ch[i])) {
						uppercase_count = uppercase_count + 1;

					} else if (Character.isLowerCase(ch[i])) {
						lower_count = lower_count + 1;

					} else {
						flag = 0;
						break;
					}
					if (uppercase_count > lower_count) {
						flag = 1;

					} else {
						flag = 0;
						break;
					}
				}
			}
		}

		if ((flag == 1) && (digit_count != 0)) {
			return true;
		} else {
			return false;
		}
	}
}
