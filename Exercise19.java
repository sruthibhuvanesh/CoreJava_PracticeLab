import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] originalArray = new int[n];
		for (int i = 0; i < n; i++) {
			originalArray[i] = sc.nextInt();
		}
		int[] modifiedArray = modifyArray(originalArray);
		for (int i = 0; i < modifiedArray.length; i++) {
			System.out.println(modifiedArray[i]);
		}
		sc.close();
	}

	// Remove duplicates
	static int[] modifyArray(int[] originalArray) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0 ; i < originalArray.length ; i++) {
			al.add(originalArray[i]);
		}
		Collections.sort(al);
		TreeSet<Integer> set = new TreeSet<Integer>(al);
        Set<Integer> reverseSet = set.descendingSet();
        int[] modifiedArray = new int[reverseSet.size()];
        int j = 0;
        for (Integer i: reverseSet) {
        	modifiedArray[j++] = i;
         }
        return modifiedArray;
	}
}