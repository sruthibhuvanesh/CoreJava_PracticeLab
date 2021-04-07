import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Exercise17 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();
		int n = sc.nextInt();
		int id = 0;
		String dateOfBirth;
		for (int i = 0; i < n; i++) {
			id = sc.nextInt();
			dateOfBirth = sc.next();
			map.put(id, dateOfBirth);
		}
		ArrayList<Integer> list = votersList(map);
		System.out.println(list);
		sc.close();

	}

	// Generate the list of voters based on the ages of the people
	static ArrayList<Integer> votersList(Map<Integer, String> map) throws ParseException {
		Set<Entry<Integer, String>> s = map.entrySet();
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set<Entry<Integer, String>> set = new HashSet<Entry<Integer, String>>();
		String dob;
		for (Entry<Integer, String> it : s) {
			dob = it.getValue();
			set.add(it);

			SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/yyyy");
			Date date = formatter.parse(dob);
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate givenDate = zone.toLocalDate();
			Period period = Period.between(givenDate, LocalDate.now());

			int age = period.getYears();
			if (age > 18) {
				int key = it.getKey();
				al.add(key);
			}
		}
		return al;
	}
}
