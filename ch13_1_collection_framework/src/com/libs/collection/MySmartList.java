package com.libs.collection;

public class MySmartList<E> implements MyList<E>{

	// declare the field
	/// the array that element would be saved
	private Object[] elementData ;
	
	/// the length of current array
	private int capacity;
	
	///the array's capacity that would be extended
	private final int amount;
	
	///current location of array element.
	private int cursor;
	
	// constructor
	MySmartList(int amount){
		this.capacity = amount;
		elementData = new Object[capacity];
		cursor = 0;
	}
	
	public MySmartList() {
		this(3);
	}
	
	
	// method
	@Override
	public void add(int num) {
		
	}
	
	@Override
	public E get(int idx) {
		return arr [idx];
	}
	
	@Override
	public int size() {
		return cursor;
	}
	
	@Override
	public void remove(int idx) {
		// if idx is the last for removing then it should give 0
				if(idx != cursor -1 ) {
					System.arraycopy(arr,  idx + 1, arr, idx, (cursor-1) -idx);
				}
	}
	
	@Override
	public void clear() {
		arr = new int[amount];
		capacity = amount;
		cursor = 0;  
	}
}
