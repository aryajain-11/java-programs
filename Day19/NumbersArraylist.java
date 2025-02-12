import java.util.ArrayList;
import java.util.Scanner;
public class NumbersArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(17);
        numbers.add(20);
        numbers.add(30);
        numbers.add(39);

        for (Integer integer : numbers) {
            System.out.println(integer);
        }

        System.out.println(numbers);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num = sc.nextInt();

        for (Integer integer : numbers) {
            int i = integer%num;
            if(i==0){
                System.out.println(numbers.remove(integer));
            }
           
        }
        System.out.println(numbers);
        sc.close();
    
}
}
