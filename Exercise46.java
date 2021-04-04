import java.util.Scanner;

public class Exercise46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String originalstring = sc.next();
		System.out.println(checkPalindrome(originalstring));
		sc.close();
	}
	
	//Check palindrome
	static boolean checkPalindrome(String originalstring) {
		StringBuffer sb = new StringBuffer(originalstring);
		String reversedstring = sb.reverse().toString();
		if (originalstring.equals(reversedstring)) {
			return true;
		} else {
			return false;
		}
	}
}
