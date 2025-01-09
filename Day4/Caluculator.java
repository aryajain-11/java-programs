import java.util.Scanner;
public class Caluculator {
    public  static int sum(int a, int b){
        int add = a+b;
       // System.out.println("add is " + add);
        return add;
    }
    public  static int subtract (int a , int b ){
        int difference = a-b;
        return difference ;
    }
    public static int multiply (int a, int b){
        int product =  a*b;
        return product;
    }
    public static int divide (int a , int b ){
        if(b!=0){
        int quotient = a/b;
        return quotient;
        }
       else{
        System.out.println("divide by zero is not allowed");
        return -1;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int addition =  Caluculator.sum(a,b);
        System.out.println("sum is " + addition );
        int substraction = Caluculator.subtract (a,b);
        System.out.println("difference  is " + substraction );
        int multiplication  = Caluculator.multiply(a,b);
        System.out.println("multiply  is " + multiplication );
        int division = Caluculator.divide(a,b);
        System.out.println("divide  is " + division );


    }
}
