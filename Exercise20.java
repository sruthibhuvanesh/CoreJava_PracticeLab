import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char[] charArray = word.toCharArray();
		System.out.println(countCharacter(charArray));
		sc.close();
	}

	static Map<Character, Integer> countCharacter(char[] charArray) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		return map;
	}
}
