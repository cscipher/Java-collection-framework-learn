import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(24);
        adq.offer(28);
        adq.offer(25);
        adq.offer(8);
        adq.offer(3);

        //Special features of array deque
        adq.offerFirst(12);
        adq.offerLast(99);

        System.out.println(adq);

        //same goes for peek and poll --> poll(),pollFirst(),pollLast() :: peek(),peekFirst(),peekLast()

    }
}
