package ch05_1_reference_variable;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("reference for" + strVar1 + "and " + strVar2 + "are equal");
		} else {
			System.out.println("reference for" + strVar1 + "and " + strVar2 + "are unequal");
		}
		
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("The strings for" + strVar1 + "and " + strVar2 + "are equal");
		} else {
			System.out.println("The strings for" + strVar1 + "and " + strVar2 + "are unequal");
		}
	
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
	
		if(strVar3 == strVar4) {
			System.out.println("reference for" + strVar1 + "and " + strVar2 + "are equal");
		} else {
			System.out.println("reference for" + strVar1 + "and " + strVar2 + "are unequal");
		}
		
		if(strVar3.contentEquals(strVar4)) {
			System.out.println("The strings for" + strVar1 + "and " + strVar2 + "are equal");
		} else {
			System.out.println("The strings for" + strVar1 + "and " + strVar2 + "are unequal");
		}
	}

}
