import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer ");
        int integer = sc.nextInt();
        if(integer>0){
            System.out.println(integer+ " is a positive");
        }
        else if(integer<0){
            System.out.println(integer+ " is a negative");
        }
        else{
            System.out.println(integer+ " is a zero");
        }
    }
    
}
