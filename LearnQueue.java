import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        System.out.println(q);

        System.out.println(q.poll()); // returns null if empty
        System.out.println(q); // [2]

        System.out.println("PeeK: "+ q.peek()); // null if queue empty


        // add() throws exception if ele not added 
        // element() same as peek() but throws exception
        // remove() throws exception
        // 

    }
}
