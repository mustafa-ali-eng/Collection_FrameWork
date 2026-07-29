package cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_IteratorDemo {
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

        System.out.println("******************************");

       ListIterator iterator = list.listIterator();
       while(iterator.hasNext())
        {
            System.out.println("index = "+iterator.nextIndex());
            Object next = iterator.next();
            System.out.println(next);

            if(next==null)
            {
                iterator.remove();
            }
        }
        System.out.println(list);

        System.out.println("****************");
        iterator.add(null);
       while (iterator.hasPrevious())
           {
               System.out.println("Previous index = "+iterator.previousIndex());
            Object next = iterator.previous();
            System.out.println(next);



            if(next==null)
            {
                iterator.set("Yes Null added now set..");
            }
           }

       System.out.println(list);


    }
}
