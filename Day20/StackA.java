import java.util.Stack;

public class StackA {
    public static void main(String[] args) {
        Stack<Integer> series = new Stack<>();

        series.push(10);
        series.push(20);
        series.push(30);
        series.push(40);
        series.push(50);

        System.out.println(series);

        while(!series.isEmpty()){
            System.out.println(series.pop());
            System.out.println(series);
        }


    }
    
}
