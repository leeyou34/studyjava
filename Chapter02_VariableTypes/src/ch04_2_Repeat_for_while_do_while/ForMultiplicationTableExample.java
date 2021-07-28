package ch04_2_Repeat_for_while_do_while;

public class ForMultiplicationTableExample {

	public static void main(String[] args) { //ÁßÃ¸ for¹®
		int m = 1;
		for(m=1; m<10; m++) {
			System.out.printf("***%d´Ü***\t", m);
		}
		
		
		for (int n=1; n<=9; n++) {
		System.out.println("");
			for (m=1; m<=9; m++) {
				System.out.print(m + " x " + n + " = " + (m*n)+"\t"); // code line 9 and 11 are similar.
				//System.out.println("***" + m + "´Ü ***");
				//System.out.printf("%d x %d = %d\t", m,n,(m*n));
		}
//	for (int m=2, n=1; m <=9 || n <= 9 ; m++, n++) { //this equation is just trial... 
//		System.out.printf("%d x %d = %d\n", m,n,(m*n)); // This is too much work.. over worked.. no one works in this style in real job.
//		System.out.println(m + "x" + n + " =" + (m*n)); // The coding work has to be done simply.
		}
	}
	}

