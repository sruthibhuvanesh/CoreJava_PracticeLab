import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		String str1;
		String str2;
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			str1 = sc.next();
			list1.add(str1);
			str2 = sc.next();
			list2.add(str2);
		}

		char[] merge_list = mergeData(list1, list2);
		for (char i : merge_list) {
			System.out.print(i);
		}
		sc.close();
	}

	// Merge two arraylist , sort it and return the result as an integer array
	static char[] mergeData(List<String> list1, List<String> list2) {
		list1.addAll(list2);
		Collections.sort(list1);
		char[] merge_list = list1.toString().toCharArray();
		return merge_list;
	}

}
