import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0 ;
        for (int i = 0; i < n ; i++) {
            int num = sc.nextInt();
            
            System.out.println(arr[i]);
            count++;

            
        }
        System.out.println(count);
    }
}
