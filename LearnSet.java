import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args)
    {
        Set<Integer> s = new HashSet<>();

        s.add(1);
        s.add(5);
        s.add(100);
        s.add(50);

        System.out.println(s);

        s.remove(5);
        System.out.println(s);

        System.out.println(s.contains(100));
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
        System.out.println(s);

        System.out.println("\nLinked Hash Set");
        Set<Integer> ls = new LinkedHashSet<>();

        ls.add(1);
        ls.add(5);
        ls.add(100);
        ls.add(50);

        System.out.println(ls);

        s.remove(5);
        System.out.println(ls);

        System.out.println(ls.contains(100));
        System.out.println(ls.isEmpty());
        System.out.println(ls.size());
        s.clear();
        System.out.println(ls);
        
        

        // also learn .equals, toString() overrride and hashCode() override

    }
}
