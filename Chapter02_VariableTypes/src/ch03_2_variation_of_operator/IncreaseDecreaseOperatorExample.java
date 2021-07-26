package ch03_2_variation_of_operator;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10, y = 10, z;
		
		
		System.out.println("------------------1");
		x++; // x is equal to 10 and we add numerical value 1 on literal and it incrased so it's 11
		++x; // the we add another increasing numerical value on x then it turns out to be 12
		System.out.println("x= " + x);
		
		
		System.out.println("------------------2");
		y--;
		--y;
		System.out.println("y= " + y);
		

		System.out.println("------------------3");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);


		System.out.println("------------------4");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);


		System.out.println("------------------5");
		z = ++x + y++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}
