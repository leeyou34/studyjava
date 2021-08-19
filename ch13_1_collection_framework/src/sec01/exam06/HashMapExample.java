package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map collection constructor
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//stored theobject
		map.put("Thomas",  85);
		map.put("Jefferson",  90);
		map.put("Peterson",  80);
		map.put("Jefferson",  95);
		System.out.println("Total Entry trial: " + map.size());
		
		// searching the object
		System.out.println("\tJefferson : " + map.get("Jefferson"));
		System.out.println();
		
		// process the object each
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// removing the object
		map.remove("jefferson");
		System.out.println("Total Entry trial: " + map.size());
	
		// process the object each
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator= entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " +value);
		}
		System.out.println();
		
		// remove whole object.
		map.clear();
		System.out.println("total Entry trial:" + map.size());
	}
}
