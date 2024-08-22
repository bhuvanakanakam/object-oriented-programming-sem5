/* 
Bhuvana Kanakam, SE21UCSE035
Check for Leap Year
*/


import java.util.Scanner;
public class LeapYear {
	public static void main (String[] args){
		Scanner yearobj = new Scanner (System.in);
		System.out.println("Enter a year: ");
		int year = yearobj.nextInt();
		boolean isLeapYear;
		
		isLeapYear = (year % 4 == 0);
		isLeapYear = isLeapYear && (year % 100 != 0 || year % 4 == 0);
		if (isLeapYear) {
			System.out.println (year + " is a leap year");
		}
		else{
			System.out.println (year + " is not a leap year");
		}
	}
}