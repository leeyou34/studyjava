package com.libs.collection;

public class MyIntList<E> {
	//field
	
	/// the array that element would be saved
	private int[] arr;
	
	/// the length of current array
	private int capacity;
	
	///the array's capacity that would be extended
	private final int amount;
	
	///current location of array element.
	private int cursor;
	
	
	//constructor
		public MyIntList(int amount) {
			this.amount = amount;
			this.capacity = this.amount;
			this.arr = new int[capacity];
			cursor = 0;
		}
	
	//method
	/// add element(요소)
	public void add(int num) {
		// check if it's possible to over exceed the capacity.
		if(arr.length < cursor) {
			//create new array
			int[] tempArr = new int[capacity + amount];
			//copying array operation
			System.arraycopy(arr, 0, tempArr,0, arr.length);
			/// changing reference type
			arr = tempArr;
			capacity += amount;
		}
		arr[cursor++] = num;
		
		//cursor++;
		
	}///delete element
	public void remove(int idx) {
		// if idx is the last for removing then it should give 0
		if(idx != cursor -1 ) {
			System.arraycopy(arr,  idx + 1, arr, idx, (cursor-1) -idx);
		}
	}
		/// get the element
	public int get(int idx) {
		return arr [idx];
	}
	/// 개수 element
	public int size() {
		return cursor;
	}
	
	@Override
	public String toString() {
		String tmp ="";
		for(int i : arr ) {
			tmp +=i + ",";
		}
		return "[" + tmp + "]";
	}
	
	public void clear() {
		arr = new int[amount];
		capacity = amount;
		cursor = 0;  
	}
}
