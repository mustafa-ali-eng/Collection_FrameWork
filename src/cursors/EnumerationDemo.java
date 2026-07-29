package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {

        Vector list = new Vector();

        list.addElement(1);
        list.addElement("ABC");
        list.addElement('M');
        list.addElement(null);
        list.addElement(true);
        list.addElement(2345.8734f);
        list.addElement(false);

        System.out.println(list);

        list.removeElementAt(2);
        System.out.println(list);

        System.out.println(list.set(4, "Ali"));

        System.out.println(list.get(4));

        System.out.println(list);

        System.out.println("***********************");

        // Enumeration cursor
        Enumeration elements = list.elements();

        while (elements.hasMoreElements()) {

            System.out.println(elements.nextElement());

        }
    }
}
