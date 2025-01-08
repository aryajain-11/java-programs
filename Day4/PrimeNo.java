import java.util.Scanner;
public class PrimeNo {
    public static void numberIsPrime(int n ){
        if(n==0 || n == 1){
            System.out.println("Number is not prime ");
        }
        else if (n==2){
            System.out.println("Number is prime ");
        }
         else if (n%2 == 0){
            System.out.println("Number is not prime");
        } 
         else{
            System.out.println("Number is prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        numberIsPrime(n);
    }
}
