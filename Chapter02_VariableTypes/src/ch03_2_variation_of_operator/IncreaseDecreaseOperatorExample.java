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
		System.out.println("z= " + z); // 먼저 행위가 일어난 뒤에 나중에 증가한다. 그래서 리터럴 x가 z 에 입력이 되고 난 후 1이 증감된다. "x= " + x 가 12라는 걸 위에서 명시 했고. 그 12 리터럴 값이 z에 적용하고 나중에 증감한다.
		System.out.println("x= " + x);


		System.out.println("------------------4");
		z = ++x;
		System.out.println("z= " + z); //14; there was adding one value were saved after stating z = x ++... since z = ++x were stated. total 2 decimal integer will be applied on x. therefore it's 14.
		System.out.println("x= " + x); // adding another decimal integer literal on x, 13, then it will be 14.


		System.out.println("------------------5");
		z = ++x + y++;
		System.out.println("z= " + z); // 14 + 9; ++x were derived from line 30... and +1 added on 8 from line 18.
		System.out.println("x= " + x); // 15
		System.out.println("y= " + y); // 9

	}

}
