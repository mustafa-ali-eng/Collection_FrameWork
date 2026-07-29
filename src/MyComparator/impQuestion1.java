package MyComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class impQuestion {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet(new MyComparator3());
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("ABC"));
        ts.add(new StringBuffer("AA"));
        ts.add("XX");
        ts.add("ABCD");
        ts.add("A");

        System.out.println(ts);


    }
}

class MyComparator3 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String obj1 = o1.toString();
        String obj2 = o2.toString();

        int l1 = obj1.length();
        int l2 = obj2.length();

        if (l1 > l2) {
            return 1;
        }
        else if (l1 < l2) {
            return -1;
        }
        else {
            return obj1.compareTo(obj2);
        }
    }
}