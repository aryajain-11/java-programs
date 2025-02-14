import java.util.*;
public class ArrayListD {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(50);
        l.add(10);
        l.add(40);
        l.add(30);

        Collections.sort(l);
        System.out.println("Sorted List : " + l);

    }
    
}
