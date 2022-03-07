package com.lwl.cj.basics;

import java.util.Scanner;

public class Createcalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year ");
		int year = sc.nextInt();
		System.out.println("Enter the Month ");
		int month = sc.nextInt();
		printmonth(year,month);
		sc.close();		
	}
	
	public static void printmonth(int year, int month) {
		printmonthtitle(year,month);
		printmonthbody(year,month);
	}
	
	public static void printmonthtitle(int year, int month){
		System.out.println("      " + getmonthname(month)
		+ " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		
	}

	public static String getmonthname(int month) {
		String monthName = "";
		switch (month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December";
		}
		return monthName;
	}
	
	public static void printmonthbody(int year, int month){
		int startday = getstartday(year, month);
		int totalday = getdaysinmonth(year, month);
		int i = 0;
		for(i = 0;i < startday; i++)
			System.out.print("    ");
		for (i = 1; i <= totalday; i++) {
			System.out.printf("%4d", i); //% is format syntax, 4 means width, d means decimal integer
			if ( (i + startday ) % 7 ==0) {
				System.out.println(); //use it if u want to start a new line
			}
		}
		System.out.println();
	}

	public static int getstartday(int year, int month){
		final int START_DATA_OF_JAN_1_1800 = 3;
		int totaldays = gettotaldays(year,month);
		return (totaldays + START_DATA_OF_JAN_1_1800) % 7;	
	}
	
	public static int gettotaldays(int year, int month){
		int total = 0;
		for (int i = 1800; i < year; i++) {
			if(isleapyear(i)) {
				total += 366;
			}else {
				total += 365;
			}
		}
		for (int i = 1; i < month; i++) {			
			total += getdaysinmonth(year, i);
			//why i wasted 1 hour on it: pay 100% attention. the order of variables, the right variables.
		}
		return total;		
	}
	public static int getdaysinmonth(int year,int month){
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
		month == 8 || month == 10 || month == 12)
		return 31;		
		if (month == 4 || month == 6 || month == 9 || month == 11)
		return 30;
		if (month == 2) return isleapyear(year) ? 29 : 28;
		return 0; // don't forget add a return after all ifs.
		
	}
	public static boolean isleapyear(int year){
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);		
	}
}
