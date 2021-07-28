package ch04_1_coditional_if_and_switch_statement;

public class SwitchPracticeExample {

	public static void main(String[] args) {
		int n = (int)(Math.random()*100);
		System.out.println(n);
		
		int num = n/10;
		System.out.println(num);
//		if(n>=0 && n <10) {
//			System.out.println("0이상 10미만의 수");
//		} else if(n>=10 && n <20) {
//			System.out.println("10이상 20미만의 수");
//		} else if(n>=20 && n <30) {
//			System.out.println("20이상 30미만의 수");
//		} else {
//			System.out.println("you put down the wrong value on variable");
//		}
		switch(num) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("0이상 10미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
		}
	
	}
}
