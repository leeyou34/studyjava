package object;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 are equal.");
		} else {
			System.out.println("obje1 and obj2 are unequal.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 and obj3 are equal.");
		} else {
			System.out.println("obj1 and obj3 are unequal.");
		}

	}

}
