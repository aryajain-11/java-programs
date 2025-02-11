import java.util.ArrayList;
import java.util.Scanner;;
public class StringsArrayList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Arya");
        list.add("Jain");

        System.out.println("List is : " + list);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        
        System.out.println(list.contains(str));




       /*  if(list.contains(str)){
            System.out.println(str + " in the list ");
        }
        else{
            System.out.println(str+ " is not in the list");
        }
            */
        sc.close();


       
    }
    
}
