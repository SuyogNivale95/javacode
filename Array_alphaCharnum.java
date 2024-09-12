package Array;

public class Array_alphaCharnum 
{
	public static void main(String[] args) 
	{
		String a="Suyog";
		char []c1=a.toCharArray();  //to convert string into array
		for(int i=0;i<a.length();i++)
		{
		boolean b1=Character.isLetter(c1[i]);
		System.out.println(b1);
		}
	}
}
