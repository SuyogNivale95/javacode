package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[3];
		
		for(int i=0;i<3;i++)
		{
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
}
