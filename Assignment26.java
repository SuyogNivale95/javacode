package assignments;

import java.util.Arrays;

public class Assignment26 
{
	public static void main(String[] args) 
	{
		String s1[]=new String[4];
		s1[0]="Suyog";
		s1[1]="Mahesh";
		s1[2]="Priyanka";
		s1[3]="Prarthana";
		
		String s2[]=new String[4];
		s2[0]="Suyog";
		s2[1]="Mahesh";
		s2[2]="Priyanka";
		s2[3]="Prarthana";
		
		boolean b1=Arrays.equals(s1, s2);
		System.out.println(b1);
	}
}
