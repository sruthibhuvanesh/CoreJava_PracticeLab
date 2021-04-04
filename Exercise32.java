import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.println(encryptString(string));
		sc.close();

	}

	static String encryptString(String string) {
		String encryptedword = null;
		char[] charArray = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			charArray[i] = (char) (charArray[i] + 9);
			if ((int) (charArray[i]) >= 122) {
				charArray[i] = (char) (charArray[i] - 26); 
			}
			encryptedword = String.valueOf(charArray);
		}
		return encryptedword;
	}

}
