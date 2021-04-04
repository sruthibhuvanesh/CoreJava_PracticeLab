import java.util.Scanner;

public class Exercise37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		System.out.println(rearrangeCharacters(string));
		sc.close();
	}

	// Move all the lower case 'a' to the beginning of a String
	static String rearrangeCharacters(String string) {

		StringBuffer word = new StringBuffer();
		StringBuffer a = new StringBuffer();
		for (char c : string.toCharArray()) {
			if (c == 97) {
				a.append(c);
			}else {
				word.append(c);
			}
		}

		a.append(word.toString());
		return a.toString();
	}

}
