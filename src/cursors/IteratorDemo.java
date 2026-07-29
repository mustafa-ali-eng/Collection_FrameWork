package cursors;
import java.util.Iterator;
import java.util.ArrayList;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
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

        System.out.println("************************");

        //Iterator

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if(next==(null)) continue;
            if(next.equals("Ali"))
            {
                iterator.remove();
            }
            System.out.println(next);
        }

        System.out.println(list);

    }

}
