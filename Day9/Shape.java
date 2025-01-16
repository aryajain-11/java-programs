public class Shape {
    public static void draw(){
        System.out.println("Drawing the shape ");
    }
}
class Circle extends Shape{
    public static void draw(){
        System.out.println("Drawing the Circle");
    }
}
class Rectangle extends Shape{
    public static void draw(){
        System.out.println("Drawing the Rectangle");
    }
}
class Main {
    public static void main(String[] args) {
        Shape obj1 = new Shape();
        obj1.draw();
        Circle obj2 = new  Circle();
        obj2.draw();
        Rectangle obj3 = new Rectangle();
        obj3.draw();
    }
   
    
}

// javac Shape.java
// java main
// static remove karte to kya hota method se