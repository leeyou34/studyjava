package ch02_3_promotion_casting;

public class CastingExample1 {

	public static void main(String[] args) {
//		강제 (명시적) 형변환
//		:~ 해석하는 방법을 변환

		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

//		예시) 
		System.out.println((char)65);
//		확장(promotion) : int ----> double(x) 자동
//		축소(demotion) : double ----> int 손실(o) 강제.. 0.5 --> 0

		int iv = 127;
		iv = 1000000;
		byte bv = (byte)iv;

//		(char)<---------int....long...
		double dv = 3.14;
		iv = (int) dv;
		System.out.println(iv);
		
		// "781001-11111111
		int birth = 0;
		System.out.println("781001-11111111");
		
		
	}

}
