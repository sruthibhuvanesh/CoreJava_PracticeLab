import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0 ; i < n ; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(getSquares(numbers));
		sc.close();

	}

	static Map<Integer, Integer> getSquares(int[] numbers) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < numbers.length ; i++) {
			al.add(numbers[i]);
		}
		
		for(int i = 0 ; i < numbers.length ; i++) {
			int key = al.get(i);
			int value = key * key;
			map.put(key, value);
		}
		return map;
		
	}
}
