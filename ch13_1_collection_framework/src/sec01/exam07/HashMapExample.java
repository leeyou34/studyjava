package sec01.exam07;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "Jefferson"), 95);
		map.put(new Student(1, "Jefferson"), 95);

		System.out.println("total Entry trial: " + map.size());
	}

}
