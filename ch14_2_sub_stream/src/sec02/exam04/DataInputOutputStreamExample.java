package sec02.exam04;

import java.io.*;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("thomas");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("Food");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush(); dos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name =dis.readUTF();
			double score =dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		// TODO Auto-generated method stub

	}

}
