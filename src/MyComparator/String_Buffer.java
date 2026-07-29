package MyComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class String_Buffer {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator5());

        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("F"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("K"));
        ts.add(new StringBuffer("E"));


        System.out.println(ts);
    }

}

class MyComparator5 implements Comparator<StringBuffer> {
    @Override
    public int compare(StringBuffer s1, StringBuffer s2) {
        String str1 = s1.toString();
        String str2 = s2.toString();

        return -str1.compareTo(str2);
    }
}
