package Array;

public class CountofAlphaandNumb 
{
	public static void main(String[] args)
	{
		int countofalphabate=0;
		int countofnumbers=0;
		int countofspace=0;
		int countofspacialchar=0;
		String s="Suyog Nivale 5042547865 #$%..";
		char []c1=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		boolean b1=Character.isLetter(c1[i]);
		if(b1==true)
		{
			countofalphabate++;
		}
		}
		System.out.println("The count of aplabate is = "+ countofalphabate);
		
		for(int i=0;i<s.length();i++)
		{
		boolean b2=Character.isDigit(c1[i]);
		if(b2==true)
		{
			countofnumbers++;
		}
		}
		System.out.println("The count of number is = "+ countofnumbers);
		
		for(int i=0;i<s.length();i++)
		{
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			countofspace++;
		}
		}
		System.out.println("The count of space is = "+ countofspace);
		
		int total_number_of_count=s.length();
		System.out.println("The total length of string is = " +total_number_of_count);
		int countofspacialchar1=total_number_of_count-(countofalphabate+countofnumbers+countofspace);
		System.out.println("The count of special charater is = "+countofspacialchar1);
	}
}
