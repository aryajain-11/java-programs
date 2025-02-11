public class GenericsDemo {
    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5};
        String [] stringArray = {"Arya","Jain"};
        Double [] doubleArray = {3.12,2.12};

        GenericContainer<Integer> obj1 = new GenericContainer<>();
        
        GenericContainer<String> obj2 = new GenericContainer<>();
        
        GenericContainer<Double> obj3= new GenericContainer<>();

        printArray(intArray);
        printArray(stringArray);
        printArray(doubleArray);

        obj1.setVal(5);
        obj2.setVal("Kinnu");
        obj3.setVal(4.12);

        System.out.println(obj1.getVal());
        System.out.println(obj2.getVal());
        System.out.println(obj3.getVal());
    }
    
    public  static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.println(t);
        }
    }
    
}
class GenericContainer <T>{
    private T val;

    public void setVal(T val ){
        this.val = val;
    }

    public T getVal(){
        return val;
    }
}

