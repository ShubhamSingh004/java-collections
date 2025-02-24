import java.util.PriorityQueue;
// import java.util.Comparator;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args)
    {
        Queue<Integer> pq = new PriorityQueue<>();
        // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  FOR MAX HEAP

        pq.offer(40);
        pq.offer(5);
        pq.offer(10);

        System.out.println(pq); // [5, 40, 10]

        pq.offer(1);
        System.out.println(pq); // [1, 5, 10, 40]

        System.out.println(pq.poll()); // 1
        System.out.println(pq);

        // min heap being used under the hood

    }
}
