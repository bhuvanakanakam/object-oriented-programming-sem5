/* 
Bhuvana Kanakam, SE21UCSE035
Calculate Area and Perimeter of rectangle
*/

import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {
        int length, bredth, perimeter, area;
        Scanner measurement = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        length = measurement.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        bredth = measurement.nextInt();
        perimeter = 2 * (length + bredth);
        System.out.println("Perimeter of rectangle: "+perimeter);
        area = length * bredth;
        System.out.println("Area of rectangle: "+area);
    }
}