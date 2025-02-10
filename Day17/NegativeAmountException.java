import java.util.Scanner;

 public class NegativeAmountException extends Exception { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount ");
        try {
            double amount = sc.nextDouble();
            processPayment(amount);
        } catch (NegativeAmountException e) {
          System.out.println("Amount is negative");
        }
    }
    public static void processPayment(double amount) throws NegativeAmountException{
        if(amount<0){
            throw new  NegativeAmountException();
        }
    }
}


    

