import java.util.Scanner;

public class Exercise27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(findSum(number));
		sc.close();
	}

	//Find the sum of first n even numbers that are divisible by 3 and 8
	static int findSum(int number) {
		int sum = 0;
		for(int i = 0; i < number ; i++) {
			if(i%2==0) {
				if((i%3==0)&&(i%8==0)) {
					sum = sum + i ;
				}
			}
		}
		return sum;
	}
}
