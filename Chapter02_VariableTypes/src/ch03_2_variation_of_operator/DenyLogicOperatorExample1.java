package ch03_2_variation_of_operator;

public class DenyLogicOperatorExample1 {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play; // ! 느낌표는 논리 부정 연산자로서 variable,변수,앞에 붙일 경우 not이라는 기능을 적용한다.
		System.out.println(play);
		
		play = !play;
		System.out.print(play);

	}

}
