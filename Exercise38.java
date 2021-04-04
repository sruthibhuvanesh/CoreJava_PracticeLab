import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getFactors(n));
		sc.close();
	}

	//Get the factors of a number n
	static List<Integer> getFactors(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1 ; i <= n ; i++) {
			if(n % i == 0) {
				list.add(i);
			}
		}
		return list;
	}

}
