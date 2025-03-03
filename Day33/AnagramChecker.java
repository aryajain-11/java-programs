import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2");
        String str2 = sc.nextLine();
       
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
          }
          else{
            System.out.println("NOt Anagrams");
          }
    
}
}
