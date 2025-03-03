public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int  result = 4/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
    
}
