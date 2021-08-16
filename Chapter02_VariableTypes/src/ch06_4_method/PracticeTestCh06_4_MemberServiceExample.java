package ch06_4_method;

public class PracticeTestCh06_4_MemberServiceExample {

	public static void main(String[] args) {
		PracticeTestCh06_4_MemberService memberService = new PracticeTestCh06_4_MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("it is loged in.");
			memberService.logout("hong");
		} else {
			System.out.println("Id of password is incorrect.");
		}

	}

}
