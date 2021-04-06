import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> branch1 = new ArrayList<String>();
		ArrayList<String> branch2 = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String employeename1 = sc.next();
			branch1.add(employeename1);
			String employeename2 = sc.next();
			branch2.add(employeename2);
		}
		String[] commonNames = getEmployees(branch1, branch2);
		for (int i = 0; i < n; i++) {
			if (commonNames[i]!=null) {
				System.out.println(commonNames[i]);
			}
		}
		sc.close();
	}

	// Get the names of employees working two different branches
	static String[] getEmployees(ArrayList<String> branch1, ArrayList<String> branch2) {
		branch1.retainAll(branch2);
		Collections.sort(branch1);
		int len = branch1.size() + branch2.size();
		String[] stringArray = branch1.toArray(new String[len]);
		return stringArray;
	}
}
