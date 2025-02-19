public class OuterClass {
    static class  InnerClass{
        public void displayMessage(){
            System.out.println("Hello from static inner class");
        }
    }
}
class Main{
    public static void main(String[] args) {
       OuterClass.InnerClass inner = new OuterClass.InnerClass();
       inner.displayMessage();
    }
}
