/*
	Bhuvana Kanakam
	se21ucse035
	lab 7 - OOP Lab : Area of Shapes
	problem : Create a program to calculate and display the area of different shapes: Circle, Rectangle, and Triangle. Use inheritance and method overriding to achieve this.
*/


import java.util.Scanner;

// 1. Create a Shape class with a method calculateArea() that returns 0.

class Shape {
	public double calculateArea() {
		return 0 ;
	}
}

// 2. subclass Circle inherits from Shape superclass, and it has the method overridden to calculate Area.
// the area of Circle is π * r^2

class Circle extends Shape {
	private double radius ;
	
	public Circle (double radius) {
		this.radius = radius ;
	}
	
	public double calculateArea () {
		return Math.PI * radius * radius ;
	}
}

// 3. subclass Rectangle inherits from Shape superclass, and it has the method overridden to calculate Area
// the area of Rectangle is length * width.

class Rectangle extends Shape {
	private double length ;
	private double width ;

	public Rectangle (double length, double width) {
		this.length = length ;
		this.width = width ;
	}
	
	public double calculateArea () {
		return length * width ;
	}
}


// 4. subclass Triangle inherits from Shape superclass, and it has the method overridden to calculate Area
// the area of Triangle is 0.5* base * height.

class Triangle extends Shape {
	private double base ;
	private double height ;
	
	public Triangle (double base, double height) {
		this.base = base ;
		this.height = height ;
	}
	
	public double calculateArea () {
		return 0.5 * base * height ;
	}
}

// 5. In your main program, create objects of each shape type, set their respective dimensions (e.g., radius for a circle, length and width for a rectangle, base and height for a triangle), and call their calculateArea() methods to 			calculate and display their areas.
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the radius of the circle: ");
        	double circleRadius = scanner.nextDouble();
        	Circle circle = new Circle(circleRadius);
	
		System.out.print("Enter the length of the rectangle: ");
        	double rectLength = scanner.nextDouble();
        	System.out.print("Enter the width of the rectangle: ");
        	double rectWidth = scanner.nextDouble();
        	Rectangle rectangle = new Rectangle(rectLength, rectWidth);
		
		System.out.print("Enter the base of the triangle: ");
        	double triangleBase = scanner.nextDouble();
       		System.out.print("Enter the height of the triangle: ");
        	double triangleHeight = scanner.nextDouble();
        	Triangle triangle = new Triangle(triangleBase, triangleHeight);
		
		scanner.close();
		
		double circleArea = circle.calculateArea();
		double rectangleArea = rectangle.calculateArea();
		double triangleArea = triangle.calculateArea();
		
		System.out.println("Circle Area: " + circleArea);
		System.out.println("Rectangle Area: " + rectangleArea);
		System.out.println("Triangle Area: " + triangleArea);
	}
}
