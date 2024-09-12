package Array;

public class CountOfAplabate
{
	public static void main(String[] args)
	{
		int count_of_alphabate=0;
		String s="Aditi";
		char[]c1=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		boolean b1=Character.isLetter(c1[i]);
		if(b1==true)
		{ 
			count_of_alphabate++;
		}
		}
		System.out.println("The count of alphabate is - "+count_of_alphabate);
	}
}
