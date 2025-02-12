import java.util.*;
public class VectorC {
    public static void main(String[] args) {
        Vector <String> vc = new Vector <>();
        vc.add("Ram");
        vc.add("Shyam");
        vc.add("sita");
        vc.add("Geeta");
        vc.add("shivam");

        System.out.println("before update : " + vc );

        vc.set(3, "Arya");
        System.out.println("after update : " + vc );

        vc.setElementAt("Arya", 3);//difference
        System.out.println(vc);
        
    }
    
}
