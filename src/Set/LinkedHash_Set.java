package Set;

import java.util.LinkedHashSet;

public class LinkedHash_Set {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
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
