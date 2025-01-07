public class fibonacci {
    public static void main(String[] args) {
// fibonacco 0 1 1 2 3 5 8 13 21 34 
       int a = 0;
       int b = 1;
       System.out.print(a + " " + b  + " ");
       int c ;
    for(int i = 1; i <= 8; i ++){
        c = a+b;
        System.out.print(c +" ");
        a = b ;
        b = c;
    }
    }
}
