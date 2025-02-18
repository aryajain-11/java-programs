public class ThreadA implements Runnable  {
    
       public void run(){
            System.out.println("Hello from Runnable thread");
        }
}
class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadA());
        t1.start();
    }
}
