/*
Bhuvana Kanakam
SE21UCSE035 : Lab11

Problem Statement 1 - Concatenation and Substring ( String )
·	Write a Java program that takes two strings as input from the user.

·      Concatenate the two strings and print the result.

·      Prompt the user to enter a starting index and an ending index.

·      Extract and print the substring of the concatenated string based on the provided indices.
*/

import java.util.Scanner ;
public class ConcatenationAndSubstring	{
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in ) ;

		System.out.println ("Enter the first string:") ;
		String str1 = scanner.nextLine()	;
		System.out.println ("Enter the second string:") ;
		String str2 = scanner.nextLine()	;

		String concatenatedString = str1 + str2	;
		System.out.println("The Concatenated String generated is : " + concatenatedString) ;

        	System.out.println("Enter the starting index for substring from the concatenated String:");
        	int startIndex = scanner.nextInt();
		
       		System.out.println("Enter the ending index for substring from the concatenated String:");
        	int endIndex = scanner.nextInt();
        
		if (startIndex >= 0 && endIndex < concatenatedString.length() && startIndex <= endIndex) {
			String substring = concatenatedString.substring(startIndex, endIndex);
			System.out.println("The Substring from the indices provided is : " + substring);
        	} else {
            		System.out.println("Invalid indices for the substring.");
        	}

        	scanner.close();
    	}
}
