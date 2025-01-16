public class Account {
    private int accountNumber;
    public String accountHolderName;
    protected double balance;

    private Account(int accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public  void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }  
}
class SavingsAccount extends Account {
    public static void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);

    }
    class demo{
        public static void main(String[] args) {
            demo obj = new demo();
            obj.displayAccountInfo();
        }
    }

}

