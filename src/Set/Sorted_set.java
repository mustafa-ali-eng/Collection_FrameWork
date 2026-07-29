package Set;

import java.util.TreeSet;

public class Sorted_set {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(6);
        ts.add(7);
        ts.add(3);
        ts.add(4);
        ts.add(8);
        ts.add(1);
        ts.add(2);
        ts.add(5);


        System.out.println(ts);

        System.out.println("******************");
        System.out.println("First ="+ts.first());
        System.out.println("Last ="+ts.last());
        System.out.println("******************");

        System.out.println(ts.headSet(3));
        System.out.println(ts.tailSet(3));
        System.out.println("******************");

        System.out.println(ts.subSet(3, 5));
        System.out.println("******************");
        System.out.println(ts.comparator());


    }
}
