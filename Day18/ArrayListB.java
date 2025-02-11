import java.util.ArrayList;
public class ArrayListB {
    public static void main(String[] args) {

        //Create an ArrayList of strings
        ArrayList <String> list = new ArrayList <> ();

        //Add five different strings to the list
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Arya");
        list.add("Jain");

        System.out.println(list);
    
       // Remove the second element from the list.
        list.remove(1);

        //Print the modified list.
        System.out.println(list);
    }
    
}
