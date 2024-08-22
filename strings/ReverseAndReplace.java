/*
Bhuvana Kanakam
SE21UCSE035 : Lab11

Problem Statement 2 - Reverse and Replace ( StringBuffer )
·      Create a StringBuffer object and initialize it with a string of your choice.

·      Reverse the content of the StringBuffer and print the result.

·      Replace a specific substring within the StringBuffer with another substring and print the modified content.

*/

public class ReverseAndReplace {
	public static void main(String[] args) {
        	StringBuffer stringBuffer = new StringBuffer("Hello, World! Welcome to Java Programming!");

		stringBuffer.reverse() ; 
		// reverse () method of StringBuffer, it reverses the characters in the StringBuffer in place.
		System.out.println("Reversed StringBuffer: " + stringBuffer) ;

		stringBuffer.replace (7, 12, "Universe") ;
		//replace ( stratIndex, endIndex, replacement )
		System.out.println("Modified StringBuffer: " + stringBuffer) ;
	}
}

