import java.util.TreeSet;

public class TreeSetC {
    public static void main(String[] args) {
        TreeSet <Integer> t = new TreeSet <> ();
        t.add(40); 
        t.add(10); 
        t.add(30); 
        t.add(50); 
        t.add(20); 
        t.add(60); 
        t.add(70); 
        t.add(80); 
        t.add(90); 
        t.add(100); 
        System.out.println(t);

        t.remove(30);
        System.out.println("After Remove :  " + t);

        t.add(25);
        System.out.println(t);
 
        
    }
    
}
