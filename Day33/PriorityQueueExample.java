import java.util.PriorityQueue;


public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println("Display elements: "+ pq);
        System.out.println( "Highest priority element " + pq.peek());

        pq.poll();
        System.out.println("Updated Queue " + pq);
   

    }
    
}
