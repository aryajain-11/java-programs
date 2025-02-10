public class ExcepA {
   
    public static int divideNumbers(int num1,int num2){
        try{
            int result = num1/num2;
            System.out.println("result is " + result);
        }
       catch(ArithmeticException e){
        System.out.println(e);
       }
        finally{
            System.out.println("Operation Completed");
        }
        return 1;
    }
   
    public static void main(String[] args) {
        
      int result =divideNumbers(10,0);
      System.out.println("result is " + result);
      
    }
    
}
