import java.util.Arrays;
public class ArrayAnalyzer {
    public static void main(String[] args) {
       
        int[] arr = {10, 20, 4, 45, 99, 15};
        int n = arr.length;
        Arrays.sort(arr);
        int secondLargest = arr[n-2];
       
        System.out.println("Second Largest Number: " + secondLargest);
    
    }
}
