package com.libs.collection;

public class MyIntList {
	//field
	private int[] arr;
	private int cursor;
	
	
	//constructor
		public MyIntList(int amount) {
			this.arr = new int[amount];
			cursor = 0;
		}
	
	//method
	
	public void add(int num) {
		arr[cursor] = num;
		cursor++;
		
	}
	public void remove(int i) {

	}
		
	public int get(int idx) {
		return arr [idx];
	}
	
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
	}
}
