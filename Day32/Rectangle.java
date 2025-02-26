import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);

    double length = sc.nextDouble();
    

    
    double width = sc.nextDouble();
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle. calculateArea();
        rectangle.calculatePerimeter();

    }

   public  void calculateArea() {
    double area = length * width;
    System.out.println("Area of Rectangle is : "+ area );

   }
   public void calculatePerimeter() {
    double perimeter  = 2*(length+width);
    System.out.println("Perimeter of Rectangle is : " + perimeter);
    
   }

    
}
