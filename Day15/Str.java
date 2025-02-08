import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        // uppercase
        System.out.println(name.toUpperCase());

        // reverse
        String rev = "";
        for(int i = name.length()-1; i >= 0 ; i--){
            System.out.print(name.charAt(i) + " ");
            rev += name.charAt(i);
        }
         System.out.println();
        if(name.equals(rev)){
            System.out.println(name + " is a pallindrome string ");
        }
        else{
            System.out.println(name + " is not a pallindrome string ");
        }
        
        // count vowel
        int count = 0 ;
        for(int i = 0 ; i < name.length();i ++){
        char ch = name.charAt(i);
        if(ch=='a' || ch == 'e' || ch=='i' || ch=='o' || ch =='u'){
            count++;
        }
      }
      System.out.println("number of vowels in the name " + count );
      
      sc.close(); 
   }
}
