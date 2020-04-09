package week2;
import java.util.Scanner;
public class DaysAndMonths {


	
	public int setYear(int y) {
		if(y>0) {
			return y;
		}
		else {
			return 0;
		}
	}
	
	public int checkLeapYear(int y) {
		if (y % 4 == 0) {
			if (y % 100 == 0) {
				if (y % 400 == 0) {
					return 1;
				} else return 0;
			} return 1;
		} return 0;
	}
	
	
	public int setMonth(int m) {
		if(m>0 & m<13) {
			return m;
		}
		else {
			return m;
		}
	}
	
	
	

	
	public int setDay(int d,int month,int year) {
		switch(month) {
		case 1: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		case 2: {
			if (checkLeapYear(year) == 1) {
				if (d > 0 && d <30) {
					return d;
				}
			}  
			else if (d > 0 && d < 29) {
				return d;
			} 
			else
				return 0;
			break;
		}
		case 3: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		case 4: {
			if (d > 0 && d < 31) {
				return d;
			} else
				return 0;
		}
		case 5: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		case 6: {
			if (d > 0 && d < 31) {
				return d;
			} else
				return 0;
		}
		case 7: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		case 8: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		case 9: {
			if (d > 0 && d < 31) {
				return d;
			} else
				return 0;
		}
		case 10: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		case 11: {
			if (d > 0 && d < 31) {
				return d;
			} else
				return 0;
		}
		case 12: {
			if (d > 0 && d < 32) {
				return d;
			} else
				return 0;
		}
		
		}
		return 0 ;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		DaysAndMonths demo=new DaysAndMonths();
		int day,month,year,checkDay,checkMonth,checkYear;
		do {
			System.out.println("please enter year");
			year = keyboard.nextInt();
			System.out.println("please enter month");
			month = keyboard.nextInt();
			System.out.println("please enter day");
			day = keyboard.nextInt();
			checkYear=demo.setYear(year);
			checkMonth=demo.setMonth(month);
			checkDay=demo.setDay(day, checkMonth, checkYear);
			
		}
		while(checkDay==0 | checkMonth==0 | checkYear==0 );
	}

}
