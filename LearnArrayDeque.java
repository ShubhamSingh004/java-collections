import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(1); // last
        adq.offerFirst(2); // first
        adq.offerLast(45);

        System.out.println(adq); // [1, 1, 45]

        System.out.println(adq.peek()); // front - 2

        System.out.println(adq.poll()); // 2
        System.out.println(adq.pollLast()); // last - 45

        System.out.println(adq); // [1]

        

    }
}
