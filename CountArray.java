package Array;

public class CountArray 
{
	public static void main(String[] args)
	{
		int countofaiplabate=0;
		int countofnumber=0;
		int countofspace=0;
		
		String a="Suyog Nivale 1234567890 @#$%";
		char[] c1=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
		boolean b1=Character.isLetter(c1[i]);
		if(b1==true)
		{
			countofaiplabate++;
		}
		}
		System.out.println("The count of alphabate is = " + countofaiplabate);
		
		for(int i=0;i<a.length();i++)
		{
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true)
			{
				countofnumber++;
			}
		}
		System.out.println("The count of Number is = " + countofnumber);
		
		for(int i=0;i<a.length();i++)
		{
			boolean b3=Character.isWhitespace(c1[i]);
		    if(b3==true)
		    {
		    	countofspace++;
		    }
		}
		System.out.println("The number of space is = "+countofspace);
		
		int totalnumberofcount=a.length();
		System.out.println("The total mumber of count in string is = "+totalnumberofcount);
		
		int specialchar=totalnumberofcount-countofaiplabate-countofnumber-countofspace;
		System.out.println("The count of special character is = "+specialchar );		
	}
}
