import java.util.HashMap;

public class HashMapB {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("Apple", 50);
        h.put("Banana", 20);
        h.put( "Cherry", 30);
        h.put("Date", 15);
        
        System.out.println(h);

        System.out.println(h.get("Banana"));
        
        h.remove("Cherry");
        System.out.println("Updated Map " +h);
       

      

    }
    
}
