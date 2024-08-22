/* Bhuvana Kanakam, SE21UCSE035 : OOP lab assignment 5
Objective : Reinforce your understanding of method and constructor overloading in Java. 
*/

// Java class called `Calculator`.
public class Calculator {
  private int intValue;
  private double doubleValue;

  // Constructor 1: Takes no arguments and initializes the calculator with default values.
  public Calculator() { 
    intValue = 0;
    doubleValue = 0.0;
  }
  // Constructor 2: Takes two integer arguments and initializes the calculator with those values.
  public Calculator(int a, int b) {
    intValue = a + b; 
    doubleValue = 0.0; 
  }
  
  // Constructor 3: Takes a double argument and initializes the calculator with a floating-point value.
  public Calculator(double value) {
        intValue = 0;          
        doubleValue = value;  
  }
  
  // overloaded method `add(int a, int b)`: Adds two integers and returns the result as an integer.
  public int add(int a, int b) {
        return a + b;
  }
  // overloaded method  `add(double a, double b)`: Adds two doubles and returns the result as a double.
  public double add(double a, double b) {
        return a + b;  
  }

  // overloaded method `subtract(int a, int b)`: Subtracts the second integer from the first and returns the result as an integer.
  public int subtract(int a, int b) {
      return a - b;  
  }
  // overloaded method `subtract(double a, double b)`: Subtracts the second double from the first and returns the result as a double.
   public double subtract(double a, double b) {
      return a - b;  
  }

  // Method to display the result
  public void displayResult(String operation, double result) {
    System.out.println(operation + ": " + result);  // Display the operation name and result
  }

  public static void main(String[] args) {
    
    // Create instances using different constructors
    Calculator calc1 = new Calculator();
    Calculator calc2 = new Calculator(10, 5);
    Calculator calc3 = new Calculator(3.14);

    // Perform arithmetic operations using overloaded methods
    int intResult1 = calc1.add(5, 3);
    double doubleResult1 = calc1.add(3.5, 2.5);
    int intResult2 = calc2.subtract(10, 3);
    double doubleResult2 = calc2.subtract(4.0, 1.5);
    int intResult3 = calc3.add(2, 2);
    double doubleResult3 = calc3.subtract(3.0, 1.0);
    
    // Use the displayResult method to display the results
    calc1.displayResult("Addition (int)", intResult1);
    calc1.displayResult("Addition (double)", doubleResult1);
    calc2.displayResult("Subtraction (int)", intResult2);
    calc2.displayResult("Subtraction (double)", doubleResult2);
    calc3.displayResult("Addition (double)", intResult3);
    calc3.displayResult("Subtraction (double)", doubleResult3);
  }
}
  
  
  

