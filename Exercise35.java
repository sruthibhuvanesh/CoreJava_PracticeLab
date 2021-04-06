import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise35 {

	public static void main(String[] args) {
		Map<String, Integer> englishFeedback = new HashMap<String, Integer>();
		Map<String, Integer> mathsFeedback = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String teacherName = sc.next();
			int feedback = sc.nextInt();
			englishFeedback.put(teacherName, feedback);
		}
		for (int i = 0; i < n; i++) {
			String teacherName = sc.next();
			int feedback = sc.nextInt();
			mathsFeedback.put(teacherName, feedback);
		}

		System.out.println(getConsolidateFeedback(englishFeedback, mathsFeedback));
		sc.close();
	}

	// Get the consolidated Feedback
	private static Map<String, Integer> getConsolidateFeedback(Map<String, Integer> englishFeedback,
			Map<String, Integer> mathsFeedback) {
		String key1 = null;
		String key2 = null;

		Set<Map.Entry<String, Integer>> set1 = englishFeedback.entrySet();
		Set<Map.Entry<String, Integer>> set2 = mathsFeedback.entrySet();

		for (Map.Entry<String, Integer> it : set1) {
			key1 = it.getKey();
		}

		for (Map.Entry<String, Integer> it : set2) {
			key2 = it.getKey();
		}

		int total = 0;
		if (key1.contains(key2)) {
			int english = englishFeedback.get(key1);
			int maths = mathsFeedback.get(key2);
			total = english + maths;
		}
		Map<String, Integer> consolidatedFeedback = new HashMap<String, Integer>();
		consolidatedFeedback.put(key1, total);
		return consolidatedFeedback;
	}

}
