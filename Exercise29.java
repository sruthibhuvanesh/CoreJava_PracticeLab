import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
		int key = sc.nextInt();
		String value = sc.next();
		map.put(key, value);
		}
		System.out.println(getValues(map));
		sc.close();
	}
	
	// Get the values of a map in sorted order
	static List getValues(HashMap<Integer, String> map) {
		ArrayList al = new ArrayList();
		ArrayList list = new ArrayList();
		al.add(map);
		Collections.sort(al);
		return al;
	}
}
