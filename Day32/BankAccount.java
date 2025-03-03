public class BankAccount {
    int balance;
    public static void main(String[] args) {
        
    }
    public BankAccount( int balance){
        this.balance= balance;

    }
  
    public static void  deposit(){
        int deposit = 500;
        balance += deposit;

    }
    public static void  withdraw(){
        int withdraw = 700;
        balance -= withdraw;

    }
    public static void  displayBalance(){

    }

    
}
