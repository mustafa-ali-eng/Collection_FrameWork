package MyComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;


class Employee{
     int id;
     String name;
     int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }




    @Override
    public String toString() {
        return "\nEmployee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }



}

public class impQuestion2 {
    public static void main(String[] args) {

             TreeSet list = new TreeSet(new MyComparator6());
             list.add(new Employee(5,"E",1700));
             list.add(new Employee(3,"C",1400));
             list.add(new Employee(2,"B",2300));
             list.add(new Employee(6,"F",2800));
             list.add(new Employee(4,"D",1600));
             list.add(new Employee(1,"A",1200));


        System.out.println(list);


    }
}

class MyComparator6 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee obj1 = (Employee)o1;
        Employee obj2 = (Employee)o2;

        int id1 = obj1.id;
        int id2 = obj2.id;

        if (id1 > id2) {
            return 1;
        }
        else if (id1 < id2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}