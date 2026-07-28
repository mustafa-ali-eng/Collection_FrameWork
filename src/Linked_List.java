import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
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
