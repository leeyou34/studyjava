package ch04_2_Repeat_for_while_do_while;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m + "´Ü ***");
			for (int n=1; n<=9; n++) {
				//System.out.print(m + " x " + n + " = " + (m*n)+"\t"); // code line 9 and 10 are similar.
				System.out.printf("%d x %d = %d\t", m,n,(m*n));
			}
		}
//	for (int m=2, n=1; m <=9 || n <= 9 ; m++, n++) { //this equation is just trial... 
//		System.out.printf("%d x %d = %d\n", m,n,(m*n));
//		System.out.println(m + "x" + n + " =" + (m*n));
//		}
//	}
	}
}
