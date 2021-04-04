import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String dateOfBirth = sc.next();
		System.out.println(validateAge(dateOfBirth));
		sc.close();
	}

	// Validates if the person's age is above 21
	static boolean validateAge(String dateOfBirth) throws ParseException {
		Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dateOfBirth);
		int age = 0;
		Calendar born = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		if (date1 != null) {
			now.setTime(new Date());
			born.setTime(date1);

			age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);
			if (now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR)) {
				age -= 1;
			}
		}
		if (age > 21) {
			return true;
		} else {
			return false;
		}
	}
}
