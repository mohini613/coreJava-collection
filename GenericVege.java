package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class GenericVege {
public static void main(String[] args) {
			List<String> red_bag=new ArrayList<String>();
			red_bag.add("tomato");
			red_bag.add("potato");
			
			List<String> yellow_bag=new ArrayList<String>();
			yellow_bag.add("spinach");
			yellow_bag.add("cabbage");
			

			List<List<String>>Supra=new ArrayList<>();
			Supra.add(red_bag);
			Supra.add(yellow_bag);
		
			List<String> purple_bag=new ArrayList<String>();
			purple_bag.add("Coriender");
			purple_bag.add("bottelgourd");
			
			List<String> green_bag=new ArrayList<String>();
			green_bag.add("pumpkine");
			green_bag.add("bellpaper");
			
			List<List<String>>DodgeCharger=new ArrayList<>();
			DodgeCharger.add(purple_bag);
			DodgeCharger.add(green_bag);
	
			 List<List<List<String>>>parkingLot=new ArrayList<>();
		        parkingLot.add(Supra);
		        parkingLot.add(DodgeCharger);
			
		        Iterator<List<List<String>>>parkingLotItr=parkingLot.iterator();
		        while (parkingLotItr.hasNext()) {
		            List<List<String>>car=parkingLotItr.next();
		            Iterator<List<String>> carItr=car.iterator();
		            while (carItr.hasNext()) {
		                List<String> bags=carItr.next();
		                Iterator<String>bagsItr=bags.iterator();
		                while (bagsItr.hasNext()){
		                    String vegetable=bagsItr.next();
		                    System.out.println(vegetable);
}
}
		        }
}
}


