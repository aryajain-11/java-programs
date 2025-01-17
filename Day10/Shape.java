public  abstract class Shape {
    public abstract void  area();
    public static void display(){
        System.out.println("Displaying shape details ");
    }
}
class Circle extends Shape {
    public void area (){
        int radius = 4;
        double circleArea = 3.14 * radius *radius ;
        System.out.println("area is "+ circleArea);
    }
} 
class Rectangle extends Shape {
    public void area (){
        int length = 5;
        int width = 6 ;
        int rectangleArea = length * width;
        System.out.println("area of rectangle is : "+ rectangleArea );
    }

}
class Main {
    public static void main(String[] args) {
        Circle obj2 = new Circle ();
        obj2.area();
        Rectangle obj3 = new Rectangle();
        obj3.area();
    }
}
