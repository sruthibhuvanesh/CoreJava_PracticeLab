import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		String date = s.next();
		String dateFormat = s.next();
		System.out.println(getDayofWeek(date, dateFormat));
		s.close();
	}
	
	
	
		static String getDayofWeek(String arrivalDate, String format) throws ParseException {

			String input = arrivalDate;
			Date d;
			switch (format) {
			case "dd-MM-yyyy":
				d = new SimpleDateFormat("dd-MM-yyyy", Locale.US).parse(input);
				break;
			case "MM-dd-yyyy":
				d = new SimpleDateFormat("MM-dd-yyyy", Locale.US).parse(input);
				break;
			case "MM/dd/yyyy":
				d = new SimpleDateFormat("MM/dd/yyyy", Locale.US).parse(input);
				break;
			case "dd-MMM-yyyy":
				d = new SimpleDateFormat("dd-MMM-yyyy", Locale.US).parse(input);
				break;
			case "MMM-dd-yyyy":
				d = new SimpleDateFormat("MMM-dd-yyyy", Locale.US).parse(input);
				break;
			case "dd MMMM yyyy":
				d = new SimpleDateFormat("dd MMMM yyyy", Locale.US).parse(input);
				break;
			default:
				d = new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(input);
				break;
			}
			String output = new SimpleDateFormat("dd-MM-yyyy").format(d);
			Date sdf = new SimpleDateFormat("dd-MM-yyyy").parse(output);
			SimpleDateFormat sdf1 = new SimpleDateFormat("EEEEE");
			String s1 = sdf1.format(sdf);
			return s1.toUpperCase();
		}
		
	}