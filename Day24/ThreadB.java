public class ThreadB extends Thread {
    public void run(){
        System.out.println("Hello from Thread class");
    }
}
class Main{
    public static void main(String[] args) {
        ThreadB o1 = new ThreadB();
        o1.start();
    }
}
