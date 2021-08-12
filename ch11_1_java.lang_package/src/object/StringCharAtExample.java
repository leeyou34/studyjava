package object;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("This person is male");
			break;
		case '2':
		case '4':
			System.out.println("this person is female.");
		}

	}

}
