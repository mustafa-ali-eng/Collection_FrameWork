import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("ABC");
        list.add('M');
        list.add(null);
        list.add(2345.8734f);

        System.out.println(list);

        list.remove(2);
        System.out.println(list);


        System.out.println(list.set(4,"Ali"));

        System.out.println(list.get(4));

    }
}
