import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		String string1;
		String string2;
		for(int i = 0 ; i < n ; i++) {
			string1 = sc.next();
			list1.add(string1);
			string2 = sc.next();
			list2.add(string2);
		}
		System.out.println(removeElements(list1,list2));
		sc.close();
	}

	// Remove all the elements from a list other than the list of elements specified
	static List<String> removeElements(List<String> list1, List<String> list2) {
		list1.retainAll(list2);
		return list1;
	}

}
