/*
Bhuvana Kanakam, SE21UCSE035
Check for Prime Number : it is a number greater than 1 and it is divided by 1 and itself only
*/

import java.util.Scanner;
public class PrimeNumber {
	static boolean isPrime (int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0){
				return false;
			}
		return true;
	}

	public static void main(String args[])
	{
		Scanner number = new Scanner (System.in);
		System.out.print("Enter Number: ");
		int num = number.nextInt();
        	System.out.println("Number " + num + " prime condition is : " + isPrime(num));
	}
}
