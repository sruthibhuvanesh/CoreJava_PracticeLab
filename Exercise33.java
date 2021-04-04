import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String purchaseDate = sc.next();
		String sellingDate = sc.next();
		System.out.println(compareDates(purchaseDate, sellingDate));
		sc.close();
	}

	// Comparing the purchase date and selling date
	static boolean compareDates(String purchaseDate, String sellingDate) throws ParseException {
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(purchaseDate);
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sellingDate);
		if (date1.compareTo(date2) < 0) {
			return true;
		} else {
			return false;
		}
	}

}
