import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		char del1 = '|';
		char del2 = '-';
		System.out.println(getStates(data,del1,del2));
		sc.close();
	}
	
	// Accepts the states and capitals as a String and return a map
	static Map<String, String> getStates(String data, char del1, char del2) {
		Map<String, String> map = new HashMap<String, String>();

		String strarray[] = data.split("[-]");
		for ( String actualElement : strarray ) {
			String[] values = actualElement.split("[|]");
			
		    map.put(values[0],
		    		values[1]);
		}
		return map;
		
	}

}
