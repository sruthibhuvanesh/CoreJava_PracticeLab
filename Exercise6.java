import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		Integer registration_number = sc.nextInt();
		Integer mark = sc.nextInt();
		sc.close();
		hashmap.put(registration_number, mark);
		System.out.println(getStudents(hashmap));
	}

	// Generate the list of students eligible for scholarship
	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hashmap) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String medalType;
		for (Entry<Integer, Integer> entry : hashmap.entrySet()) {
			Integer key = entry.getKey();
			Integer marks = entry.getValue();
			if (marks >= 90) {
				medalType = "Gold";
				map.put(key, medalType);
			} else if ((marks >= 80) && (marks < 90)) {
				medalType = "Silver";
				map.put(key, medalType);
			} else if ((marks >= 70) && (marks < 80)) {
				medalType = "Bronze";
				map.put(key, medalType);
			} else {
				medalType = "Not eligible for medal";
				map.put(key, medalType);
			}
			
		}
		return map;
	}
}
