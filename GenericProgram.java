package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericProgram {

	public static void main(String[] args) {
		List<String> red_bag=new ArrayList<String>();
		red_bag.add("tomato");
		red_bag.add("potato");
		
		List<String> yellow_bag=new ArrayList<String>();
		yellow_bag.add("spinach");
		yellow_bag.add("cabbage");
		
		List<List<String>>Bolero=new ArrayList();
		Bolero.add(red_bag);
		Bolero.add(yellow_bag);
		
Iterator<List<String>> itr=Bolero.iterator(); 
while(itr.hasNext()) {
	List<String>bags=itr.next();
	Iterator<String>itr1=bags.iterator();
	while(itr1.hasNext()) {
		String vegetables =itr1.next();
		System.out.println(vegetables);
	}
}
		
		
		
	
	
	
	}

}
