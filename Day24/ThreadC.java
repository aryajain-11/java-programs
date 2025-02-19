public class ThreadC implements Runnable {
    public void run(){
        for(int i =1; i<=5;i++){
            System.out.println(i);
        }
    }
}
class otherThread implements Runnable{
    public void run(){
        for(int i = 1; i<=5;i++){
            System.out.println("Thread B");
        }
    }
}
class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadC());
        Thread t2 = new Thread(new otherThread());
        t1.start();
        t2.start();
    }
}
