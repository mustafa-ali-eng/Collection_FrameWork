package MyComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class String_sort {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComparator1());

        ts.add("c");
        ts.add("a");
        ts.add("e");
        ts.add("b");
        ts.add("f");
        ts.add("g");
        ts.add("h");
        ts.add("d");

        System.out.println(ts);
    }

}

class MyComparator1 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {


        return -o1.compareTo(o2);
    }
}