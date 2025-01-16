public class Calculator {
    public int multiply(int a, int b) { 
        System.out.println("Product of int multiply is: " + a * b);
        return a * b;
    }

    public double multiply(double a, double b) {
        System.out.println("Product of double multiply is: " + a * b);
        return a * b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.multiply(4, 2);
        obj.multiply(2.2, 4.0);
    }
}
// javac Calculator.java 
// java Main

