import java.util.PriorityQueue;

public class PriorityQueueA {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(90);
        pq.add(60);
        pq.add(80);
        pq.add(100);
        pq.add(70);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

    }
    
}
