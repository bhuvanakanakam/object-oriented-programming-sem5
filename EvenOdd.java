/* 
Bhuvana Kanakam, SE21UCSE035
Check for Even or ODD
*/

import java.util.Scanner;
public class EvenOdd {
	public static void main (String[] args) {
		Scanner number = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = number.nextInt();
		if (num % 2 == 0)
			System.out.println("Number " + num + " is even");
		else
			System.out.println("Number " + num + " is odd");
	}
}