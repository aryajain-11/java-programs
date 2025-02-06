public class StrC {
    public static void main(String[] args) {
        String s = "My name is Arya ";
        System.out.println(s.indexOf('a'));
        System.out.println(s.substring(3,7 ));
        System.out.println(s.replace('a','e'));
        String  words[] = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
 
    }
    
}
