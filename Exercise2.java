import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(calculateDifference(n));

	}
	
	// Calculate the difference
	static int calculateDifference(int n) {
		int sumofsquare = 0, squareofsum = 0;
		for(int i = 1 ; i <= n ; i++) {
			sumofsquare = sumofsquare + (i*i) ;
			squareofsum = squareofsum + i;
		}
		squareofsum = squareofsum * squareofsum;
		int sum = sumofsquare - squareofsum;
		return sum;
	}

}
