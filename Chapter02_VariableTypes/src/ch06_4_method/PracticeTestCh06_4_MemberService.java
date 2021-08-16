package ch06_4_method;

public class PracticeTestCh06_4_MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("It has logout.");
	}
}
