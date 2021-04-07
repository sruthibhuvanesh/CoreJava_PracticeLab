import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] originalnumber = new int[n];
		for (int i = 0; i < n; i++) {
			originalnumber[i] = sc.nextInt();
		}
		System.out.println(getSorted(originalnumber));
		sc.close();
	}

	// Return the resulting array after reversing the numbers and sorting it
	static ArrayList<String> getSorted(int originalnumber[]) {
		int number;
		int reverse = 0, remainder = 0;
		int[] reverseArray = new int[originalnumber.length];
		ArrayList list = new ArrayList();

		for (int i = 0; i < originalnumber.length; i++) {
			number = originalnumber[i];
			while (number != 0) {
				remainder = number % 10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
			}
			reverseArray[i] = reverse;
			list.add(reverseArray[i]);
			reverse = 0;
		}

		for (int i = 0; i < reverseArray.length; i++) {

			// System.out.println(reverseNumber);
			Collections.sort(list);

		}
		return list;
	}
}