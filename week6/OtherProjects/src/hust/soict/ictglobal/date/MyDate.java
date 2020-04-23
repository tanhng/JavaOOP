package hust.soict.ictglobal.date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
public class MyDate {
	private int day;
	private int month;
	private int year;
	private String sday;
	private String smonth;
	private String syear;
	
	
	
	
	
	public String getSday() {
		return sday;
	}

	public void setSday(String sday) {
		this.sday = sday;
	}

	public String getSmonth() {
		return smonth;
	}

	public void setSmonth(String smonth) {
		this.smonth = smonth;
	}

	public String getSyear() {
		return syear;
	}

	public void setSyear(String syear) {
		this.syear = syear;
	}

	public MyDate() {
//		Date today=new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date today = new Date();
		this.day = Integer.parseInt(new SimpleDateFormat("dd").format(today));
		this.month = Integer.parseInt(new SimpleDateFormat("MM").format(today));
		this.year = Integer.parseInt(new SimpleDateFormat("yyyy").format(today));
	}
	
	public boolean validate(int day, int month, int year) {
		
		if(month>12 | month <0 | day <0 | day>31 ) 
			return false;
		if (day == 31 && !(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12))
			return false;
		
		if (day==30 && month==2)
			return false;
		
		if (day==29 && month==2 && !isLeapYear())
			return false;
		
		return true;
	}
	
	
	public boolean isLeapYear() {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					return true;
				else
					return false;
			} else
				return true;
		} else
			return false;
	}
	public MyDate(int day,int month,int year) {
		super();
		if (!validate(day,month,year)) System.out.println("date not valid");
		else {
		this.day=day;
		this.month=month;
		this.year=year;
		}
	}
	public MyDate(String input) {
		SimpleDateFormat parser = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd");
		SimpleDateFormat monthFormatter = new SimpleDateFormat("MM");
		SimpleDateFormat yearFormatter = new SimpleDateFormat("yyyy");
		try {
			if (!validate(Integer.parseInt(dateFormatter.format(parser.parse(input))),Integer.parseInt(monthFormatter.format(parser.parse(input))),Integer.parseInt(yearFormatter.format(parser.parse(input))))) System.out.println(this.day + "-" + this.month + "-" + this.year + " not valid");
			else {
			this.day = Integer.parseInt(dateFormatter.format(parser.parse(input)));
			this.month = Integer.parseInt(monthFormatter.format(parser.parse(input)));
			this.year = Integer.parseInt(yearFormatter.format(parser.parse(input)));
			}
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day<32 & day>0)
			this.day = day;
		else
			System.out.println("Day not valid");
			return;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month<13 & month >0)
			this.month = month;
		else
			System.out.println("month not valid");
			return;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void sprint() {
		if(this.sday==null | this.smonth==null || this.syear==null) return;
		System.out.print("Day:" + this.sday +"Month:" +this.smonth + "Year: " +this.syear);
	}
	
	
	
	public void accept() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a date(e.g. \"2-12-1999\") : ");
		String input = keyboard.nextLine();
		SimpleDateFormat parser = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd");
		SimpleDateFormat monthFormatter = new SimpleDateFormat("MM");
		SimpleDateFormat yearFormatter = new SimpleDateFormat("yyyy");
		try {
			if (!validate(Integer.parseInt(dateFormatter.format(parser.parse(input))),Integer.parseInt(monthFormatter.format(parser.parse(input))),Integer.parseInt(yearFormatter.format(parser.parse(input))))) System.out.println("date not valid");
			else {
			this.day = Integer.parseInt(dateFormatter.format(parser.parse(input)));
			this.month = Integer.parseInt(monthFormatter.format(parser.parse(input)));
			this.year = Integer.parseInt(yearFormatter.format(parser.parse(input)));
			this.print();
			}
		} catch (NumberFormatException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		keyboard.close();

	}
	
	public void print() {
		System.out.println(this.day + "-" + this.month + "-" + this.year);
	}
	
}

