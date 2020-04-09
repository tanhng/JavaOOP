package hust.soict.ictglobal.date;

import java.text.*;
import java.util.Date;
import java.util.Arrays;

public class DateUtils {
	static SimpleDateFormat  sdformat = new SimpleDateFormat("yyyy-MM-dd");
	
	public static void compareTwoDates(String date1_str, String date2_str)
	{
		 try {
	            Date date1 = sdformat.parse(date1_str);
	            Date date2 = sdformat.parse(date2_str);
	            
	            System.out.println("The date 1 is: " + sdformat.format(date1));
	            System.out.println("The date 2 is: " + sdformat.format(date2));
	            if(date1.compareTo(date2) > 0) {
	                System.out.println("Date 1 occurs after Date 2");
	             } else if(date1.compareTo(date2) < 0) {
	                System.out.println("Date 1 occurs before Date 2");
	             } else if(date1.compareTo(date2) == 0) {
	                System.out.println("Both dates are equal");
	             }
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}
	
	public static Date[] sort(String date[])
	{
		Date da[] = new Date[date.length];
		
		for(int i = 0; i < date.length; i++)
		{
			try {
				da[i] = sdformat.parse(date[i]);
			}
			catch(ParseException e) {
				e.printStackTrace();
			}
		}
		
		Arrays.sort(da);
		
		return da;
	}
}
