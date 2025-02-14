import java.util.PriorityQueue;

public class PriorityQueueA {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(90);
        pq.offer(60);
        pq.offer(80);
        pq.offer(100);
        pq.offer(70);
        System.out.println(pq);

        pq.poll();
        System.out.println("Highest priority element is : " + pq);

    }
    
}
