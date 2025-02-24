import java.util.ArrayList;
import java.util.Iterator;

class LearnArrayList{
    // Can add multiple elements without worrying about the size
    public static void main(String[] args)
    {
        ArrayList<String> studentsName = new ArrayList<>();
        ArrayList<String> studentsName2 = new ArrayList<>();

        studentsName.add("Shubham"); // at the end
        studentsName.add("Shubham2"); // at the end
        System.out.println(studentsName);

        studentsName.add(1, "Shubham 00");
        System.out.println(studentsName);

        studentsName2.add("2Shubham"); // at the end
        studentsName2.add("2Shubham2"); // at the end

        studentsName.addAll(studentsName2);
        System.out.println(studentsName);

        System.out.println(studentsName.get(2));
        System.out.println(studentsName.getFirst());
        System.out.println(studentsName.getLast());


        System.out.println("Remove");

        studentsName.remove(3);
        System.out.println(studentsName);

        studentsName.remove(String.valueOf("Shubham 00"));
        System.out.println(studentsName);

        studentsName.set(2, "Changed Shubham");
        System.out.println(studentsName);


        System.out.println(studentsName.contains("Shubham"));


        for(int i = 0; i< studentsName.size(); i++)
            System.out.println(studentsName.get(i));
        
        System.out.println("\nFor each");

        for(String s: studentsName)
            System.out.println(s);

        System.out.println("\nIterator");

        Iterator<String> it = studentsName.iterator();

        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        studentsName.clear();
        System.out.println(studentsName);

    }
}