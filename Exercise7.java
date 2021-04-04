import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		System.out.println(alterString(word));
		sc.close();
	}

	// Replace consonants
	static String alterString(String word) {
		char consonants[] = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			if ((consonants[i] == 'A') || (consonants[i] == 'a') || (consonants[i] == 'E') || (consonants[i] == 'e')
					|| (consonants[i] == 'I') || (consonants[i] == 'i') || (consonants[i] == 'O')
					|| (consonants[i] == 'o') || (consonants[i] == 'U') || (consonants[i] == 'u')) {
				continue;
			} else {
				consonants[i] = (char) (consonants[i] + 1);
			}
		}
		String replaceConsonants = String.valueOf(consonants);
		return replaceConsonants;

	}
}
