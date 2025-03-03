import java.util.Scanner;

public class FibonacciSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0;
       int  b = 1;
       int  sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println(sum);
    }
    
}
