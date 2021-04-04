import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n]; 
		for(int i = 0; i < n ; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(getSecondSmallest(array));

	}

	// Get the second smallest element in the array
	static int getSecondSmallest(int array[]) {
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		for(int i = 0; i < array.length ; i++) {
			al.add(array[i]);
		}
			Collections.sort(al);
			Integer secondSmallest = al.get(1);
		return secondSmallest;  		
	}
}
