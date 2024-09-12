package Array;

import java.util.Arrays;

public class CopyArrayinReverse 
{
	public static void main(String[] args) 
	{
		int array1[]=new int [4];
		array1[0]=45;
		array1[1]=56;
		array1[2]=65;
		array1[3]=75;
		int array2[]=new int[4];
		for(int i=0,k=3;i<array1.length;i++,k--)
		{
			array2[k]=array1[i];
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}
}
