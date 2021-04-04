import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		System.out.println(getImage(word));
	}
	
	//Generate the mirror image of a String and add it to the existing string
	static String getImage(String word) {
		StringBuffer sb = new StringBuffer(word);
		return word+"|"+sb.reverse().toString();
	}

}
