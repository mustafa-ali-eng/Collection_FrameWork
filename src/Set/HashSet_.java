package Set;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("abc");
        hs.add(123);
        hs.add("abc");
        hs.add(null);
        hs.add(false);
        hs.add(234.4854f);
        hs.add(null);
        hs.add("mustafa");
        hs.add(true);


        System.out.println(hs);


    }
}
