import java.util.ArrayList;
import java.util.Scanner;
public class ColorsArraylist {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Green");
        colors.add("Silver");

        System.out.println(colors);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color ");
        String color = sc.next();

        if(colors.contains(color)){
            System.out.println("Index is : " + colors.indexOf(color));
        }
        else{
            System.out.println("the color is not in the list");
        }
    }
    
}
