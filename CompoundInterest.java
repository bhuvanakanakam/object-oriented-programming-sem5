/* 
Bhuvana Kanakam, SE21UCSE035
Calculate Compound Interest 
concept : Principle*(1+(rate / 100))^time – Principle
*/

import java.util.Scanner;
public class CompoundInterest {
	public static void main (String args[]){
		double compound_interest;
		Scanner value = new Scanner(System.in);
		System.out.print("Enter a Principle number : ");
		double principle = value.nextDouble();
		System.out.print("Enter a Interest Rate (%): ");
		double rate = value.nextDouble();
		System.out.print("Enter a time in years.   : ");
		int time = value.nextInt();
		
		compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
		System.out.println("The Compound Interest is : " + compound_interest);
	}
}