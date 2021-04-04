import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] elements = new String[n];
		for (int i = 0; i < n; i++) {
			elements[i] = sc.next();
		}
		System.out.println(getArrayList(elements));
		sc.close();
	}

	// Converts the String array to ArrayList and sorts it
	static String getArrayList(String[] elements) {
		String firstpart ;
		String secondpart;
		ArrayList<String> al = new ArrayList<String>();
		for(int i = 0 ; i < elements.length ; i++) {
			al.add(elements[i]);
		}
		Collections.sort(al);
		int length = al.size();
		if(length % 2 == 0) {
			firstpart = al.subList(0, length/2).toString().toUpperCase();
			secondpart = al.subList(length/2, length).toString().toLowerCase();
		} else {
			firstpart = al.subList(0, length/2+1).toString().toUpperCase();
			secondpart = al.subList(length/2+1, length).toString().toLowerCase();
		}
		String modifiedArray = (firstpart+secondpart);
		return modifiedArray;
	}
}
