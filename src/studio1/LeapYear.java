package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Year? ");
		int year = in.nextInt();
		boolean first = (year % 4) == 0;
		boolean second = (year % 100) != 0;
		boolean third = (year % 400) == 0;
		boolean leapYear = first && (second || third);
		System.out.println(year + " is a leap year: " + leapYear);
	}

}
