import java.util.ListIterator;
import java.util.LinkedList;
public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ListIterator<Integer> it = list.listIterator(list.size());
        
            while(it.hasPrevious()){
                System.out.println(it.previous());
            }
    }
}
