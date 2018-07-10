package hotelPattern;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
	static int[] getWeWd(String[] str) {
		int[] arr = new int[] { 0, 0 };
		Date date1 = null;
		for (int i = 0; i < str.length; i++) {
			try {
				date1 = new SimpleDateFormat("dd/MM/yyyy").parse(str[i]);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			DateFormat df = new SimpleDateFormat("E");
			String str2 = df.format(date1);
			if (str2.equalsIgnoreCase("Sat") || str2.equalsIgnoreCase("Sun"))
				arr[1]++;
			else
				arr[0]++;
		}
		return arr;
	}
}
