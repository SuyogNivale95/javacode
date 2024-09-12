package assignments;

import java.util.Arrays;

public class Assignment25 
{
	public static void main(String[] args)
	{
		char c1[]=new char[4];
		c1[0]='b';
		c1[1]='c';
		c1[2]='d';
		c1[3]='e';
		
		char c2[]=new char[4];
		c2[0]='b';
		c2[1]='c';
		c2[2]='d';
		c2[3]='e';
		
		boolean c3=Arrays.equals(c1, c2);
		System.out.println(c3);
	}
}
