public class MyString 
{
	public static final int MAXSIZE=50;
	public static final char DELIM = '#';
	
	public MyString(char[] inChars) 
	{
		while (inChars[length] != DELIM && length < MAXSIZE) 
			sArray[length]=inChars[length++];
	}
	
	public MyString() {	}
	
	public int getLength()
	{
		return length;
	}
	
	public void display() 
	{
		for(int i=0; i<length+1; i++) 
			System.out.print(sArray[i]);
		System.out.println();
	}
	
	public void appendChar(char c) 
	{
		sArray[length++] = c;
	}
	
	public char charAt(int loc) 
	{
		if (loc<0||loc>=length) 
			return DELIM;
		else 
			return sArray[loc];
	}
	
	public MyString concat(MyString S) 
	{
		MyString newS = new MyString();
		for (int i=0; i<this.getLength(); i++)
			newS.appendChar(this.charAt(i));
		for (int i=0; i<S.getLength(); i++)
			newS.appendChar(S.charAt(i));	
		return newS;
	}
	
	public boolean equals(MyString S)
	{
		//Return false if length of two strings are different.
		if (this.length != S.length)
			return false;
		
		for (int i=0; i < S.length; i++)
		{
			//Return false if two string have different character.
			if (this.charAt(i) != S.charAt(i))
				return false;
		}
		//Return true if two strings passed criteria above
		return true;
	}
	
	public void reset(MyString S)
	{
		//Initialize this string
		for (int i=0; i < this.length; i++)
			this.sArray[i] = 0;
		
		//Copy length
		this.length = S.length;
		
		//Copy characters
		for (int i=0; i < S.length; i++)
			this.sArray[i] = S.sArray[i];
	}

	private int length=0;
	private char[] sArray = new char[MAXSIZE]; 
}