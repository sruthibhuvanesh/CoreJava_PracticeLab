import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		int id = sc.nextInt();
		String name = sc.next();
		map.put(id, name);
		System.out.println(checkPerfectCouple(map));
		sc.close();
	}

	static List<String> checkPerfectCouple(HashMap<Integer, String> map) {
		map.get(map);
		int key;
		
		String value = null;
		ArrayList list = new ArrayList();
		for (HashMap.Entry<Integer,String> entry : map.entrySet()) {
			key = entry.getKey();
			value = entry.getValue();
		}
		String strarray[] = value.split("[-]");
		for(int i = 0; i<strarray.length-1 ;i++) {
			char[] ch1 = strarray[i].toCharArray();
			char[] ch2 = strarray[i+1].toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1,ch2)) {
				list.add(strarray[i]);
				list.add(strarray[i+1]);
				break;
			}
		}
		
		return list;
	}
}
