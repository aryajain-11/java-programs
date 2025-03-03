public class NumberPrinter implements Runnable {
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new NumberPrinter());
        t.start();
    }
}
