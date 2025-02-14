import java.util.TreeSet;

public class TreeSetB {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet <> ();
        t.add(50);
        t.add(20);
        t.add(70);
        t.add(10);
        t.add(40);
        t.add(60);
        t.add(30);

        System.out.println("Before range query TreeSet is : " + t);
        System.out.println("After range query TreeSet is : "+ t.subSet(20, 60));
        
    }
    
}
