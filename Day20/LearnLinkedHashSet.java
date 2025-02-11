import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet <String> elements = new LinkedHashSet<>();

        elements.add("Ram");
        elements.add("Sita");
        elements.add("Arya");
        elements.add("Kinnu");
        elements.add("Jain");

        System.out.println(elements);

        elements.remove("Ram");
        System.out.println("After removing element : " + elements );
       

    }
    
}
