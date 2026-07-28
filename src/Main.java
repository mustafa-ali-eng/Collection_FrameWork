import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Mustafa Ali in new concept Collection-Frame-Work... ");

        ArrayList al=new ArrayList();
        al.add("Mustafa");
        al.add("Ali");
        al.add(123);
        al.add(null);
        al.add(345.65f);

        System.out.println(al);

        System.out.println("***************");
        System.out.println(al.toString());

    }
}