package com.libs.collection;
/*
 * for 자료구조 구현을 위한 매소드 규격을 정의한 인터페이스 작성
 * @author thomas
 */
public interface MyList<E> {

	public abstract void add(E element);
	public abstract E get(int idx);
	public abstract int size();
	public abstract void remove(int idx);
	public abstract void clear();
}
