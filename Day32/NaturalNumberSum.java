import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        sumOfFirstNaturalNumber();
    }
    public static void sumOfFirstNaturalNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        int sum = 0;
      
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first N natural numbers : "+ sum);
     
    }
}
