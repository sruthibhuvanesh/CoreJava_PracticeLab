import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(modifyStrings(s1,s2));
		sc.close();
	}

	static List modifyStrings(String s1, String s2) {
		 StringBuilder sb = new StringBuilder(s1);
		 String r;
		//1st Program

		 ArrayList<String> al = new ArrayList<String>();
		if(s1.length()%2==0) {
			
			
			r = s1.replaceAll(".(.)", s2 + "$1");
			
			al.add(r);
		}
		else
		{
	
			r = s1.replaceAll(".(.)", s2 + "$1");
			
			 al.add(r.substring(0, r.length()-1)+s2);
		}
	
		//2nd Program
		
		  int index = 0, count = 0;
	        while (true)
	        {
	            index = s1.indexOf(s2, index);
	            if (index != -1)
	            {
	                count ++;
	                index += s2.length();
	            }
	            else {
	                break;
	            }
	        }
	        if(count>1) {
	        	StringBuilder sb1=new StringBuilder(s1);
	        	String sr1 = sb1.reverse().toString();
	        	StringBuilder sb2=new StringBuilder(s2);
	        	String sr2 = sb2.reverse().toString();
				String replaceLastOccurence = sr1.replaceFirst(sr2, "");
				StringBuffer r1 = new StringBuffer(replaceLastOccurence);
				
				al.add(r1.reverse()+sr2);
	        }
	        else {
	        	
	        	al.add(s1+s2);
	        }
	        
		//3rd program
		
	        if(count>1) {

				String replaceFirstOccurence = s1.replaceFirst(s2, "");
				
				al.add(replaceFirstOccurence);
	        }
	        else
	        {
			
			al.add(s1);
	        }
	    
		//4th program
		if(s2.length()%2==0)
		{
			String s2substring1 = s2.substring(0, s2.length() / 2);
			String s2substring2 = s2.substring((s2.length() / 2), s2.length());
			
			al.add(s2substring1+s1+s2substring2);
		}
		else
		{
			String s2substring1 = s2.substring(0, ((s2.length() / 2)+1));
			String s2substring2 = s2.substring(((s2.length() / 2)+1), s2.length());
			
			al.add(s2substring1+s1+s2substring2);
		}	
		 
		//5th program
		char s1letters[] = s1.toCharArray();
		char s2letters[] = s2.toCharArray();

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1letters[i] == s2letters[j]) {
					s1letters[i] = '*';
				}
			}

		}
		
		String asterisk = String.valueOf(s1letters);
		al.add(asterisk);

		return al;
	}
}
