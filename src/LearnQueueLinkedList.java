import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10); // use offer instead of add coz it throws exception when errors emerge!
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);
        System.out.println(q.poll());  // use poll instead of element coz it throws exception when errors emerge!
        System.out.println(q);
    }
}
