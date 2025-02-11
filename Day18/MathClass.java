import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        
        // maximum and minimum 
        System.out.println(Math.max(f1, f2));
        System.out.println(Math.min(f1, f2));

        // 
        System.out.println(Math.sqrt(Math.abs(f1-f2)));

  

        System.out.println(Math.pow(f1, f2));
    }
    
}
