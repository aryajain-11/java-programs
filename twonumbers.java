import java.util.Scanner;

public class twonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a = sc.nextInt(); 
        System.out.println("enter second  number : ");
        int b = sc.nextInt(); 
        int sum = a+b;
        int difference = a-b ;
        int product = a*b;
        int quotient = a/b;
        System.out.println("sum is "+ sum );
        System.out.println("difference is "+ difference );
        System.out.println("product is "+ product );
        System.out.println("quotient is "+ quotient);
    }
}
