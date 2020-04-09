package hust.soict.ictglobal.date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		MyDate a=new MyDate(24,100,1999);
		a.print();
		Date b=new Date();
		MyDate c= new MyDate();
		MyDate d= new MyDate();
		System.out.println(b);
		c.print();
		d.print();
		MyDate e= new MyDate("12-04-1999");
		e.print();
		e.accept();
		d.sprint();
	}

}
