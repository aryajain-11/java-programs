public class Vehicle{
    int speed;
    public Vehicle(int speed){
        this.speed= speed;
    }

}
class Car extends Vehicle{
    public Car(int speed){
        super(speed);
        this.speed= speed;
    }

}
class Bike extends Vehicle{
    public Bike(int speed){
        super(speed);
        this.speed= speed;
    }

}
class Main{
    public static void main(String[] args) {
        Car obj = new Car(60);
        Bike obj2 = new Bike(120);
        System.out.println("speed of car is " + obj.speed);
        System.out.println("speed of Bike is " + obj2.speed);
    }
}