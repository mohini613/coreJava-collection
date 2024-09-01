package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddAll {

    public static void main(String[] args) {
        // Use generics for type safety and to avoid warnings
        List<Object> l = new ArrayList<>();
        l.add('A');
        l.add('B');
        l.add('C');
        l.add('H');
        l.add('H');
        l.add('D');
        l.add('E');
        l.add('H');
        l.add('F');
        l.add('G');
        l.add('H');
        l.add('I');
        System.out.println(l);

       

      // Create another list to use with addAll
        List<Object> l2 = new ArrayList<>();
       // l2.add(1);
     //   l2.add(9);
l.remove(0);
        // Use addAll to add all elements from l2 into l
        l.addAll(l2);
        System.out.println(l);
    }
       
}
