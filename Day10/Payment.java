public interface Payment {

    public void makePayment(double amount);
    public void refundPayment(double amount);

} 
class CreditCardPayment implements Payment{
    public void makePayment(double amount){
        System.out.println("Payment made using Credit Card");
    }
    public void refundPayment(double amount){
        System.out.println( "Payment refunded to Credit Card" );
    }
 }   
class PaypalPayment implements Payment{
    public void makePayment(double amount){
        System.out.println("Payment made using PayPal");
    }

    public void refundPayment(double amount){
        System.out.println( "Payment refunded to PayPal"  );
    }
}
class Main{
    public static void main(String[] args) {
        CreditCardPayment obj = new CreditCardPayment();
        obj.makePayment(487);
        obj.refundPayment(400);
        PaypalPayment obj2 = new PaypalPayment();
        obj2.makePayment(500);
        obj2.refundPayment(450);
    }
}
