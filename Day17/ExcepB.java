import java.util.Scanner;;
public class ExcepB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
       try{
        int age = sc.nextInt();
        validateAge(age);
       } catch(IllegalArgumentException e){
        System.out.println("age is must be greater than 18");
       }
       sc.close();
       
    }
    public static void validateAge(int age) throws  IllegalArgumentException {
        
            if(age<18){
                throw new  IllegalArgumentException();
            }
    }
}
