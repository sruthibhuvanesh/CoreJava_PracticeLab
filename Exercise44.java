import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(getNumber(number));
		sc.close();
	}

	// Get the number in words
	static String getNumber(int number) {
		String original_number = Integer.toString(number);
		char value;
		int val = 0;
		String words = "";
		for (int i = 0; i < original_number.length(); i++) {
			value = original_number.charAt(i);
			String number_in_words = null;
			val = Character.getNumericValue(value);
			switch (val) {
			case 0:
				number_in_words = "Zero";
				break;
			case 1:
				number_in_words = "One";
				break;
			case 2:
				number_in_words = "Two";
				break;
			case 3:
				number_in_words = "Three";
				break;
			case 4:
				number_in_words = "Four";
				break;
			case 5:
				number_in_words = "Five";
				break;
			case 6:
				number_in_words = "Six";
				break;
			case 7:
				number_in_words = "Seven";
				break;
			case 8:
				number_in_words = "Eight";
				break;
			case 9:
				number_in_words = "Nine";
				break;
			default:
				break;
			}
			StringBuffer sb = new StringBuffer(words);
			words = sb.append(number_in_words).toString() + " ";
		}
		return words;
	}

}
