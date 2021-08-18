package sec01.exam02;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("title1", "Contents1", "Author1"));
		list.add(new Board("title2", "Contents2", "Author2"));
		list.add(new Board("title3", "Contents3", "Author3"));
		list.add(new Board("title4", "Contents4", "Author4"));
		list.add(new Board("title5", "Contents5", "Author5"));
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
	}

}
