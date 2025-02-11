import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet <Integer> element = new HashSet<>();

        element.add(10);
        element.add(20);
        element.add(30);
        element.add(40);
        element.add(50);
        element.add(60);
        element.add(70);
        element.add(80);
        element.add(90);
        element.add(100);

        System.out.println("Before adding duplicate set is  : " + element);

        element.add(10);
        System.out.println("After adding duplicate set is : " + element);

    }
    
}
