package Array;

import java.util.Scanner;

public class Array_problem
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[3];
		
		for(int i=0;i<3;i++)
		{
			rollno[i]=s1.nextInt();
		}
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
	}

}
