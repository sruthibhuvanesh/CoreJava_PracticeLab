import java.util.Scanner;

public class Exercise39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(getFormats(number));
		sc.close();
	}

	// Gets the binary,hexadecimal and octal formats of a number
	static String getFormats(int number) {
		String binary = Integer.toBinaryString(number);
		String octal = Integer.toOctalString(number);
		String hexadecimal = Integer.toHexString(number);
		  String format = binary+" "+octal+" "+hexadecimal;
		return format;
	}
}
