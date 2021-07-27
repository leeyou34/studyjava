package ch04_2_Repeat_for_while_do_while;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
		System.out.println(i);
		}

	}

}
