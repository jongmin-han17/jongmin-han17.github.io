public class MyStringMain 
{
	public static void main(String[] args) 
	{
		char[] MyInput = new char[50];
		char[] MyInput2 = new char[50];
		char[] MyInput3 = new char[50];
		
		MyInput[0] = 'H';
		MyInput[1] = 'e';
		MyInput[2] = 'l';
		MyInput[3] = 'l';
		MyInput[4] = 'o';
		MyInput[5] = ' ';
		MyInput[6] = '#';
		
		MyInput2[0] = 'H';
		MyInput2[1] = 'a';
		MyInput2[2] = 'l';
		MyInput2[3] = 'o';
		MyInput2[4] = ' ';
		MyInput2[5] = '#';
		
		MyInput3[0] = 'H';
		MyInput3[1] = 'e';
		MyInput3[2] = 'l';
		MyInput3[3] = 'l';
		MyInput3[4] = 'o';
		MyInput3[5] = ' ';
		MyInput3[6] = '#';
				
				
		MyString S1 = new MyString(MyInput);
		MyString S2 = new MyString(MyInput2);
		MyString S3 = new MyString(MyInput3);
		
		
		if (S1.equals(S2))
			System.out.println("S1 and S2 are equal.");
		else
			System.out.println("S1 and S2 are NOT equal.");
		//Prints "S1 and S2 are NOT equal."
		
		S2.reset(S3);
		
		if (S1.equals(S2))
			System.out.println("S1 and S2 are equal.");
		else
			System.out.println("S1 and S2 are NOT equal.");
		//Prints "S1 and S2 are equal."
	}
}