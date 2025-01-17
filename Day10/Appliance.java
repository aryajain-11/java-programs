public abstract class Appliance {
    public abstract void  turnOn();
    public  void showBrand() {
        System.out.println("appliance brand");
    }
}
class  WashingMachine extends Appliance{
    public  void  turnOn(){
        System.out.println("Washing Machine is starting");
    }    
}
class Refrigerator extends Appliance{
    public  void  turnOn(){
        System.out.println( "Refrigerator is starting" );
    }
}
class Main{
    public static void main(String[] args) {
        WashingMachine obj1 = new WashingMachine();
        obj1.turnOn();
        Refrigerator obj2 = new Refrigerator();
        obj2.turnOn();
    }
   
}