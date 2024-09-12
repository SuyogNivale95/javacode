package Array;

public class Array_alphabetCount
{
	public static void main(String[] args)
	{
		int countofalphabate=0;
		String a="Suyog";
		char[]c1=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
		boolean b1=Character.isLetter(c1[i]);
		if(b1==true)
		{
			countofalphabate++;
		}
		}
		System.out.println("The number of alphabets are - "+countofalphabate);
	}
}
