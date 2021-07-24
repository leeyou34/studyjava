package ch02_2_primitive;

public class ByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = -128;		
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 0; <- Type mismatch: cannot convert 128 from int to byte
		byte var6 = (byte) 128; // if a programmer needs to print numerical value 128, (byte) needs to be applied at front of 128 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
	}

}
