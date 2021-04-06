import java.util.Arrays;
import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println(changeString(string, ch));
		sc.close();
	}

	// Modify the string based on user choice
	static String changeString(String string, char ch) {
		String finalresult = "";
		int choice = Character.getNumericValue(ch);
		switch (choice) {
		case 1: {
			String addstring = string.concat(string);
			finalresult = addstring;
			break;
		}
		case 2: {
			char symbol = '*';
			char alternatecharacter[] = string.toCharArray();
			for (int i = 0; i < string.length(); i++) {
				if (i % 2 == 0) {
					alternatecharacter[i] = symbol;
				} else {
					continue;
				}
			}
			String symbolString = String.valueOf(alternatecharacter);
			finalresult = symbolString;
			break;
		}
		case 3: {
			char alternatecharacter[] = string.toCharArray();
			int index = 0;
			for (int i = 0; i < alternatecharacter.length; i++) {
				int j;
				for (j = 0; j < i; j++) {
					if (alternatecharacter[i] == alternatecharacter[j]) {
						break;
					}
				}
				if (j == i) {
					alternatecharacter[index++] = alternatecharacter[i];
				}
			}
			String duplicate = String.valueOf(Arrays.copyOf(alternatecharacter, index));
			finalresult = duplicate;
			break;
		}
		case 4: {
			char[] upper = string.toCharArray();
			for (int i = 0; i < string.length(); i++) {
				if (i % 2 != 0) {
					upper[i] = Character.toUpperCase(string.charAt(i));
				} else {
					continue;
				}
			}

			String UpperCaseString = String.valueOf(upper);
			finalresult = UpperCaseString;
			break;
		}
		}
		return finalresult;
	}
}
