import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] integers = {2,3,4,6,8,5,1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        //minimum value
        for (int i : integers) {
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
            sum +=i; 
        }
        System.out.println(min); 
        System.out.println(max);
        System.out.println(sum);
        double average = sum/ integers.length;
        System.out.println(average);
        Arrays.sort(integers);
        System.out.println( Arrays.sort(integers));
        //print?
    }
    
}
