import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount ");
        double principal = sc.nextDouble();
        System.out.println("Enter rate  ");
        double rate = sc.nextDouble();
        System.out.println("Enter time  ");
        double time = sc.nextDouble();
       
        double interest = (principal *rate*time)/100;
        System.out.println("The value of interst amount is " + interest);
    }
    
}
