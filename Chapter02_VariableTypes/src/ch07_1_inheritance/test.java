package ch07_1_inheritance;

	public class test {
		public static void main(String[] args) {
			// repeat 50 times...
//			int total = 0; x = 
//				while (++x < 5)
//					y= x*x;
//					System.out.println(var + ", ");
			
			for(int i =0; i <50; i++) {
				int var = (int)(Math.random()*100)+1;
				System.out.print(var + ", ");
			}
		}
}
