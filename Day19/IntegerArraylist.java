import java.util.ArrayList;
import java.util.Collections;
public class IntegerArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        for(int i = 0; i<10;i ++){
            int num = (int)(Math.random() * (100-1+1) + 1);
            System.out.println(num);
            list.add(num);
        }
        System.out.println(list);
        System.out.println("prints the largest : " + Collections.max(list));
        System.out.println("prints the smallest : " + Collections.min(list));
    }
    
}
