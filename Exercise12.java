import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		System.out.println(validateUserName(userName));
		sc.close();
	}
	
	//Checks if the username is valid
	static boolean validateUserName(String userName) {
		if((userName.length()>=12)&&(userName.endsWith("_job"))){
			return true;
		}else {
		return false;
		}
	}
}
