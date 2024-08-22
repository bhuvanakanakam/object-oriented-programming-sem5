/* 
Bhuvana Kanakam, SE21UCSE035
Convert Temperature in java.
concept is that T(f) = (T(c) * (9/5)) + 32
*/

import java.util.Scanner;
public class TempConvert{
	public static void main (String[] args){
		Scanner temperature = new Scanner (System.in);
		System.out.print("Enter temp in Celsius :");
		float Celsius = temperature.nextFloat();
		float Fahrenheit =((Celsius*9)/5)+ 32;
		System.out.println ("Temperature in Fahrenheit is: "+Fahrenheit);
	}
}  