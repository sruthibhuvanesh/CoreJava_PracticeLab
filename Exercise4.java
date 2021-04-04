import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		if(number<10) {
			System.out.println(number+" is a single-digit number");
		}
		else if(checkNumber(number)) {
			System.out.println(number+" is an increasing number");
		}else {
			System.out.println(number+" is not an increasing number");
		}
	}

	//Check if a number is an increasing number
	static boolean checkNumber(int number) {
		boolean status = true ;
		String increasingnumber = String.valueOf(number);
		for(int i = 0 ; i < increasingnumber.length()-1 ; i++) {
			if(increasingnumber.charAt(i)<=increasingnumber.charAt(i+1)) {
				status = true ;
			}else{
				status = false ;
				break;
			}
		}
		return status;
	}

}
