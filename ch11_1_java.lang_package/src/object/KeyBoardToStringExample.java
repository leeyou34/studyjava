package object;

public class KeyBoardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("press: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		// TODO Auto-generated method stub

	}

}
