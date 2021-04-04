import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		System.out.println(findSum(digit));
		sc.close();
	}

	// Find the sum cubes of the digit of an n digit number 
	static int findSum(int digit) {
		int sum = 0;
		int remainder;    
		  while(digit>0){    
		   remainder = digit%10;  
		   sum = sum + (remainder*remainder*remainder);    
		   digit = digit/10;    
		  }   
		return sum;
	}

}
