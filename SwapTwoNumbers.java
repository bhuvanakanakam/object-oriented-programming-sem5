/* 
Bhuvana Kanakam, SE21UCSE035
Problem : swap two numbers without a temporary variable in java 
*/

import java.util.Scanner;
class SwapTwoNumbers {
	public static void main (String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int x = number.nextInt();
		System.out.println("Enter Number 2");
		int y = number.nextInt();
		System.out.println ("Before Swapping " + "x is " + x + ", and y is " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println ("After Swapping " + "x will be " + x + ", and y will be " + y);
	}
}
