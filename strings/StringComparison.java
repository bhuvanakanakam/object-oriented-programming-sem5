/*clearclea
Bhuvana Kanakam
SE21UCSE035 : Lab11

Problem Statement 3 - String Comparison:
·      Write a method that compares two strings without using the built-in equals() method.

·      The method should return true if the strings are equal and false otherwise.

·      Test the method with different strings to verify its correctness.
*/

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first string for comparison:");
		String str1 = scanner.next();

		System.out.println("Enter the second string for comparison:");
		String str2 = scanner.next();
		
		scanner.nextLine();
		boolean isEqual = compareStrings(str1, str2);
		System.out.println("Are the strings equal? " + isEqual);

		scanner.close();
	}

	public static boolean compareStrings(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}


    
