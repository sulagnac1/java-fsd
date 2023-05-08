package demo;
import java.util.*;


public class Map_interface {
	public static void main(String[] args) {
		// Creating a map
		
		HashMap<Integer , String> map = new HashMap<>();
		
		// Adding element
		
		map.put(1, "Hello !");
		map.put(2, "I");
		map.put(3, "am");
		map.put(4, "Sulagna");
		map.put(5, "Chatterjee");
		
		// Traversing map
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}


}
