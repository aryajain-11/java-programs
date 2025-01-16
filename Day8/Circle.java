
package Shapes;
public class Circle {
    double radius;
    public Circle(){
        radius = 5.2;
    }
    public double  calculateArea(){
        double Area = 3.14 * radius *radius ;
        System.out.println("Area is : " + Area );
        return Area;
    }
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.calculateArea();
    }
    
}
//javac -d . Circle.java
//java Shapes.Circle 
