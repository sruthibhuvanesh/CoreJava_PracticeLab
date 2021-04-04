import java.util.*;

public class Exercise14 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String str1 = sc.next();
			list1.add(str1);
			String str2 = sc.next();
			list2.add(str2);
		}
		System.out.println(removeElements(list1, list2));
		sc.close();
	}

	static List<String> removeElements(List<String> list1, List<String> list2) {
		list1.removeAll(list2);
		return list1;
	}
}
