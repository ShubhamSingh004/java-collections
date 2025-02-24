import java.util.Stack;

public class LearnStack {
    public static void main(String[] args)
    {
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);

        System.out.println(s);

        s.pop();
        System.out.println(s);

        System.out.println(s.peek());
    }
}
