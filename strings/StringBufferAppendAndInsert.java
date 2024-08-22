/*
Bhuvana Kanakam
SE21UCSE035 : Lab11

Problem Statement 4 - StringBuffer Append and Insert:

·      Create two StringBuffer objects and initialize them with different strings.

·      Append the content of the second StringBuffer to the first one.

·      Insert a new substring into the modified StringBuffer at a specified index.

·      Print the final result.

*/

public class StringBufferAppendAndInsert {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("This is ");
		StringBuffer buffer2 = new StringBuffer("a Lab.");

		System.out.println("The String without Appended and Inserting is : " + buffer1);

		buffer1.append(buffer2);

		buffer1.insert(8, "modified ");
		System.out.println("Appended and Inserted StringBuffer: " + buffer1);
    }
}
