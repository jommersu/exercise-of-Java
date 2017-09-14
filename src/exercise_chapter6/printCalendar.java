package exercise_chapter6;

import java.util.Scanner;

public class printCalendar {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("input the year: ");
		 int year = input.nextInt();
		 while (year <= 1800) {
			 System.out.println("your input is wrong!"
			 		+ " Input the year again:");
			 year = input.nextInt();
		}
		 System.out.println("input the month: ");
		 int month = input.nextInt();
		 while (!(month >= 1 && month <= 12)) {
			 System.out.println("your input is wrong!"
			 		+ " Input the month again:");
			 month = input.nextInt();
		}
		 
		 printMonth(year, month);
	}

	public static void printMonth(int year , int month) {
		printTitle(year, month);
		printBody(year, month);
	}
	
	public static void printTitle(int year, int month) {
		System.out.printf("%8s", " ");
		System.out.print(getMonthName(month) + " " + year
				+ "\n-----------------------------"+
				"\n Sun Mon Tue Wed Thu Fri Sat\n");
	}
	
	public static void printBody(int year, int month) {
		int startDay = getStartDay(year, month);
		int numberOfDaysInMounth = getDayInMonth(year, month);
		
		int flag = startDay;
		for(int i = 1; i <= (startDay * 4); i++) {
			System.out.print(" ");
		}
		for(int i = 1; i <= numberOfDaysInMounth; i++ ) {			
			System.out.printf(" %3d", i);
			flag++;
			if(flag % 7 == 0) {
				System.out.print("\n");
			}
		}
		
	}
	
	public static int getStartDay(int year, int month) {
		final int START_OF_1800 = 3;
		int totalDays = getTotalDay(year, month);
		int startDay = 0;
		startDay = (totalDays + START_OF_1800) % 7;
		return startDay;
	}
	
	public static int getTotalDay(int year, int month) {
		int total = 0;
		
		for(int i = 1800; i < year; i++ ) {
			if(isLeapYear(i)) {
				total += 366;
			}else {
				total += 365;
			}
		}
		
		for(int i = 1; i < month; i++) {
			total += getDayInMonth(year, i);
		}
		return total;
	}
	
	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:	monthName = "January"; break;
		case 2:	monthName = "February";	break;
		case 3:	monthName = "March"; break;
		case 4:	monthName = "April"; break;
		case 5:	monthName = "May"; break;
		case 6:	monthName = "June";	break;
		case 7:	monthName = "July";	break;
		case 8:	monthName = "August"; break;
		case 9:	monthName = "September"; break;
		case 10:monthName = "October"; break;
		case 11:monthName = "November";	break;
		case 12:monthName = "December";	break;
		default: break;
			
		}
		return monthName;
		
	}
	public static int getDayInMonth(int year, int month) {
		int dayInMonth = 0;
		if(month == 4 || month == 6 || month == 9 || month == 11){
			dayInMonth = 30;
		}else if(month != 2){
			dayInMonth = 31;
		}else {
			dayInMonth = isLeapYear(year) ? 29 : 28;
		}
		return dayInMonth;
	}
	
	public static boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
