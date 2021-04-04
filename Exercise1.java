import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(calculateSum(n));
	}
	
	//Calculate Sum
	static int calculateSum(int n) {
		int i,sum = 0;
		for(i = 1 ; i <= n ; i++) {
			if((i%3==0) || (i%5==0))
			sum = sum + i;
		}
		return sum;
	}

}
