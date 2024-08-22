/* 
Bhuvana Kanakam, SE21UCSE035
Bitwise Operations
*/

import java.util.Scanner;
public class BitWiseOperator {
	public static void main (String[] args){
		Scanner number = new Scanner (System.in);
		System.out.println("Enter Number 1: ");
		int num1 = number.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = number.nextInt();
		
		System.out.println("BitWise AND & for Number 1 and 2 : " +(num1 & num2));
		System.out.println("BitWise OR | for Number 1 and 2  : " +(num1 | num2));
		System.out.println("BitWise XOR ^ for Number 1 and 2 : " +(num1 ^ num2));
		System.out.println("BitWise NOT ~ for Number 1 : " + ~num1);
		System.out.println("BitWise NOT ~ for Number 2 : " + ~num2);
		
	}
}
