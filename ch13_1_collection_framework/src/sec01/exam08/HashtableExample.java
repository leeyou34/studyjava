package sec01.exam08;

import java.util.*;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("please input ID and Password.");
			System.out.print("ID: ");
			String id = scanner.nextLine();
			
			System.out.print("Password: " );
			String password =scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("Login approved");
					break;
				} else {
					System.out.println("password is not valid or matched.");
				}
			} else {
				System.out.println(" input Id doesn't exist in our database.");
			}
		}

	}

}
