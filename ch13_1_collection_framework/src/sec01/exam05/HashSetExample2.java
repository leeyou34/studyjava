package sec01.exam05;

import java.util.*;

public class HashSetExample2 {
	public static void main(String [] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("Thomas", 30));
		set.add(new Member("Thomas", 30));

		System.out.println("the amount of total object : " + set.size());
	}
}
