import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the num " + i) ;
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of the element is " + sum);
    }
}
