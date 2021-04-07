import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Exercise43 {

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
		System.out.println(getMaxSold(productDetails, salesDetails, rate, category));
		sc.close();
	}

	static List getMaxSold(HashMap<String, String> productDetails, HashMap<String, Integer> salesDetails, int rate,
			String category) {
		Set<Entry<String, String>> s = productDetails.entrySet();
		Set<Entry<String, Integer>> s1 = salesDetails.entrySet();
		Set<String> data = new HashSet<String>();

		String categoryName;
		for (Entry<String, String> it : s) {
			categoryName = it.getValue();
			data.add(categoryName);
			System.out.println("data" + data);
		}
		Entry<String, String> IteratedValues;
		Iterator<Entry<String, String>> iterator1 = s.iterator();
		while (iterator1.hasNext()) {
			IteratedValues = iterator1.next();
		}

		String firstElement = data.stream().findFirst().get();
		System.out.println(firstElement);
		
		String maxSaleProduct = null;

		Entry<String, Integer> eitr1Values;
		Iterator<Entry<String, String>> eitr1 = s.iterator();
		Iterator<Entry<String, Integer>> eitr2 = s1.iterator();
		while (eitr1.hasNext()) {
			while (eitr2.hasNext()) {
				eitr1Values = eitr2.next();
				System.out.println(eitr1.next());
				System.out.println(eitr1Values);

			}
		}
		
		String product = data.stream().findFirst().get();
		System.out.println(product);
		
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int maxSaleCount = sc.nextInt();
		for (Map.Entry<String, Integer> it : s1) {
			if(it.getValue() > maxSaleCount) {
				al.add(it.getKey());
			}
		}

		return al;
	}

}
