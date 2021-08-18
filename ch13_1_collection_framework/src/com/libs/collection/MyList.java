package com.libs.collection;
/*
 * for 자료구조 구현을 위한 매소드 규격을 정의한 인터페이스 작성
 * @author thomas
 */
public interface MyList {

	public abstract void add(int num);
	public abstract int get(int idx);
	public abstract int size();
	public abstract void remove(int idx);
	public abstract void clear();
}
