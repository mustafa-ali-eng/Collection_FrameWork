
import java.util.Vector;

public class Vector_ {

        public static void main(String[] args) {
            Vector list = new Vector();
            list.addElement(1);
            list.addElement("ABC");
            list.addElement('M');
            list.addElement(null);
            list.addElement(2345.8734f);

            System.out.println(list);

            list.removeElementAt(2);
            System.out.println(list);


            System.out.println(list.set(4,"Ali "));

            System.out.println(list.get(4));

        }

}
