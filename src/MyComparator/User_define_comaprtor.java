package MyComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class User_define_comaprtor {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(new MyComparator());

        ts.add(6);
        ts.add(7);
        ts.add(3);
        ts.add(4);
        ts.add(8);
        ts.add(1);
        ts.add(2);
        ts.add(5);


        System.out.println(ts);
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // Methode -1
//        return -o1.compareTo(o2);

        // Methode -2

        if (o1 < o2) {
            return +1;
        }
        else if (o1 > o2) {
            return -1;
        }else {
            return 0;
        }
    }
}