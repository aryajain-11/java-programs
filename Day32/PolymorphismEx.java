
public class PolymorphismEx {
    public static void main(String[] args) {
        Square obj = new Square();
        obj.area();
        
        Circle obj2 = new   Circle ();
        obj2.area();
    }
    
}
class Shape{
    public void area(){
        System.out.println("area of shape");
    }

}
class Circle extends Shape{
    public void area(){
       int radius = 4;
        double pi = 3.14;
        double area = pi * radius*radius;
        System.out.println("Area of Circle is : " + area);
    }

}
class Square extends Shape{
    public void area(){
        int side = 4;
        int  area = side*side;
        System.out.println("Area of Square  is : " + area);
     }

}
