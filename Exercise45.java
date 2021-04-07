import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Exercise45 {

	public static void main(String[] args) {
		HashMap<String, String> productDetails = new HashMap<String, String>();
		HashMap<String, Integer> salesDetails = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String productName = null;
		String productCode = null;
		int price = 0;
		for (int i = 0; i < n; i++) {
			productName = sc.next();
			productCode = sc.next();
			price = sc.nextInt();

			productDetails.put(productName, productCode);
			salesDetails.put(productName, price);
		}
		int rate = sc.nextInt();
		String category = sc.next();
		System.out.println(updatePrices(productDetails, salesDetails, rate, category));
		sc.close();
	}

	// Get the number in words
	private static int updatePrices(HashMap<String, String> productDetails, HashMap<String, Integer> salesDetails,
			int rate, String category) {

		Set<HashMap<String, String>> set1 = new HashSet<HashMap<String, String>>();
		Set<HashMap<String, Integer>> set2 = new HashSet<HashMap<String, Integer>>();
		set1.add(productDetails);
		set2.add(salesDetails);
		Set<Entry<String, String>> s1 = productDetails.entrySet();
		Set<Entry<String, Integer>> s2 = salesDetails.entrySet();
		String productDetailsKey = null;
		String productDetailsValue;
		String salesDetailsKey;
		Integer salesDetailsValue;
		int total=0;
		String[] keyValue = new String[productDetails.size()];
		int count = 0;
		for (Entry<String, String> it : s1) {
			productDetailsValue = it.getValue();
			
			if (productDetailsValue.contains(category)) {
				count = count + 1;
				productDetailsKey = it.getKey();
			}

		}
		for (int i = 0; i < count; i++) {
			keyValue[i] = productDetailsKey;
			
		}
		for (Entry<String, Integer> it : s2) {
			salesDetailsKey = it.getKey();
			salesDetailsValue = it.getValue();

			
			for(int i = 0 ; i < count ; i++) {
				if(salesDetailsKey.contains(keyValue[i])) {
					int hike = 0,inc = 0;
					inc = hike + (int)(salesDetailsValue / 100)*rate;
					total = inc + salesDetailsValue;
			
				}
			}		
		}
		
		
		return total;
	}

}
