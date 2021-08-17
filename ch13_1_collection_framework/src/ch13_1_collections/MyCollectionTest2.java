package ch13_1_collections;

import com.libs.collection.MyIntList;

public class MyCollectionTest2 {

	public static void main(String[] args) {

		MyIntList list = new MyIntList(3);
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		//ArrayIndexOutOfBoundsException needs to be resolved.
		//list.add(7);
		
		// resolve the delete.
		// [1,3,5] -> [1.5]
		list.remove(1);
		
		// |0|0|0|0|
		list.clear();
		
		System.out.println(list);
		System.out.println("list[2] value: " + list.get(2));
		System.out.println("size: " + list.size());
		System.out.println("=============================");

	}

}
