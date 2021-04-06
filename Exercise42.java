import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Exercise42 {

	static String returnDate;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println(getDate(choice));
		sc.close();
	}

	// Format the entered date in the specified formats
	static String getDate(int choice) {

		switch (choice) {
		case 1:
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
			Date date = new Date();
			returnDate = formatter.format(date);
			break;
		case 2:
			SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMM-yy");
			Date date1 = new Date();
			returnDate = formatter1.format(date1);
			break;
		case 3:
			SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
			Date date2 = new Date();
			returnDate = formatter2.format(date2);
			break;
		case 4:
			SimpleDateFormat formatter3 = new SimpleDateFormat("MM/dd/yyyy");
			Date date3 = new Date();
			returnDate = formatter3.format(date3);
			break;
		case 5:
			SimpleDateFormat formatter4 = new SimpleDateFormat("yyyy");
			Date date4 = new Date();
			returnDate = formatter4.format(date4);
			break;
		case 6:
			SimpleDateFormat formatter5 = new SimpleDateFormat("MMM");
			Date date5 = new Date();
			returnDate = formatter5.format(date5);
			break;
		case 7:
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime now = LocalDateTime.now();
			now = now.plusDays(10);
			returnDate = dtf.format(now);
			break;
		case 8:
			DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime now1 = LocalDateTime.now();
			now1 = now1.plusDays(-10);
			returnDate = dtf1.format(now1);
			break;
		default:
			break;
		}
		return returnDate;
	}
}
