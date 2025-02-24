import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Two", 22); // over writes

        
        System.out.println(map);
        System.out.println(map.containsKey("Two"));
        System.out.println(map.containsValue(3));

        map.putIfAbsent("Two", 222);
        System.out.println(map);

        System.out.println("\nIterate over");

        for(Map.Entry<String, Integer> e: map.entrySet())
            System.out.println(e);

        System.out.println("\nOnly keys");

        for(String key: map.keySet())
            System.out.println(key);


            System.out.println("\nOnly value");

            for(Integer val: map.values())
                System.out.println(val);

        System.out.println(map.isEmpty());

        map.remove("Two");
        System.out.println(map);


        System.out.println("\nTree Map");
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("One", 1);
        tm.put("Two", 2);
        tm.put("Two", 22); // over writes

        
        System.out.println(tm);
        System.out.println(tm.containsKey("Two"));
        System.out.println(tm.containsValue(3));

    }
}
