/* 
	Bhuvana Kanakam
	SE21UCSE035
	CSE-1 Assignment 4
*/

import java.util.Scanner;	
	// importing necessary libraries, Scanner class is used to read input from user. Need to create an instance of the Scanner object and specify source as Scanner(System.in) and types of input nextInt() or nextDouble(), etc. close the scanner when done.

class NumberCalculator { 			// a class NumberCalculator is created.
	private int[] numbers;
	public NumberCalculator(int[] numbers){	// array of integers named numbers, is the parameter.

		this.numbers = numbers;		// assigns the value of the parameter numbers to the instance variable number.
	}

	public double calculateAverage() {
		if(numbers.length == 0) {
			return 0;
		}				// if there are no elements, return 0

		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}				// for each variable num in the array numbers do this..

		return (double) sum / numbers.length;	// average = sum of all numbers / total numbers.
	}
}

public class Calculatorr {					// Main() class is where the execution of the program begins.
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);	// Scanner object named 'scanner' to read input is created.

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();			// a variable n for input size is assigned the user value.
		int[] numbers = new int[n];			// declaring an array : type[] arrayName = new type[arraySize]; 
		System.out.println("Enter the numbers : ");
		for (int i=0; i<n; i++){
			numbers[i] = scanner.nextInt();
		}						// inputs user values for each i in the array numbers.

		NumberCalculator calculator = new NumberCalculator(numbers);
		// an instance calculator of class NumberCalculator is created, which takes numbers array inside.
		double average = calculator.calculateAverage();
		// calculateAverage method is called and stored in average variable. 
		System.out.println("The average of the numbers is: " + average);
		scanner.close();
	}
}
