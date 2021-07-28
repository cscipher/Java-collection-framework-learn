import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // It implements min-heap under the hood! If you want to convert it into max heap, then pass a comparator in the parameter : 'Comparator.reverseOrder()'

        pq.offer(24);
        pq.offer(123);
        pq.offer(3);
        pq.offer(32);
        pq.offer(9);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

    }
}
