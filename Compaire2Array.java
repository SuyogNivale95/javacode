package Array;

import java.util.Arrays;

public class Compaire2Array 
{
	public static void main(String[] args) 
	{
		int rollno_1[]=new int[3];
		rollno_1[0]=45;
		rollno_1[1]=56;
		rollno_1[2]=89;
		
		int rollno_2[]=new int[3];
		rollno_2[0]=45;
		rollno_2[1]=56;
		rollno_2[2]=89;
		
		boolean b1=Arrays.equals(rollno_1, rollno_2);
		System.out.println(b1);
	}
}
