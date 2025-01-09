import java.util.Scanner;
public class PrimeNo {
    
    public static void numberIsPrime(int n ){
        
       for(int i = 2 ; i<=n-1;i++){
        if(n%i==0){
            boolean isPrime = true;
        }
        else{
            boolean isPrime  = true;
        }
        
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(isPrime = true){
            System.out.println("number is prime ");
        }
        else{
            System.out.println("not prime");
        }
        numberIsPrime(n);
    }
}
