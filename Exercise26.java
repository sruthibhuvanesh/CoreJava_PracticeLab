import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> arrayList = new ArrayList<String>();
		int n = sc.nextInt();
		String words[] = new String[n];
		for(int i=0 ; i < n ; i++) {
			words[i] = sc.next();
			arrayList.add(words[i]);
		}
		String element = sc.next();
		sc.close();
		System.out.println(modifyElement(arrayList, element));
	}

	//Search for an element in the arrayList and modifies it
	static List<String> modifyElement(List<String> arrayList, String element) {
		if (arrayList.contains(element)) {
			String found; 
			if(element.length()%2==0) {
				found = element.substring(0, element.length() / 2);
			}else {
				found = element.substring(0, element.length() / 2+1);
			}
			
			int indexOfElement = arrayList.indexOf(element);
			arrayList.set(indexOfElement, found);
		}
		return arrayList;
	}
}
