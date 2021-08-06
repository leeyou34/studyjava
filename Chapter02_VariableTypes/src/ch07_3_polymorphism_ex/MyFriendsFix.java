package ch07_3_polymorphism_ex;
// college friends
class UnivFriend extends Friends{
	//field
	private String name;

	private String phone;
	// constructor
	public Friends(String na, String ph,) {
		name = na;
		phone = ph;
				
	}
		
		
	
	
	// method
	public void	showInfo() {
		System.out.println("name: " + name);
		
		System.out.println("phone: " + phone);
		
	}
}
//coworker
class CompFriend extends Friends {
	//field
	private String name;
	private String department;
	private String phone;
	// constructor
	public CompFriend(String na, String ma, String ph) {
		name = na;
		department = ma;
		phone = ph;
	}
	// method
	public void	showInfo() {
		System.out.println("name: " + name);
		System.out.println("department: " + department);
		System.out.println("phone: " + phone);
		
	}
}		

public class MyFriends {
	public static void main(String[] args) {
		// array and variable for management for collegefriends
		UnivFriend[] ufrns = new UnivFriend[5];
		int ucnt = 0;
		
		// array and variable for management for compfriend[5]
		CompFriend[] cfrns = new CompFriend[5];
		int ccnt = 0;
		
		// adding more college friends
		ufrns[ucnt++] = new UnivFriend("LEE", "Computer", "010-1");
		ufrns[ucnt++] = new UnivFriend("SEO", "Electronics", "010-2");
		ufrns[ucnt++] = new UnivFriend("KIM", "Math", "010-3");
	
		//adding more coworker
		
		cfrns[ccnt++] = new CompFriend("LEE", "R&D", "010-1");
		cfrns[ccnt++] = new CompFriend("SEO", "Sales", "010-2");
		cfrns[ccnt++] = new CompFriend("KIM", "Management", "010-3");			
		
		System.out.println
		
	}
}
