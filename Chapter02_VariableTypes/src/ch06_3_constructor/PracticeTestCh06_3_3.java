package ch06_3_constructor;

public class PracticeTestCh06_3_3 {
	public class Board {
		String title;
		String content;
		String writer;
		String date;
		int hitcount;

		Board(String title, String content) {
			this(title, content, "logged-in ID", "Current date of the computer", 0);
		}
		
		Board(String title, String content, String writer) {
			this(title, content, writer, "Current date of the computer", 0);
		}
		
		Board(String title, String content, String writer, String date) {
			this(title, content, writer, date, 0);
		}
		
		Board(String title, String content, String writer, String date, int hitcount) {
			this.title = title;
			this.content = content;
			this.writer = writer;
			this.date = date;
			this.hitcount = hitcount;
			
		}
		
//		Board(String title, String content) {
//			this.title = title;
//			this.content = content;
//			this.writer = "logged-in ID";
//			this.date = "Current date of the computer";
//			this.hitcount = 0;
//			
//		}
//		
//		Board(String title, String content, String writer) {
//			this.title = title;
//			this.content = content;
//			this.writer = writer;
//			this.date = "Current date of the computer";
//			this.hitcount = 0;
//			
//		}
//		
//		Board(String title, String content, String writer, String date) {
//			this.title = title;
//			this.content = content;
//			this.writer = writer;
//			this.date = date;
//			this.hitcount = 0;
//			
//		}
//		
//		Board(String title, String content, String writer, String date, int hitcount) {
//			this.title = title;
//			this.content = content;
//			this.writer = writer;
//			this.date = date;
//			this.hitcount = hitcount;
			
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
