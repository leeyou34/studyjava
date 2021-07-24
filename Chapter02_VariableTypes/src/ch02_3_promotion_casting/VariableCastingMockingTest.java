package ch02_3_promotion_casting;

	public class VariableCastingMockingTest {
		public static void main(String[] arg) {
			//Question 1.
//			byte byteValue = 10;
//			char charValue = 'A';
//			below coded statements are the actual question.
//			
//			int intValue = byteValue; //-> this is correct
//			int intValue = charValue; //-> this is correct
//			short shortValue = charValue; //-> this is wrong... the memory byte for short and char are same but char doesn't contain negative literal.
//			double doubleValue = byteValue; //-> this is correct
//			
//			
//			System.out.println(byteValue);
//			System.out.println(charValue);
//			
			
			//Question 2.
//			int intValue = 10;
//			char charValue = 'A';
//			double doubleValue = 5.7;
//			String strValue = "A";
//			
//			double var1 = (double)intValue;
//			byte var2 = (byte)intValue;
//			int var3 = (int)doubleValue;
//			char var4 = (char)strValue; // according to java program stated that string can't be converted to char. 
//			
//			System.out.println(var1);
//			System.out.println(var2);
//			System.out.println(var3);
//			System.out.println(var4);
			
			//Question 3.
//			byte byteValue  = 10;
//			float floatValue = 2.5F;
//			double doubleValue = 2.5;
//			
//			byte result1 = byteValue +byteValue; //-> adding both bytValue must come out as integer value result
//			int result2 = 5 + byteValue; //-> right
//			float result3 = 5 + floatValue; //-> right
//			double result4= 5 + doubleValue; //-> right
//
//			System.out.println(result1);
//			System.out.println(result2);
//			System.out.println(result3);
//			System.out.println(result4);

			//Question 4.
//			short s1 =1;
//			short s2 =2;
//			int i1 = 3;
//			int i2 = 4;
//			short result = s1 + s2; //the variable which consisted of "short"type of variable must resulted as integer
//			int result = i1 + i2;
			
			//Question 5.
//			char c1 = 'a';
//			char c2 = (char)(c1 + 1);
//			System.out.println(c2);
//		
			//Question 6.
//			int x = 5;
//			int y = 2;
//			
//			float result = (float)x/y; // (float)x/y 의 값은 2.5이나... (float)(5/2)값은 2.0 다르다.
//			System.out.println(result);
			
			//Question 7.
//			int x = 5;
//			int y = 2;
//			double result = (double)x/y; // the answer showed that variable type double was correct to be applied but why not float?
//			System.out.println(result);

			
			//Question 8.
//			double var1 = 3.5;
//			double var2 = 2.7;
//			int result = (int)(var1+var2);
//					
//			System.out.println(result);

			//Question 9.
			
//			long var1 = 2L;
//			float var2 = 1.8f; // 
//			double var3 = 2.5; // 
//			String var4 = "3.9"; // the variable type string must start with capital letter S. When string's literal converts to integer type, 실수 value drops no matter what.
//			
//			int result = (int)(var1)+(int)(var2+var3)+(int)Double.parseDouble(var4);
//			// 간단 수 계산을 하면 literal(값)이 8이 나오는게 맞다. 그러나. 교묘하게 공식을 새우면 9로 만들 수 있고. 그건... 실수한해서만 가능하다./
//			System.out.println(result);

//			String str1 = 2 + 3 + "";
//			String str2 = 2 + "" + 3;
//			String str3 = "" + 2 + 3;
//			
//			System.out.println(str1);
//			System.out.println(str2);
//			System.out.println(str3);
			
		}
}

	
	
	
	
	
	