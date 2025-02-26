import java.util.Scanner;

public class GreeterA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.next();
        greet(name);
        }
        public static void greet(String name){
            System.out.println("Hello, " + name + "!");
        }
    }
    
    

