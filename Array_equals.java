package Array;

import java.util.Arrays;

public class Array_equals 
{
	public static void main(String[] args) 
	{
		int student_id[]=new int [4];
		student_id[0]=45;
		student_id[1]=55;
		student_id[2]=65;
		student_id[3]=25;
		
		int student_id1[]=new int[4];
		student_id1[0]=45;
		student_id1[1]=55;
		student_id1[2]=65;
		student_id1[3]=25;
		
		boolean b1=Arrays.equals(student_id, student_id1);
		System.out.println(b1);
	}
}
