package collection;
import java.util.ArrayList;
import java .util.List;
public class usingSomeMethods {

	public static void main(String[] args) {
		List l=new ArrayList();//parent refrence hold child object
		
	//	ArrayList l1= new ArrayList();//refrence holds own object
		l.add(10);
		l.add(50);
		l.add("Mohini");
		l.add('A');
		l.add('B');
		l.add('C');
		l.add('E');
		l.add('F');
		l.add(null);
		System.out.println(l);
		
		System.out.println(l);
		l.add(6, 'D');
		System.out.println(l);
		// l.addAll(2, l);//use to print given index element twice
		 //System.out.println(l);
		// l.addFirst(5);//adding element at 0th index
		 System.out.println(l);
		 //l.addLast("A to F");
		 System.out.println(l);
		// l.clear();
		// System.out.println(l);
		 boolean containsList = l.contains(l);
	        System.out.println("Does the list contain itself? " + containsList);

	}

}
