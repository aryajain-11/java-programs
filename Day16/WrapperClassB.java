public class WrapperClassB {
    public static void main(String[] args) {
        Integer obj =  12; // autoboxing
        int i = obj;  // unboxing

        Double obj1 = 12.24; // autoboxing
        double d = obj1;  // unboxing

        Character obj2 = 'a'; // autoboxing
        char c = obj2;  // unboxing

        //some arithmentic operation 
        System.out.println(obj + 2);
        System.out.println(obj1 + 2);
        System.out.println(obj2 +2);  // ?
       
    }
}

