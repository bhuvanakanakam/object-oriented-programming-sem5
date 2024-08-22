/*
Bhuvana Kanakam
SE21UCSE035 : Lab11

Problem Statement 5 - Palindrome Check:

·      Write a Java program that checks if a given string is a palindrome.

·      Utilize both String and StringBuffer to demonstrate different approaches.

·      Print whether the input string is a palindrome or not.

*/

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string for palindrome check:");
		String inputString = scanner.next();

		boolean isPalindromeString = inputString.equals(new StringBuilder(inputString).reverse().toString());
		System.out.println("Is the input string a palindrome? (Using String): " + isPalindromeString);

		boolean isPalindromeBuffer = new StringBuffer(inputString).reverse().toString().equals(inputString);
		System.out.println("Is the input string a palindrome? (Using StringBuffer): " + isPalindromeBuffer);

		scanner.close();
	}
}
