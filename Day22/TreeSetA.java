import java.util.TreeSet;

public class TreeSetA {
    public static void main(String[] args) {
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(5);
        ts.add(30);
        ts.add(15);
        ts.add(20);
        System.out.println(ts);

        ts.remove(10);
        System.out.println("After Remove : " + ts );

       System.out.println(ts.contains(30)); 

    }
    
}
