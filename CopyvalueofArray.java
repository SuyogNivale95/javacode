package Array;

import java.util.Arrays;

public class CopyvalueofArray 
{
	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=45;
		rollno[1]=56;
		rollno[2]=75;
		rollno[3]=95;
		int rollno2[]=new int[4];
		
		for(int i=0;i<4;i++)
		{
			rollno2[i]=rollno[i];
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno2));
	}
}
